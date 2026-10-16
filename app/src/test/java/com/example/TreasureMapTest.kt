package com.example

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.dao.PlayerProgressDao
import com.example.data.local.database.MadaratDatabase
import com.example.data.local.entity.PlayerProgressEntity
import com.example.data.model.GameDifficulty
import com.example.data.repository.PlayerProgressRepository
import com.example.data.repository.PuzzleRepository
import com.example.ui.game.PuzzleGameViewModel
import com.example.ui.navigation.MadaratScreen
import com.example.ui.screens.HouseMapStatus
import com.example.ui.theme.HouseThemes
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class TreasureMapTest {

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
    fun testAllTwelveHousesExistAndUnique() {
        val categories = PuzzleRepository.getCategories()
        // 1. Must be exactly 12 houses
        assertEquals(12, categories.size)

        // 2. All 12 IDs must be unique
        val ids = categories.map { it.id }
        assertEquals(12, ids.distinct().size)

        // 3. Expected house identifiers must all be present
        val expectedCategories = listOf(
            "astronomy", "science", "history", "geography", "cars",
            "arabic_literature", "math_logic", "landmarks", "animals",
            "inventions", "mysteries", "general_knowledge"
        )
        for (expected in expectedCategories) {
            assertTrue("Expected category $expected not found", ids.contains(expected))
            val cat = PuzzleRepository.getCategoryById(expected)
            assertNotNull(cat)
            assertTrue(cat!!.arabicName.isNotBlank())
            assertTrue(cat.iconEmoji.isNotBlank())
            assertTrue(cat.challenges.isNotEmpty())
        }
    }

    @Test
    fun testEveryHouseHasDistinctThemeAndEmoji() {
        val categories = PuzzleRepository.getCategories()
        val emojis = categories.map { it.iconEmoji }
        // Each house must have an appropriate distinct visual icon
        assertEquals(12, emojis.distinct().size)

        for (cat in categories) {
            val theme = HouseThemes.getThemeForCategory(cat.id)
            assertNotNull(theme)
            assertEquals(cat.id, theme.categoryId)
            assertTrue(theme.backgroundGradient.isNotEmpty())
        }
    }

    @Test
    fun testNewPlayerProgressOnMap() {
        val progressMap = emptyMap<String, PlayerProgressEntity>()
        val categories = PuzzleRepository.getCategories()

        // For a new player: 0 stars, 0 total score, 0 completed houses
        val totalStars = progressMap.values.sumOf { it.completedChallengesCount }
        val totalScore = progressMap.values.sumOf { it.highestScore }
        val completedHouses = categories.count { cat ->
            val p = progressMap[cat.id]
            p != null && (p.bestCompletionPercentage >= 100 || p.completedPuzzlesCount >= 30)
        }

        assertEquals(0, totalStars)
        assertEquals(0, totalScore)
        assertEquals(0, completedHouses)

        // All nodes are in UNLOCKED state ready for adventure
        for (cat in categories) {
            val p = progressMap[cat.id]
            val status = when {
                p != null && (p.bestCompletionPercentage >= 100 || p.completedPuzzlesCount >= 30) -> HouseMapStatus.COMPLETED
                p != null && (p.completedPuzzlesCount > 0 || p.highestScore > 0) -> HouseMapStatus.IN_PROGRESS
                else -> HouseMapStatus.UNLOCKED
            }
            assertEquals(HouseMapStatus.UNLOCKED, status)
        }
    }

    @Test
    fun testPlayerProgressUpdateAfterSolvingChallenges() = runTest {
        // Player plays Astronomy house and finishes a session
        repository.saveSessionProgress(
            categoryId = "astronomy",
            score = 150,
            completedPuzzlesCount = 30,
            completionPercentage = 100,
            completedChallengesCountDelta = 3,
            correctAnswersDelta = 3,
            wrongAnswersDelta = 0,
            isCompletedSession = true
        )

        // Player plays Cars house with partial progress
        repository.saveSessionProgress(
            categoryId = "cars",
            score = 45,
            completedPuzzlesCount = 5,
            completionPercentage = 25,
            completedChallengesCountDelta = 1,
            correctAnswersDelta = 1,
            wrongAnswersDelta = 1,
            isCompletedSession = false
        )

        val progressList = repository.getAllProgress().first()
        val progressMap = progressList.associateBy { it.categoryId }

        assertEquals(2, progressMap.size)

        // Astronomy should be COMPLETED
        val astroProgress = progressMap["astronomy"]
        assertNotNull(astroProgress)
        assertEquals(150, astroProgress!!.highestScore)
        assertEquals(100, astroProgress.bestCompletionPercentage)
        val astroStatus = when {
            astroProgress.bestCompletionPercentage >= 100 || astroProgress.completedPuzzlesCount >= 30 -> HouseMapStatus.COMPLETED
            astroProgress.completedPuzzlesCount > 0 || astroProgress.highestScore > 0 -> HouseMapStatus.IN_PROGRESS
            else -> HouseMapStatus.UNLOCKED
        }
        assertEquals(HouseMapStatus.COMPLETED, astroStatus)

        // Cars should be IN_PROGRESS
        val carsProgress = progressMap["cars"]
        assertNotNull(carsProgress)
        assertEquals(45, carsProgress!!.highestScore)
        assertEquals(25, carsProgress.bestCompletionPercentage)
        val carsStatus = when {
            carsProgress.bestCompletionPercentage >= 100 || carsProgress.completedPuzzlesCount >= 30 -> HouseMapStatus.COMPLETED
            carsProgress.completedPuzzlesCount > 0 || carsProgress.highestScore > 0 -> HouseMapStatus.IN_PROGRESS
            else -> HouseMapStatus.UNLOCKED
        }
        assertEquals(HouseMapStatus.IN_PROGRESS, carsStatus)

        // History (unplayed) should be UNLOCKED
        val historyProgress = progressMap["history"]
        val historyStatus = when {
            historyProgress != null && (historyProgress.bestCompletionPercentage >= 100 || historyProgress.completedPuzzlesCount >= 30) -> HouseMapStatus.COMPLETED
            historyProgress != null && (historyProgress.completedPuzzlesCount > 0 || historyProgress.highestScore > 0) -> HouseMapStatus.IN_PROGRESS
            else -> HouseMapStatus.UNLOCKED
        }
        assertEquals(HouseMapStatus.UNLOCKED, historyStatus)

        // Aggregates
        val totalStars = progressMap.values.sumOf { it.completedChallengesCount }
        val totalScore = progressMap.values.sumOf { it.highestScore }
        assertEquals(4, totalStars)
        assertEquals(195, totalScore)
    }

    @Test
    fun testNavigationScreensIncludeTreasureMap() {
        val home: MadaratScreen = MadaratScreen.Home
        val map: MadaratScreen = MadaratScreen.TreasureMap
        val setup: MadaratScreen = MadaratScreen.GameplaySetup
        val round: MadaratScreen = MadaratScreen.GameRound

        assertNotEquals(home, map)
        assertNotEquals(setup, map)
        assertNotEquals(round, map)
    }

    @Test
    fun testViewModelStartSessionFromMapSelection() {
        val viewModel = PuzzleGameViewModel(progressRepository = repository)

        // Map selects History with CHALLENGE difficulty
        viewModel.startSession("history", GameDifficulty.CHALLENGE)
        val state = viewModel.uiState.value

        assertEquals("history", state.categoryId)
        assertEquals(GameDifficulty.CHALLENGE, state.difficulty)
        assertEquals(3, state.puzzles.size)
        assertEquals("التاريخ والحضارات", state.categoryName)
        assertEquals(0, state.score)
    }
}
