package com.example

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.dao.PlayerProgressDao
import com.example.data.local.database.MadaratDatabase
import com.example.data.local.entity.PlayerProgressEntity
import com.example.data.repository.PlayerProgressRepository
import com.example.ui.game.PuzzleGameViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Unit & Integration tests verifying Room player progress persistence:
 * - Room entity and DAO operations
 * - Multi-category independent progress tracking
 * - Score retention: higher scores update highestScore, lower scores never overwrite
 * - Incremental attempt/session tracking
 * - Integration with PlayerProgressRepository and PuzzleGameViewModel
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class PlayerProgressPersistenceTest {

    private lateinit var database: MadaratDatabase
    private lateinit var dao: PlayerProgressDao
    private lateinit var repository: PlayerProgressRepository

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, MadaratDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        dao = database.playerProgressDao()
        repository = PlayerProgressRepository(dao)
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun testInsertAndRetrieveProgressByCategoryId() = runTest {
        val progress = PlayerProgressEntity(
            categoryId = "cars",
            highestScore = 85,
            completedPuzzlesCount = 10,
            bestCompletionPercentage = 100,
            lastPlayedTimestamp = 123456789L,
            totalAttempts = 1,
            completedSessions = 1
        )
        dao.insertOrUpdateProgress(progress)

        val retrieved = dao.getProgressById("cars")
        assertNotNull(retrieved)
        assertEquals("cars", retrieved?.categoryId)
        assertEquals(85, retrieved?.highestScore)
        assertEquals(10, retrieved?.completedPuzzlesCount)
        assertEquals(100, retrieved?.bestCompletionPercentage)
        assertEquals(1, retrieved?.totalAttempts)
    }

    @Test
    fun testIndependentCategoryRecordsDoNotOverwriteEachOther() = runTest {
        // Save progress for cars
        repository.saveSessionProgress(
            categoryId = "cars",
            score = 72,
            completedPuzzlesCount = 10,
            completionPercentage = 100
        )

        // Save progress for science
        repository.saveSessionProgress(
            categoryId = "science",
            score = 45,
            completedPuzzlesCount = 6,
            completionPercentage = 60
        )

        // Save progress for astronomy
        repository.saveSessionProgress(
            categoryId = "astronomy",
            score = 90,
            completedPuzzlesCount = 10,
            completionPercentage = 100
        )

        val carsRecord = repository.getProgressById("cars")
        val scienceRecord = repository.getProgressById("science")
        val astronomyRecord = repository.getProgressById("astronomy")

        assertNotNull(carsRecord)
        assertNotNull(scienceRecord)
        assertNotNull(astronomyRecord)

        assertEquals(72, carsRecord?.highestScore)
        assertEquals(10, carsRecord?.completedPuzzlesCount)

        assertEquals(45, scienceRecord?.highestScore)
        assertEquals(6, scienceRecord?.completedPuzzlesCount)

        assertEquals(90, astronomyRecord?.highestScore)
        assertEquals(10, astronomyRecord?.completedPuzzlesCount)
    }

    @Test
    fun testLowerScoreNeverOverwritesHigherScore() = runTest {
        // First session: excellent run with 95 points
        repository.saveSessionProgress(
            categoryId = "history",
            score = 95,
            completedPuzzlesCount = 10,
            completionPercentage = 100
        )

        val firstRecord = repository.getProgressById("history")
        assertEquals(95, firstRecord?.highestScore)
        assertEquals(1, firstRecord?.completedSessions)

        // Second session: player used hints, earned 60 points
        repository.saveSessionProgress(
            categoryId = "history",
            score = 60,
            completedPuzzlesCount = 8,
            completionPercentage = 80
        )

        val secondRecord = repository.getProgressById("history")
        // Highest score must remain 95!
        assertEquals("Higher score must be preserved", 95, secondRecord?.highestScore)
        // Best completion must remain 100!
        assertEquals("Best completion percentage must be preserved", 100, secondRecord?.bestCompletionPercentage)
        assertEquals("Completed puzzles count must remain at highest", 10, secondRecord?.completedPuzzlesCount)
        // Sessions and attempts incremented
        assertEquals(2, secondRecord?.completedSessions)
        assertEquals(2, secondRecord?.totalAttempts)
    }

    @Test
    fun testHigherScoreUpdatesHighestScore() = runTest {
        // First run
        repository.saveSessionProgress(
            categoryId = "arabic_language",
            score = 50,
            completedPuzzlesCount = 6,
            completionPercentage = 60
        )

        val initial = repository.getProgressById("arabic_language")
        assertEquals(50, initial?.highestScore)

        // Second run with higher score
        repository.saveSessionProgress(
            categoryId = "arabic_language",
            score = 80,
            completedPuzzlesCount = 9,
            completionPercentage = 90
        )

        val updated = repository.getProgressById("arabic_language")
        assertEquals(80, updated?.highestScore)
        assertEquals(9, updated?.completedPuzzlesCount)
        assertEquals(90, updated?.bestCompletionPercentage)
        assertEquals(2, updated?.completedSessions)
    }

    @Test
    fun testGetAllProgressFlowEmitsUpdatedList() = runTest {
        repository.saveSessionProgress(
            categoryId = "cars",
            score = 60,
            completedPuzzlesCount = 7,
            completionPercentage = 70
        )
        repository.saveSessionProgress(
            categoryId = "astronomy",
            score = 85,
            completedPuzzlesCount = 10,
            completionPercentage = 100
        )

        val allProgress = repository.getAllProgress().first()
        assertEquals(2, allProgress.size)
        val categoryIds = allProgress.map { it.categoryId }.toSet()
        assertTrue("cars" in categoryIds)
        assertTrue("astronomy" in categoryIds)
    }

    @Test
    fun testResetCategoryProgressRemovesRecord() = runTest {
        repository.saveSessionProgress(
            categoryId = "cars",
            score = 70,
            completedPuzzlesCount = 8,
            completionPercentage = 80
        )
        assertNotNull(repository.getProgressById("cars"))

        repository.resetCategoryProgress("cars")
        assertNull(repository.getProgressById("cars"))
    }

    @Test
    fun testViewModelSavesProgressToRepositoryOnSessionComplete() = runTest {
        val vm = PuzzleGameViewModel(
            categoryId = "cars",
            progressRepository = repository
        )

        // Complete 10 puzzles
        for (i in 0 until 10) {
            val puzzle = vm.uiState.value.currentPuzzle!!
            // Place correct answer letters
            for (char in puzzle.correctAnswer) {
                val tileIdx = puzzle.availableLetters.indices.first { idx ->
                    puzzle.availableLetters[idx] == char.toString() && idx !in vm.uiState.value.selectedTileIndices
                }
                vm.selectLetter(tileIdx)
            }
            vm.submitAnswer()
            vm.nextPuzzle()
        }

        assertTrue(vm.uiState.value.isSessionCompleted)
        assertTrue(vm.uiState.value.score > 0)

        // Explicitly trigger or wait for repository save
        vm.saveProgressNow()

        val saved = repository.getProgressById("cars")
        assertNotNull("Saved record must exist in Room", saved)
        assertEquals(vm.uiState.value.score, saved?.highestScore)
        assertEquals(10, saved?.completedPuzzlesCount)
        assertEquals(100, saved?.bestCompletionPercentage)
    }

    @Test
    fun testSavePartialProgressMidSessionPreservesData() = runTest {
        val vm = PuzzleGameViewModel(
            categoryId = "science",
            progressRepository = repository
        )

        // Solve only 2 puzzles then save partial progress
        for (i in 0 until 2) {
            val puzzle = vm.uiState.value.currentPuzzle!!
            for (char in puzzle.correctAnswer) {
                val tileIdx = puzzle.availableLetters.indices.first { idx ->
                    puzzle.availableLetters[idx] == char.toString() && idx !in vm.uiState.value.selectedTileIndices
                }
                vm.selectLetter(tileIdx)
            }
            vm.submitAnswer()
            vm.nextPuzzle()
        }

        assertFalse(vm.uiState.value.isSessionCompleted)
        assertEquals(2, vm.uiState.value.correctCount)
        assertTrue(vm.uiState.value.score > 0)

        // Trigger partial progress save
        vm.saveProgressNow()

        val saved = repository.getProgressById("science")
        assertNotNull(saved)
        assertEquals(vm.uiState.value.score, saved?.highestScore)
        assertEquals(2, saved?.completedPuzzlesCount)
    }
}
