package com.example

import com.example.data.model.GameDifficulty
import com.example.data.repository.PuzzleRepository
import com.example.domain.ArabicTextNormalizer
import com.example.domain.LetterScrambler
import com.example.ui.game.HintConstants
import com.example.ui.game.PuzzleGameViewModel
import com.example.ui.game.SubmissionFeedback
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Dedicated test suite verifying gameplay mechanics:
 * 1. Handling repeated characters in answers.
 * 2. Short vs long answers letter availability.
 * 3. Scrambling randomness and anti-trivial sequence guarantee.
 * 4. Normalization of Arabic characters (alef forms, taa marbouta, tashkeel, spaces).
 * 5. Hint deductions and anti-exploit single-use integrity.
 * 6. Difficulty scaling impact on distractor count.
 */
class GameplayMechanicsTest {

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
                ArabicTextNormalizer.isMatch(puzzle.availableLetters[idx], char.toString()) &&
                        idx !in vm.uiState.value.selectedTileIndices
            }
            if (tileIdx != null) {
                vm.selectLetter(tileIdx)
            }
        }
    }

    @Test
    fun testRepeatedCharactersInAnswerAreFullyPreserved() {
        val repeatedWords = listOf("كوكب", "رادار", "تلسكوب", "سلحفاة", "شمبانزي", "أكسولوتل", "تشيللو")
        for (word in repeatedWords) {
            val scrambled = LetterScrambler.buildScrambledLetters(word, GameDifficulty.EXPLORATION, seed = 123L)
            val wordCharCounts = word.groupingBy { it.toString() }.eachCount()
            val scrambledCharCounts = scrambled.groupingBy { it }.eachCount()

            for ((char, count) in wordCharCounts) {
                val available = scrambledCharCounts[char] ?: 0
                assertTrue(
                    "Word '$word' with repeated character '$char' (needed $count) must have at least $count available, but had $available",
                    available >= count
                )
            }
        }
    }

    @Test
    fun testShortAndLongAnswersConstructible() {
        val shortWord = "شمس" // 3 letters
        val longWord = "مائةوثمانون" // 10 letters

        val shortScrambled = LetterScrambler.buildScrambledLetters(shortWord, GameDifficulty.EXPLORATION, seed = 42L)
        val longScrambled = LetterScrambler.buildScrambledLetters(longWord, GameDifficulty.EXPERT, seed = 42L)

        for (c in shortWord) {
            assertTrue("Short word char '$c' must be in tiles", shortScrambled.contains(c.toString()))
        }
        for (c in longWord) {
            assertTrue("Long word char '$c' must be in tiles", longScrambled.contains(c.toString()))
        }
    }

    @Test
    fun testScramblerNeverMatchesExactTrivialSequenceAtStart() {
        val words = listOf("صاروخ", "نجم", "مجرة", "قمر", "بركان", "هيدروجين")
        for (word in words) {
            for (seed in 1L..10L) {
                val scrambled = LetterScrambler.buildScrambledLetters(word, GameDifficulty.EXPLORATION, seed = seed)
                val wordChars = word.map { it.toString() }
                val startSlice = scrambled.take(wordChars.size)
                assertFalse("Word '$word' with seed $seed must not start with exact answer sequence", startSlice == wordChars)
            }
        }
    }

    @Test
    fun testReScramblingProvidesVariedOrderWithDifferentSeeds() {
        val word = "تلسكوب"
        val scrambleA = LetterScrambler.buildScrambledLetters(word, GameDifficulty.THINKING, seed = 100L)
        val scrambleB = LetterScrambler.buildScrambledLetters(word, GameDifficulty.THINKING, seed = 200L)
        assertNotEquals("Different seeds should yield different tile orders", scrambleA, scrambleB)
    }

    @Test
    fun testArabicNormalizationPermitsSpellingVariantsAndIgnoresTashkeel() {
        assertTrue(ArabicTextNormalizer.isMatch("إِيفِل", "ايفل"))
        assertTrue(ArabicTextNormalizer.isMatch("أَحْمَد", "احمد"))
        assertTrue(ArabicTextNormalizer.isMatch("آسِيَا", "اسيا"))
        assertTrue(ArabicTextNormalizer.isMatch("مجرّة", "مجرة"))
        assertTrue(ArabicTextNormalizer.isMatch("مِشْكَاة", "مشكاه"))
        assertTrue(ArabicTextNormalizer.isMatch("  كوكب  ", "كوكب"))

        // Distinct semantic words must not falsely match
        assertFalse(ArabicTextNormalizer.isMatch("شمس", "قمر"))
        assertFalse(ArabicTextNormalizer.isMatch("نجم", "نهر"))
    }

    @Test
    fun testHintDeductsPointsAccuratelyAndCannotBeExploitedMultipleTimes() {
        viewModel.startSession("astronomy")
        val initialReward = viewModel.uiState.value.currentReward

        // Reveal letter
        assertTrue(viewModel.uiState.value.canRevealLetter)
        viewModel.revealLetter()
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST, viewModel.uiState.value.currentReward)
        assertFalse("Cannot use reveal letter twice in same puzzle", viewModel.uiState.value.canRevealLetter)

        // Show text hint
        assertTrue(viewModel.uiState.value.canShowHint)
        viewModel.showHint()
        assertEquals(initialReward - HintConstants.REVEAL_LETTER_COST - HintConstants.SHOW_HINT_COST, viewModel.uiState.value.currentReward)
        assertFalse("Cannot show text hint twice in same puzzle", viewModel.uiState.value.canShowHint)
    }

    @Test
    fun testAllThreeHundredAndSixtyPuzzlesAreValidAndSolvable() {
        val allPuzzles = PuzzleRepository.getAllPuzzles()
        assertEquals(360, allPuzzles.size)

        for (puzzle in allPuzzles) {
            val answer = puzzle.correctAnswer
            val tiles = puzzle.availableLetters
            val answerCounts = answer.groupingBy { it.toString() }.eachCount()
            val tileCounts = tiles.groupingBy { it }.eachCount()

            for ((char, count) in answerCounts) {
                val available = tileCounts[char] ?: 0
                assertTrue(
                    "Puzzle ID ${puzzle.id} ('$answer') missing character '$char'. Required: $count, Available: $available",
                    available >= count
                )
            }
        }
    }
}
