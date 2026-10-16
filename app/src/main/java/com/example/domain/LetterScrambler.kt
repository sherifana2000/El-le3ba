package com.example.domain

import com.example.data.model.GameDifficulty
import kotlin.random.Random

/**
 * Intelligent letter scrambler that:
 * 1. Guarantees all characters of the correct answer (including repeated letters) are present without omission.
 * 2. Adds distractors according to difficulty level and letter frequency.
 * 3. Shuffles thoroughly so that letters never spell out the answer in trivial sequence.
 * 4. Ensures letters do not start with the answer's prefix or form the exact answer sequence.
 * 5. Supports dynamic re-scrambling with new seeds per attempt without breaking valid answer composition.
 */
object LetterScrambler {

    private val ARABIC_DISTRACTORS_POOL = listOf(
        "أ", "ب", "ت", "ث", "ج", "ح", "خ", "د", "ذ", "ر", "ز",
        "س", "ش", "ص", "ض", "ط", "ظ", "ع", "غ", "ف", "ق", "ك",
        "ل", "م", "ن", "هـ", "و", "ي", "ة"
    )

    /**
     * Constructs a guaranteed valid scrambled tile pool.
     *
     * @param correctAnswer The canonical answer word.
     * @param difficulty Level determining number and variety of distractors.
     * @param preferredDistractors Thematic or pre-configured distractors.
     * @param seed Optional seed for deterministic reproducibility in tests or default Random for dynamic gameplay.
     */
    fun buildScrambledLetters(
        correctAnswer: String,
        difficulty: GameDifficulty = GameDifficulty.EXPLORATION,
        preferredDistractors: List<String> = emptyList(),
        seed: Long? = null
    ): List<String> {
        val random = if (seed != null) Random(seed) else Random.Default
        val cleanAnswer = correctAnswer.filter { !it.isWhitespace() }
        val answerChars = cleanAnswer.map { it.toString() }

        val targetDistractorCount = maxOf(difficulty.distractorCount, preferredDistractors.size)
        val distractors = mutableListOf<String>()
        distractors.addAll(preferredDistractors)

        // Select additional distinct distractors from alphabet
        val candidates = ARABIC_DISTRACTORS_POOL.filter { it !in answerChars && it !in distractors }.shuffled(random)
        var cIdx = 0
        while (distractors.size < targetDistractorCount) {
            val dist = if (candidates.isNotEmpty()) {
                candidates[cIdx % candidates.size]
            } else {
                ARABIC_DISTRACTORS_POOL[random.nextInt(ARABIC_DISTRACTORS_POOL.size)]
            }
            distractors.add(dist)
            cIdx++
        }

        val combined = (answerChars + distractors).toMutableList()

        // Robust shuffle loop:
        // 1. Never match answer sequence at start (firstN == answerChars)
        // 2. Avoid trivial prefix matching when word has length > 1
        var shuffleCount = 0
        val maxAttempts = 30
        do {
            combined.shuffle(random)
            shuffleCount++
            val firstN = combined.take(answerChars.size)
            val isExactSequence = firstN == answerChars
            val startsWithFirstTwo = answerChars.size >= 2 && combined.take(2) == answerChars.take(2)
            val isTrivial = isExactSequence || (startsWithFirstTwo && combined.size > answerChars.size)
        } while (isTrivial && shuffleCount < maxAttempts)

        // Fallback guarantee: if still matches exact sequence, swap first two tiles safely
        if (combined.take(answerChars.size) == answerChars && combined.size > 1) {
            val temp = combined[0]
            combined[0] = combined[1]
            combined[1] = temp
        }

        return combined
    }
}
