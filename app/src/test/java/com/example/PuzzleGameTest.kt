package com.example

import com.example.data.model.Puzzle
import com.example.data.repository.PuzzleRepository
import com.example.domain.ArabicTextNormalizer
import com.example.ui.game.HintConstants
import com.example.ui.game.PuzzleGameViewModel
import com.example.ui.game.SubmissionFeedback
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Focused unit tests verifying multi-category content expansion, category isolation,
 * 10-puzzle playable loop, answer verification, scoring, progress, repeated-letter behavior,
 * and replay mechanics.
 */
class PuzzleGameTest {

    private lateinit var viewModel: PuzzleGameViewModel

    @Before
    fun setUp() {
        viewModel = PuzzleGameViewModel()
    }

    // ========================================================================
    // 1. MULTI-CATEGORY CONTENT REPOSITORY TESTS
    // ========================================================================

    @Test
    fun testAllFiveCategoriesExist() {
        val categories = PuzzleRepository.getCategories()
        assertEquals(5, categories.size)

        val categoryIds = categories.map { it.id }.toSet()
        val expectedIds = setOf("cars", "science", "astronomy", "history", "arabic_language")
        assertEquals(expectedIds, categoryIds)

        // Verify Arabic names
        val categoryMap = categories.associateBy { it.id }
        assertEquals("السيارات والمواصلات", categoryMap["cars"]?.arabicName)
        assertEquals("العلوم", categoryMap["science"]?.arabicName)
        assertEquals("الفلك والفضاء", categoryMap["astronomy"]?.arabicName)
        assertEquals("التاريخ والحضارات", categoryMap["history"]?.arabicName)
        assertEquals("اللغة العربية", categoryMap["arabic_language"]?.arabicName)
    }

    @Test
    fun testEveryCategoryHasAtLeastTenPuzzles() {
        val categories = PuzzleRepository.getCategories()
        for (cat in categories) {
            assertTrue("Category ${cat.id} must have >= 10 puzzles", cat.puzzles.size >= 10)
        }
    }

    @Test
    fun testTotalPuzzlesCountIsAtLeastFifty() {
        val total = PuzzleRepository.getTotalPuzzlesCount()
        assertTrue("Total repository puzzle count must be >= 50, found $total", total >= 50)
    }

    @Test
    fun testAllPuzzleIdsAreGloballyUnique() {
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        val ids = allPuzzles.map { it.id }
        val uniqueIds = ids.toSet()
        assertEquals("All puzzle IDs must be strictly unique", ids.size, uniqueIds.size)
    }

    @Test
    fun testEachPuzzleReferencesValidCategory() {
        val validIds = setOf("cars", "science", "astronomy", "history", "arabic_language")
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        for (puzzle in allPuzzles) {
            assertTrue("Puzzle ${puzzle.id} has invalid categoryId: ${puzzle.categoryId}", puzzle.categoryId in validIds)
        }
    }

    @Test
    fun testEachPuzzleAvailableLettersContainAllAnswerLetters() {
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        for (puzzle in allPuzzles) {
            val answer = puzzle.correctAnswer
            val pool = puzzle.availableLetters

            // Verify each character can be formed from available letters considering frequencies
            val answerCounts = answer.groupingBy { it.toString() }.eachCount()
            val poolCounts = pool.groupingBy { it }.eachCount()

            for ((charStr, requiredCount) in answerCounts) {
                val availableCount = poolCounts[charStr] ?: 0
                assertTrue(
                    "Puzzle ${puzzle.id} ('$answer') lacks enough occurrences of '$charStr'. Needed: $requiredCount, Available: $availableCount",
                    availableCount >= requiredCount
                )
            }
        }
    }

    // ========================================================================
    // 2. SESSION & CATEGORY ISOLATION TESTS
    // ========================================================================

    @Test
    fun testSelectedCategoryLoadsOnlyItsOwnPuzzles() {
        // Test Astronomy
        viewModel.startSession("astronomy")
        val astronomyState = viewModel.uiState.value
        assertEquals("astronomy", astronomyState.categoryId)
        assertEquals("الفلك والفضاء", astronomyState.categoryName)
        assertEquals(10, astronomyState.puzzles.size)
        assertTrue(astronomyState.puzzles.all { it.categoryId == "astronomy" })

        // Verify no puzzles from other categories leaked
        assertFalse(astronomyState.puzzles.any { it.categoryId == "cars" })
        assertFalse(astronomyState.puzzles.any { it.categoryId == "science" })
        assertFalse(astronomyState.puzzles.any { it.categoryId == "history" })
        assertFalse(astronomyState.puzzles.any { it.categoryId == "arabic_language" })

        // Test History
        viewModel.startSession("history")
        val historyState = viewModel.uiState.value
        assertEquals("history", historyState.categoryId)
        assertEquals("التاريخ والحضارات", historyState.categoryName)
        assertEquals(10, historyState.puzzles.size)
        assertTrue(historyState.puzzles.all { it.categoryId == "history" })
    }

    @Test
    fun testSessionUsesExactlyTenPuzzles() {
        val validIds = listOf("cars", "science", "astronomy", "history", "arabic_language")
        for (catId in validIds) {
            viewModel.startSession(catId)
            assertEquals("Session for $catId must have exactly 10 puzzles", 10, viewModel.uiState.value.totalPuzzlesCount)
        }
    }

    @Test
    fun testStartingNewCategoryResetsScoreAndProgress() {
        // Solve puzzle in default category
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.selectLetter(2)
        viewModel.selectLetter(3)
        viewModel.selectLetter(4)
        viewModel.submitAnswer()
        assertTrue(viewModel.uiState.value.score > 0)
        viewModel.nextPuzzle()
        assertTrue(viewModel.uiState.value.currentPuzzleIndex > 0)

        // Now start science category
        viewModel.startSession("science")
        val newState = viewModel.uiState.value
        assertEquals("science", newState.categoryId)
        assertEquals(0, newState.score)
        assertEquals(0, newState.currentPuzzleIndex)
        assertEquals(1, newState.currentPuzzleNumber)
        assertEquals(0f, newState.progressFraction, 0.001f)
        assertEquals(0, newState.correctCount)
        assertEquals(SubmissionFeedback.Idle, newState.submissionFeedback)
        assertTrue(newState.selectedTileIndices.isEmpty())
        assertFalse(newState.isSessionCompleted)
    }

    @Test
    fun testReplaySessionPreservesSelectedCategory() {
        viewModel.startSession("astronomy")
        assertEquals("astronomy", viewModel.uiState.value.categoryId)

        // Advance through some puzzles
        viewModel.nextPuzzle()
        viewModel.nextPuzzle()
        assertEquals(2, viewModel.uiState.value.currentPuzzleIndex)

        // Replay
        viewModel.replaySession()
        val replayedState = viewModel.uiState.value
        assertEquals("astronomy", replayedState.categoryId)
        assertEquals("الفلك والفضاء", replayedState.categoryName)
        assertEquals(0, replayedState.currentPuzzleIndex)
        assertEquals(1, replayedState.currentPuzzleNumber)
        assertEquals(0, replayedState.score)
        assertEquals(0, replayedState.correctCount)
        assertFalse(replayedState.isSessionCompleted)
        assertTrue(replayedState.puzzles.all { it.categoryId == "astronomy" })
    }

    @Test
    fun testSamplePuzzlesContainAtLeastTenItems() {
        val puzzles = PuzzleRepository.getSamplePuzzles()
        assertTrue("Repository must have at least 10 puzzles", puzzles.size >= 10)
        assertEquals(10, puzzles.size)
    }

    // ========================================================================
    // 3. LETTER INTERACTION & REPEATED LETTERS TESTS
    // ========================================================================

    @Test
    fun testLetterSelectionUpdatesAnswerAndSlots() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        assertEquals("سيارة", puzzle.correctAnswer)

        // Select 'س' (index 0) and 'ي' (index 1)
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)

        assertEquals("سي", viewModel.uiState.value.currentAnswer)
        assertEquals(2, viewModel.uiState.value.selectedTileIndices.size)

        // Try selecting index 0 again - should not duplicate
        viewModel.selectLetter(0)
        assertEquals(2, viewModel.uiState.value.selectedTileIndices.size)
    }

    @Test
    fun testLetterSelectionDoesNotExceedAnswerLength() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        val maxLen = puzzle.correctAnswer.length // 5

        for (i in 0 until puzzle.availableLetters.size) {
            viewModel.selectLetter(i)
        }

        // Must cap at maxLen
        assertEquals(maxLen, viewModel.uiState.value.selectedTileIndices.size)
        assertEquals(maxLen, viewModel.uiState.value.currentAnswer.length)
    }

    @Test
    fun testLetterRemovalRemovesLastSelectedLetter() {
        viewModel.selectLetter(0) // س
        viewModel.selectLetter(1) // ي
        assertEquals("سي", viewModel.uiState.value.currentAnswer)

        viewModel.removeLastLetter()
        assertEquals("س", viewModel.uiState.value.currentAnswer)
        assertEquals(listOf(0), viewModel.uiState.value.selectedTileIndices)

        viewModel.removeLastLetter()
        assertEquals("", viewModel.uiState.value.currentAnswer)
        assertTrue(viewModel.uiState.value.selectedTileIndices.isEmpty())
    }

    @Test
    fun testRemoveLetterAtSpecificSlot() {
        viewModel.selectLetter(0) // س
        viewModel.selectLetter(1) // ي
        viewModel.selectLetter(2) // ا
        assertEquals("سيا", viewModel.uiState.value.currentAnswer)

        // Remove middle letter 'ي' at slot index 1
        viewModel.removeLetterAt(1)
        assertEquals("سا", viewModel.uiState.value.currentAnswer)
        assertEquals(listOf(0, 2), viewModel.uiState.value.selectedTileIndices)

        // Tile 1 ('ي') is now available again
        assertFalse(1 in viewModel.uiState.value.selectedTileIndices)
    }

    @Test
    fun testClearAnswerResetsAllSelections() {
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.selectLetter(2)
        assertEquals(3, viewModel.uiState.value.selectedTileIndices.size)

        viewModel.clearAnswer()
        assertTrue(viewModel.uiState.value.selectedTileIndices.isEmpty())
        assertEquals("", viewModel.uiState.value.currentAnswer)
        assertEquals(SubmissionFeedback.Idle, viewModel.uiState.value.submissionFeedback)
    }

    @Test
    fun testRepeatedLetterSelectionAndRemovalBehavior() {
        val customPuzzle = Puzzle(
            id = 99,
            categoryId = "cars",
            category = "مركبات",
            question = "حركة المركبات في الشارع",
            correctAnswer = "مرور",
            availableLetters = listOf("م", "ر", "و", "ر", "س", "ي", "ا", "ت"),
            rewardPoints = 20
        )
        val customVm = PuzzleGameViewModel(puzzles = listOf(customPuzzle))

        // Select 'م' (0), first 'ر' (1), 'و' (2), second 'ر' (3)
        customVm.selectLetter(0)
        customVm.selectLetter(1)
        customVm.selectLetter(2)
        customVm.selectLetter(3)

        assertEquals("مرور", customVm.uiState.value.currentAnswer)
        assertEquals(listOf(0, 1, 2, 3), customVm.uiState.value.selectedTileIndices)

        // Remove slot 1 (the first 'ر')
        customVm.removeLetterAt(1)

        assertEquals("مور", customVm.uiState.value.currentAnswer)
        assertEquals(listOf(0, 2, 3), customVm.uiState.value.selectedTileIndices)
        // Index 1 is freed; index 3 remains placed
        assertFalse(1 in customVm.uiState.value.selectedTileIndices)
        assertTrue(3 in customVm.uiState.value.selectedTileIndices)

        // Re-select index 1
        customVm.selectLetter(1)
        assertEquals("مورر", customVm.uiState.value.currentAnswer)
        assertEquals(listOf(0, 2, 3, 1), customVm.uiState.value.selectedTileIndices)

        // Clear and correctly solve
        customVm.clearAnswer()
        customVm.selectLetter(0)
        customVm.selectLetter(1)
        customVm.selectLetter(2)
        customVm.selectLetter(3)
        customVm.submitAnswer()
        assertEquals(SubmissionFeedback.Correct, customVm.uiState.value.submissionFeedback)
        assertEquals(20, customVm.uiState.value.score)
    }

    // ========================================================================
    // 4. SUBMISSION, SCORING, AND INTEGRITY TESTS
    // ========================================================================

    @Test
    fun testCannotSubmitIncompleteAnswer() {
        viewModel.selectLetter(0) // Only 1 of 5 letters
        viewModel.submitAnswer()

        assertEquals(SubmissionFeedback.Incorrect, viewModel.uiState.value.submissionFeedback)
        assertEquals(0, viewModel.uiState.value.score)
        assertEquals(0, viewModel.uiState.value.correctCount)
    }

    @Test
    fun testCannotModifyAnswerAfterCorrectSubmission() {
        // Solve puzzle 1
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.selectLetter(2)
        viewModel.selectLetter(3)
        viewModel.selectLetter(4)
        viewModel.submitAnswer()
        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)

        // Attempting to select another letter
        viewModel.selectLetter(5)
        assertEquals(5, viewModel.uiState.value.selectedTileIndices.size)

        // Attempting to remove last letter
        viewModel.removeLastLetter()
        assertEquals(5, viewModel.uiState.value.selectedTileIndices.size)

        // Attempting to remove letter at slot
        viewModel.removeLetterAt(0)
        assertEquals(5, viewModel.uiState.value.selectedTileIndices.size)

        // Attempting to clear
        viewModel.clearAnswer()
        assertEquals(5, viewModel.uiState.value.selectedTileIndices.size)
    }

    @Test
    fun testCorrectAnswerValidationAndScoring() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        // Puzzle 1: "سيارة"
        viewModel.selectLetter(0) // س
        viewModel.selectLetter(1) // ي
        viewModel.selectLetter(2) // ا
        viewModel.selectLetter(3) // ر
        viewModel.selectLetter(4) // ة

        assertEquals("سيارة", viewModel.uiState.value.currentAnswer)

        viewModel.submitAnswer()

        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)
        assertEquals(puzzle.rewardPoints, viewModel.uiState.value.score)
        assertEquals(1, viewModel.uiState.value.correctCount)

        // Duplicate submission should not increase score
        viewModel.submitAnswer()
        assertEquals(puzzle.rewardPoints, viewModel.uiState.value.score)
        assertEquals(1, viewModel.uiState.value.correctCount)
    }

    @Test
    fun testIncorrectAnswerValidation() {
        // Construct wrong answer: "قطمس"
        viewModel.selectLetter(5) // ق
        viewModel.selectLetter(6) // ط
        viewModel.selectLetter(7) // م
        viewModel.selectLetter(0) // س
        viewModel.selectLetter(1) // ي

        viewModel.submitAnswer()

        assertEquals(SubmissionFeedback.Incorrect, viewModel.uiState.value.submissionFeedback)
        assertEquals(0, viewModel.uiState.value.score)
        assertEquals(0, viewModel.uiState.value.correctCount)

        // Modifying answer should clear incorrect state
        viewModel.removeLastLetter()
        assertEquals(SubmissionFeedback.Idle, viewModel.uiState.value.submissionFeedback)
    }

    @Test
    fun testScoreIntegrityNoDuplicateAndNoNegative() {
        assertEquals(0, viewModel.uiState.value.score)

        // Incorrect answers add 0
        viewModel.selectLetter(5)
        viewModel.selectLetter(6)
        viewModel.selectLetter(7)
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.submitAnswer()
        assertEquals(0, viewModel.uiState.value.score)

        // Correct answer adds reward once
        viewModel.clearAnswer()
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.selectLetter(2)
        viewModel.selectLetter(3)
        viewModel.selectLetter(4)
        viewModel.submitAnswer()
        val scoreAfterFirst = viewModel.uiState.value.score
        assertEquals(15, scoreAfterFirst)

        // Multiple submit calls do not add score
        viewModel.submitAnswer()
        viewModel.submitAnswer()
        assertEquals(scoreAfterFirst, viewModel.uiState.value.score)

        // Advancing does not change score
        viewModel.nextPuzzle()
        assertEquals(scoreAfterFirst, viewModel.uiState.value.score)

        // Replay resets to 0
        viewModel.replaySession()
        assertEquals(0, viewModel.uiState.value.score)
    }

    @Test
    fun testArabicTextNormalizerHandlesTashkeelAndVariants() {
        assertTrue(ArabicTextNormalizer.isMatch("سَيَّارَة", "سيارة"))
        assertTrue(ArabicTextNormalizer.isMatch("  سيارة  ", "سيارة"))
        assertTrue(ArabicTextNormalizer.isMatch("طائرة", "طائرة"))
        assertFalse(ArabicTextNormalizer.isMatch("حافلة", "قطار"))
    }

    @Test
    fun testProgressCalculationAcrossPuzzles() {
        assertEquals(1, viewModel.uiState.value.currentPuzzleNumber)
        assertEquals(0f, viewModel.uiState.value.progressFraction, 0.001f)

        // Move to puzzle 2
        viewModel.nextPuzzle()
        assertEquals(2, viewModel.uiState.value.currentPuzzleNumber)
        assertEquals(0.1f, viewModel.uiState.value.progressFraction, 0.001f)

        // Move through remaining puzzles
        for (i in 2 until 10) {
            viewModel.nextPuzzle()
        }

        assertEquals(10, viewModel.uiState.value.currentPuzzleNumber)
        assertEquals(0.9f, viewModel.uiState.value.progressFraction, 0.001f)
    }

    @Test
    fun testCompletionAfterTenPuzzlesWithCorrectCategoryResults() {
        viewModel.startSession("science")
        val total = viewModel.uiState.value.totalPuzzlesCount
        assertEquals(10, total)

        for (i in 0 until total) {
            val puzzle = viewModel.uiState.value.currentPuzzle!!
            for (char in puzzle.correctAnswer) {
                val tileIndex = puzzle.availableLetters.indices.first {
                    puzzle.availableLetters[it] == char.toString() && it !in viewModel.uiState.value.selectedTileIndices
                }
                viewModel.selectLetter(tileIndex)
            }
            viewModel.submitAnswer()
            assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)
            viewModel.nextPuzzle()
        }

        assertTrue("Session must be marked completed", viewModel.uiState.value.isSessionCompleted)
        assertEquals(10, viewModel.uiState.value.correctCount)
        assertEquals(100, viewModel.uiState.value.completionPercentage)
        assertEquals(1.0f, viewModel.uiState.value.progressFraction, 0.001f)
        assertEquals("science", viewModel.uiState.value.categoryId)
        assertEquals("العلوم", viewModel.uiState.value.categoryName)
    }

    @Test
    fun testReplaySessionResetsAllStates() {
        // Complete puzzle 1
        viewModel.selectLetter(0)
        viewModel.selectLetter(1)
        viewModel.selectLetter(2)
        viewModel.selectLetter(3)
        viewModel.selectLetter(4)
        viewModel.submitAnswer()
        assertTrue(viewModel.uiState.value.score > 0)

        // Replay
        viewModel.replaySession()

        assertEquals(0, viewModel.uiState.value.currentPuzzleIndex)
        assertEquals(1, viewModel.uiState.value.currentPuzzleNumber)
        assertEquals(0, viewModel.uiState.value.score)
        assertEquals(0, viewModel.uiState.value.correctCount)
        assertEquals(SubmissionFeedback.Idle, viewModel.uiState.value.submissionFeedback)
        assertTrue(viewModel.uiState.value.selectedTileIndices.isEmpty())
        assertFalse(viewModel.uiState.value.isSessionCompleted)
    }

    // ========================================================================
    // 7. HINTS AND ASSISTANCE SYSTEM TESTS
    // ========================================================================

    @Test
    fun testRevealLetterPlacesCorrectCharacterAndLocksPosition() {
        val initialReward = viewModel.uiState.value.currentReward
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        val targetChar = puzzle.correctAnswer[0].toString()

        assertTrue(viewModel.uiState.value.canRevealLetter)
        assertFalse(viewModel.uiState.value.revealLetterUsed)

        viewModel.revealLetter()

        val state = viewModel.uiState.value
        assertTrue(state.revealLetterUsed)
        assertFalse(state.canRevealLetter)
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST, state.currentReward)
        assertTrue(0 in state.revealedPositions.keys)

        // Slot 0 is displayed as revealed and locked
        val slot0 = state.getSlotDisplayState(0)
        assertEquals(targetChar, slot0.letter)
        assertTrue(slot0.isRevealed)

        // Removing slot 0 has no effect
        viewModel.removeLetterAt(0)
        assertTrue(0 in viewModel.uiState.value.revealedPositions.keys)

        // Backspace has no effect on locked slot 0
        viewModel.removeLastLetter()
        assertTrue(0 in viewModel.uiState.value.revealedPositions.keys)

        // Clear answer does not clear locked revealed letter
        viewModel.clearAnswer()
        assertTrue(0 in viewModel.uiState.value.revealedPositions.keys)
    }

    @Test
    fun testRevealLetterWithRemainingUserSelectionsSolvesPuzzle() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        val initialReward = viewModel.uiState.value.currentReward

        // Reveal first letter (slot 0)
        viewModel.revealLetter()
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST, viewModel.uiState.value.currentReward)

        // Complete the remaining slots (1 until word length)
        for (i in 1 until puzzle.correctAnswer.length) {
            val char = puzzle.correctAnswer[i].toString()
            val tileIndex = puzzle.availableLetters.indices.first { idx ->
                puzzle.availableLetters[idx] == char && idx !in viewModel.uiState.value.selectedTileIndices
            }
            viewModel.selectLetter(tileIndex)
        }

        assertTrue(viewModel.uiState.value.isAnswerComplete)
        viewModel.submitAnswer()

        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST, viewModel.uiState.value.score)
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST, viewModel.uiState.value.lastEarnedReward)
    }

    @Test
    fun testRemoveWrongLettersEliminatesDistractorsSafely() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        val initialReward = viewModel.uiState.value.currentReward

        assertTrue(viewModel.uiState.value.canRemoveWrongLetters)
        assertFalse(viewModel.uiState.value.removeWrongLettersUsed)

        viewModel.removeWrongLetters()

        val state = viewModel.uiState.value
        assertTrue(state.removeWrongLettersUsed)
        assertFalse(state.canRemoveWrongLetters)
        assertEquals(initialReward - HintConstants.REMOVE_WRONG_LETTERS_COST, state.currentReward)

        val eliminated = state.eliminatedTileIndices
        assertTrue(eliminated.isNotEmpty())
        assertTrue(eliminated.size <= HintConstants.WRONG_LETTERS_TO_REMOVE_COUNT)

        // Verify remaining available letters still have enough counts for every letter in correct answer
        val answerLetterCounts = puzzle.correctAnswer.groupingBy { it.toString() }.eachCount()
        val remainingCounts = puzzle.availableLetters.indices
            .filter { it !in eliminated }
            .groupingBy { puzzle.availableLetters[it] }
            .eachCount()

        for ((char, required) in answerLetterCounts) {
            val remaining = remainingCounts[char] ?: 0
            assertTrue("Remaining letters must contain required count for $char", remaining >= required)
        }

        // Tapping an eliminated tile should be ignored
        val eliminatedIndex = eliminated.first()
        viewModel.selectLetter(eliminatedIndex)
        assertFalse(eliminatedIndex in viewModel.uiState.value.selectedTileIndices)
    }

    @Test
    fun testShowHintDisplaysTextAndDeductsScoreWithoutAlteringAnswer() {
        val initialReward = viewModel.uiState.value.currentReward

        assertFalse(viewModel.uiState.value.isHintVisible)
        assertFalse(viewModel.uiState.value.hintUsed)
        assertTrue(viewModel.uiState.value.canShowHint)

        viewModel.showHint()

        val state = viewModel.uiState.value
        assertTrue(state.isHintVisible)
        assertTrue(state.hintUsed)
        assertFalse(state.canShowHint)
        assertEquals(initialReward - HintConstants.SHOW_HINT_COST, state.currentReward)
        assertEquals("", state.currentAnswer)
    }

    @Test
    fun testRewardCannotDropBelowZeroAndEarnedTotalScoreNeverDeducted() {
        val lowRewardPuzzle = Puzzle(
            id = 999,
            category = "سيارات ومواصلات",
            question = "سؤال تجريبي",
            correctAnswer = "قطار",
            availableLetters = listOf("ق", "ط", "ا", "ر", "س", "ش"),
            hint = "تلميح تجريبي",
            rewardPoints = 4
        )
        val customVm = PuzzleGameViewModel(puzzles = listOf(lowRewardPuzzle))

        assertEquals(4, customVm.uiState.value.currentReward)

        // Reveal letter: 4 - 3 = 1
        customVm.revealLetter()
        assertEquals(1, customVm.uiState.value.currentReward)

        // Remove wrong letters: 1 - 2 = 0 (clamped, not -1)
        customVm.removeWrongLetters()
        assertEquals(0, customVm.uiState.value.currentReward)

        // Show hint: 0 - 1 = 0 (clamped, not -1)
        customVm.showHint()
        assertEquals(0, customVm.uiState.value.currentReward)

        // Solve remaining letters
        val puzzle = customVm.uiState.value.currentPuzzle!!
        for (i in 1 until puzzle.correctAnswer.length) {
            val char = puzzle.correctAnswer[i].toString()
            val tileIndex = puzzle.availableLetters.indices.first { idx ->
                puzzle.availableLetters[idx] == char && idx !in customVm.uiState.value.selectedTileIndices
            }
            customVm.selectLetter(tileIndex)
        }
        customVm.submitAnswer()

        assertEquals(SubmissionFeedback.Correct, customVm.uiState.value.submissionFeedback)
        assertEquals(0, customVm.uiState.value.score)
        assertEquals(0, customVm.uiState.value.lastEarnedReward)
    }

    @Test
    fun testHintsAreDisabledAfterCorrectSubmission() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!

        // Fill complete answer
        for (char in puzzle.correctAnswer) {
            val tileIndex = puzzle.availableLetters.indices.first { idx ->
                puzzle.availableLetters[idx] == char.toString() && idx !in viewModel.uiState.value.selectedTileIndices
            }
            viewModel.selectLetter(tileIndex)
        }
        viewModel.submitAnswer()
        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)

        // All hints must be disabled
        assertFalse(viewModel.uiState.value.canRevealLetter)
        assertFalse(viewModel.uiState.value.canRemoveWrongLetters)
        assertFalse(viewModel.uiState.value.canShowHint)

        val scoreBefore = viewModel.uiState.value.score

        // Calling them must have no effect
        viewModel.revealLetter()
        viewModel.removeWrongLetters()
        viewModel.showHint()

        assertFalse(viewModel.uiState.value.revealLetterUsed)
        assertFalse(viewModel.uiState.value.removeWrongLettersUsed)
        assertFalse(viewModel.uiState.value.hintUsed)
        assertEquals(scoreBefore, viewModel.uiState.value.score)
    }

    @Test
    fun testNextPuzzleResetsAllHintsAndRestoresFullReward() {
        val puzzle1 = viewModel.uiState.value.currentPuzzle!!
        val puzzle1InitialReward = puzzle1.rewardPoints

        // Use all hints on puzzle 1
        viewModel.revealLetter()
        viewModel.removeWrongLetters()
        viewModel.showHint()

        assertTrue(viewModel.uiState.value.revealLetterUsed)
        assertTrue(viewModel.uiState.value.removeWrongLettersUsed)
        assertTrue(viewModel.uiState.value.hintUsed)
        assertTrue(viewModel.uiState.value.isHintVisible)

        // Complete puzzle 1
        for (i in 1 until puzzle1.correctAnswer.length) {
            val char = puzzle1.correctAnswer[i].toString()
            val tileIndex = puzzle1.availableLetters.indices.first { idx ->
                puzzle1.availableLetters[idx] == char && idx !in viewModel.uiState.value.selectedTileIndices
            }
            viewModel.selectLetter(tileIndex)
        }
        viewModel.submitAnswer()
        val puzzle1Score = viewModel.uiState.value.score
        assertTrue(puzzle1Score > 0)

        // Advance to puzzle 2
        viewModel.nextPuzzle()

        val state2 = viewModel.uiState.value
        assertEquals(1, state2.currentPuzzleIndex)
        assertFalse(state2.revealLetterUsed)
        assertFalse(state2.removeWrongLettersUsed)
        assertFalse(state2.hintUsed)
        assertFalse(state2.isHintVisible)
        assertTrue(state2.revealedPositions.isEmpty())
        assertTrue(state2.eliminatedTileIndices.isEmpty())
        assertTrue(state2.selectedTileIndices.isEmpty())
        assertEquals(state2.currentPuzzle!!.rewardPoints, state2.currentReward)
        // Score from puzzle 1 is preserved
        assertEquals(puzzle1Score, state2.score)
    }

    @Test
    fun testRepeatedLetterAnswerRevealsOnlyOneTargetPosition() {
        val repeatedLetterPuzzle = Puzzle(
            id = 998,
            category = "فلك وفضاء",
            question = "جرم سماوي معتم يدور حول نجم",
            correctAnswer = "كوكب", // contains two 'ك's at index 0 and index 2
            availableLetters = listOf("ك", "و", "ك", "ب", "ش", "م"),
            hint = "الأرض والمريخ من أمثلته",
            rewardPoints = 20
        )
        val customVm = PuzzleGameViewModel(puzzles = listOf(repeatedLetterPuzzle))

        customVm.revealLetter()

        val state = customVm.uiState.value
        // Only slot 0 is revealed
        assertTrue(0 in state.revealedPositions.keys)
        assertFalse(2 in state.revealedPositions.keys)

        // Slot 0 is locked
        val slot0 = state.getSlotDisplayState(0)
        assertEquals("ك", slot0.letter)
        assertTrue(slot0.isRevealed)

        // Slot 2 is still empty and editable
        val slot2 = state.getSlotDisplayState(2)
        assertEquals(null, slot2.letter)
        assertFalse(slot2.isRevealed)
    }
}

