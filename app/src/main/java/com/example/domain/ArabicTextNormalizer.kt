package com.example.domain

/**
 * Handles safe, deterministic Arabic text normalization and comparison for word puzzles.
 *
 * Normalizes:
 * - Tashkeel (Fatha, Damma, Kasra, Sukun, Tanween, Shadda, etc.)
 * - Alef variants (أ, إ, آ, ٱ -> ا)
 * - Taa Marbouta (ة -> ه) for flexible single-letter matches while preserving distinct semantics
 * - Alef Maqsura (ى -> ي)
 * - Removes zero-width joiners and whitespaces
 * - Treats letters with exactness so distinct words are not falsely equated.
 */
object ArabicTextNormalizer {

    private val TASHKEEL_REGEX = Regex("[\\u064B-\\u065F\\u0670]")

    /**
     * Cleans and normalizes Arabic string by removing tashkeel, zero-width characters,
     * trimming whitespace, and standardizing alef and yaa variants.
     */
    fun normalize(text: String): String {
        return text
            .trim()
            .replace(TASHKEEL_REGEX, "")
            .replace('\u0671', 'ا') // Wasla
            .replace('\u0622', 'ا') // Alef with Madda
            .replace('\u0623', 'ا') // Alef with Hamza Above
            .replace('\u0625', 'ا') // Alef with Hamza Below
            .replace('\u0649', 'ي') // Alef Maqsura -> Ya
            .replace('\u0629', 'ه') // Taa Marbuta -> Haa for standard letter comparison
            .replace('\u200C', ' ') // Zero width non-joiner
            .replace('\u200D', ' ') // Zero width joiner
            .filter { !it.isWhitespace() }
    }

    /**
     * Compares user constructed answer with canonical correct answer.
     * Returns true if normalized forms match exactly.
     */
    fun isMatch(userAnswer: String, correctAnswer: String): Boolean {
        if (userAnswer.isEmpty() || correctAnswer.isEmpty()) return false
        val normalizedUser = normalize(userAnswer)
        val normalizedCorrect = normalize(correctAnswer)
        return normalizedUser == normalizedCorrect
    }
}
