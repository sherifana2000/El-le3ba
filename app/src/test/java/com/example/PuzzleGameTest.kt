package com.example

import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.data.repository.PuzzleRepository
import com.example.domain.ArabicTextNormalizer
import com.example.domain.LetterScrambler
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
 * Unit tests verifying:
 * - 12 Houses content & challenges expansion
 * - Exactly 3 questions per challenge
 * - Non-trivial letter scrambling & repeated character support
 * - Difficulty scaling
 * - Scoring, hints, anti-exploit integrity
 * - Session and replay mechanics
 */
class PuzzleGameTest {

    private lateinit var viewModel: PuzzleGameViewModel

    @Before
    fun setUp() {
        viewModel = PuzzleGameViewModel()
    }

    private fun enterAnswerLetters(targetText: String, vm: PuzzleGameViewModel = viewModel) {
        val puzzle = vm.uiState.value.currentPuzzle ?: return
        vm.clearAnswer()
        for (char in targetText) {
            val tileIdx = puzzle.availableLetters.indices.firstOrNull { idx ->
                puzzle.availableLetters[idx] == char.toString() && idx !in vm.uiState.value.selectedTileIndices
            }
            if (tileIdx != null) {
                vm.selectLetter(tileIdx)
            }
        }
    }

    private fun solveCurrentPuzzle(vm: PuzzleGameViewModel = viewModel) {
        val puzzle = vm.uiState.value.currentPuzzle ?: return
        enterAnswerLetters(puzzle.correctAnswer, vm)
        vm.submitAnswer()
    }

    // ========================================================================
    // 1. 12 HOUSES & CHALLENGES ARCHITECTURE TESTS
    // ========================================================================

    @Test
    fun testAllTwelveCategoriesExist() {
        val categories = PuzzleRepository.getCategories()
        assertEquals(12, categories.size)

        val categoryIds = categories.map { it.id }.toSet()
        val expectedIds = setOf(
            "astronomy", "science", "history", "geography", "cars",
            "arabic_literature", "math_logic", "landmarks", "animals",
            "inventions", "mysteries", "general_knowledge"
        )
        assertEquals(expectedIds, categoryIds)

        // Verify Arabic names
        val categoryMap = categories.associateBy { it.id }
        assertEquals("الفضاء والفلك", categoryMap["astronomy"]?.arabicName)
        assertEquals("العلوم والطبيعة", categoryMap["science"]?.arabicName)
        assertEquals("التاريخ والحضارات", categoryMap["history"]?.arabicName)
        assertEquals("الجغرافيا والعالم", categoryMap["geography"]?.arabicName)
        assertEquals("السيارات والاختراعات", categoryMap["cars"]?.arabicName)
        assertEquals("اللغة العربية والأدب", categoryMap["arabic_literature"]?.arabicName)
        assertEquals("الرياضيات والمنطق", categoryMap["math_logic"]?.arabicName)
        assertEquals("المعالم والأماكن", categoryMap["landmarks"]?.arabicName)
        assertEquals("عالم الحيوان", categoryMap["animals"]?.arabicName)
        assertEquals("الاختراعات والاكتشافات", categoryMap["inventions"]?.arabicName)
        assertEquals("الألغاز والتحقيق", categoryMap["mysteries"]?.arabicName)
        assertEquals("الثقافة والمعرفة العامة", categoryMap["general_knowledge"]?.arabicName)
    }

    @Test
    fun testAllChallengesHaveExactlyThreeQuestions() {
        val challenges = PuzzleRepository.getAllChallenges()
        assertTrue("Challenges must not be empty", challenges.isNotEmpty())
        for (challenge in challenges) {
            assertEquals("Challenge ${challenge.id} must have exactly 3 questions", 3, challenge.questions.size)
            for (q in challenge.questions) {
                assertTrue("Question ${q.id} must have explanation", q.explanation.isNotBlank())
                assertTrue("Question ${q.id} must have visualEmoji", q.visualEmoji.isNotBlank())
            }
        }
    }

    @Test
    fun testTotalPuzzlesCountIsAtLeastOneHundredAndEight() {
        val total = PuzzleRepository.getTotalPuzzlesCount()
        assertEquals("Total puzzle count must be exactly 360 across 12 houses", 360, total)
        val challenges = PuzzleRepository.getAllChallenges()
        assertEquals("Total challenges must be exactly 120 across 12 houses", 120, challenges.size)
    }

    @Test
    fun testAllPuzzleIdsAreGloballyUnique() {
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        val ids = allPuzzles.map { it.id }
        val uniqueIds = ids.toSet()
        assertEquals("All puzzle IDs must be strictly unique", ids.size, uniqueIds.size)
    }

    @Test
    fun testEachPuzzleAvailableLettersContainAllAnswerLetters() {
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        for (puzzle in allPuzzles) {
            val answer = puzzle.correctAnswer
            val pool = puzzle.availableLetters

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

    @Test
    fun testLetterScramblerDoesNotProduceTrivialAnswerSequence() {
        // Test scrambling across different words
        val testWords = listOf("سيارة", "تلسكوب", "صاروخ", "مسمارية", "جرينلاند", "خوارزمية")
        for (word in testWords) {
            val scrambled = LetterScrambler.buildScrambledLetters(word, GameDifficulty.EXPLORATION, seed = 42L)
            val answerChars = word.map { it.toString() }
            val firstN = scrambled.take(answerChars.size)
            assertFalse("Word '$word' must not have letters in sequential trivial order at start", firstN == answerChars)
        }
    }

    @Test
    fun testDifficultyInfluencesDistractorCount() {
        val answer = "قمر"
        val exp = LetterScrambler.buildScrambledLetters(answer, GameDifficulty.EXPLORATION, seed = 1L)
        val thk = LetterScrambler.buildScrambledLetters(answer, GameDifficulty.THINKING, seed = 1L)
        val chl = LetterScrambler.buildScrambledLetters(answer, GameDifficulty.CHALLENGE, seed = 1L)
        val expL = LetterScrambler.buildScrambledLetters(answer, GameDifficulty.EXPERT, seed = 1L)

        // Base 3 letters + distractor counts
        assertEquals(3 + 2, exp.size)
        assertEquals(3 + 4, thk.size)
        assertEquals(3 + 6, chl.size)
        assertEquals(3 + 8, expL.size)
    }

    // ========================================================================
    // 2. SESSION & CATEGORY ISOLATION TESTS
    // ========================================================================

    @Test
    fun testSelectedCategoryLoadsOnlyItsOwnPuzzles() {
        viewModel.startSession("astronomy")
        val astronomyState = viewModel.uiState.value
        assertEquals("astronomy", astronomyState.categoryId)
        assertEquals("الفضاء والفلك", astronomyState.categoryName)
        assertTrue(astronomyState.puzzles.all { it.categoryId == "astronomy" })
        assertFalse(astronomyState.puzzles.any { it.categoryId == "cars" })

        viewModel.startSession("history")
        val historyState = viewModel.uiState.value
        assertEquals("history", historyState.categoryId)
        assertEquals("التاريخ والحضارات", historyState.categoryName)
        assertTrue(historyState.puzzles.all { it.categoryId == "history" })
    }

    @Test
    fun testStartingNewCategoryResetsScoreAndProgress() {
        // Solve first puzzle
        solveCurrentPuzzle()
        assertTrue(viewModel.uiState.value.score > 0)
        viewModel.nextPuzzle()

        // Switch to science
        viewModel.startSession("science")
        val newState = viewModel.uiState.value
        assertEquals("science", newState.categoryId)
        assertEquals(0, newState.score)
        assertEquals(0, newState.currentPuzzleIndex)
        assertEquals(1, newState.currentPuzzleNumber)
        assertEquals(0, newState.correctCount)
        assertEquals(SubmissionFeedback.Idle, newState.submissionFeedback)
        assertTrue(newState.selectedTileIndices.isEmpty())
        assertFalse(newState.isSessionCompleted)
    }

    @Test
    fun testReplaySessionPreservesSelectedCategory() {
        viewModel.startSession("astronomy")
        viewModel.nextPuzzle()
        assertEquals(1, viewModel.uiState.value.currentPuzzleIndex)

        viewModel.replaySession()
        val replayedState = viewModel.uiState.value
        assertEquals("astronomy", replayedState.categoryId)
        assertEquals(0, replayedState.currentPuzzleIndex)
        assertEquals(0, replayedState.score)
        assertEquals(0, replayedState.correctCount)
        assertFalse(replayedState.isSessionCompleted)
        assertTrue(replayedState.puzzles.all { it.categoryId == "astronomy" })
    }

    // ========================================================================
    // 3. LETTER INTERACTION & SUBMISSION TESTS
    // ========================================================================

    @Test
    fun testCannotSubmitIncompleteAnswer() {
        viewModel.selectLetter(0)
        viewModel.submitAnswer()

        assertEquals(SubmissionFeedback.Incorrect, viewModel.uiState.value.submissionFeedback)
        assertEquals(0, viewModel.uiState.value.score)
        assertEquals(0, viewModel.uiState.value.correctCount)
    }

    @Test
    fun testCannotModifyAnswerAfterCorrectSubmission() {
        solveCurrentPuzzle()
        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)

        val selectedSize = viewModel.uiState.value.selectedTileIndices.size

        viewModel.selectLetter(0)
        assertEquals(selectedSize, viewModel.uiState.value.selectedTileIndices.size)

        viewModel.removeLastLetter()
        assertEquals(selectedSize, viewModel.uiState.value.selectedTileIndices.size)

        viewModel.clearAnswer()
        assertEquals(selectedSize, viewModel.uiState.value.selectedTileIndices.size)
    }

    @Test
    fun testCorrectAnswerValidationAndScoring() {
        val puzzle = viewModel.uiState.value.currentPuzzle!!
        enterAnswerLetters(puzzle.correctAnswer)

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
    fun testScoreIntegrityNoDuplicateAndNoNegative() {
        assertEquals(0, viewModel.uiState.value.score)

        solveCurrentPuzzle()
        val scoreAfterFirst = viewModel.uiState.value.score
        assertTrue(scoreAfterFirst > 0)

        // Multiple submits do not add score
        viewModel.submitAnswer()
        viewModel.submitAnswer()
        assertEquals(scoreAfterFirst, viewModel.uiState.value.score)

        viewModel.nextPuzzle()
        assertEquals(scoreAfterFirst, viewModel.uiState.value.score)

        viewModel.replaySession()
        assertEquals(0, viewModel.uiState.value.score)
    }

    @Test
    fun testArabicTextNormalizerHandlesTashkeelAndVariants() {
        assertTrue(ArabicTextNormalizer.isMatch("سَيَّارَةٌ", "سيارة"))
        assertTrue(ArabicTextNormalizer.isMatch("إِيفِلْ", "ايفل"))
        assertTrue(ArabicTextNormalizer.isMatch("أقصى", "اقصي"))
        assertFalse(ArabicTextNormalizer.isMatch("طائرة", "سفينة"))
    }

    // ========================================================================
    // 4. HINTS AND ASSISTANCE TESTS
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

        val slot0 = state.getSlotDisplayState(0)
        assertEquals(targetChar, slot0.letter)
        assertTrue(slot0.isRevealed)

        // Removing slot 0 has no effect
        viewModel.removeLetterAt(0)
        assertTrue(0 in viewModel.uiState.value.revealedPositions.keys)

        viewModel.clearAnswer()
        assertTrue(0 in viewModel.uiState.value.revealedPositions.keys)
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

        // Remaining letters must still contain answer
        val answerLetterCounts = puzzle.correctAnswer.groupingBy { it.toString() }.eachCount()
        val remainingCounts = puzzle.availableLetters.indices
            .filter { it !in eliminated }
            .groupingBy { puzzle.availableLetters[it] }
            .eachCount()

        for ((char, required) in answerLetterCounts) {
            val remaining = remainingCounts[char] ?: 0
            assertTrue("Remaining letters must contain required count for $char", remaining >= required)
        }
    }

    @Test
    fun testShowHintDisplaysTextAndDeductsScore() {
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
    }

    @Test
    fun testHintsAreDisabledAfterCorrectSubmission() {
        solveCurrentPuzzle()
        assertEquals(SubmissionFeedback.Correct, viewModel.uiState.value.submissionFeedback)

        assertFalse(viewModel.uiState.value.canRevealLetter)
        assertFalse(viewModel.uiState.value.canRemoveWrongLetters)
        assertFalse(viewModel.uiState.value.canShowHint)
    }

    @Test
    fun testRepeatedLetterAnswerRevealsOnlyOneTargetPosition() {
        val repeatedLetterPuzzle = Puzzle(
            id = 998,
            category = "فلك وفضاء",
            question = "جرم سماوي معتم يدور حول نجم",
            correctAnswer = "كوكب",
            availableLetters = listOf("ك", "و", "ك", "ب", "ش", "م"),
            hint = "الأرض والمريخ من أمثلته",
            rewardPoints = 20
        )
        val customVm = PuzzleGameViewModel(puzzles = listOf(repeatedLetterPuzzle))

        customVm.revealLetter()

        val state = customVm.uiState.value
        assertTrue(0 in state.revealedPositions.keys)
        assertFalse(2 in state.revealedPositions.keys)

        val slot0 = state.getSlotDisplayState(0)
        assertEquals("ك", slot0.letter)
        assertTrue(slot0.isRevealed)

        val slot2 = state.getSlotDisplayState(2)
        assertEquals(null, slot2.letter)
        assertFalse(slot2.isRevealed)
    }
}
