package com.example.data.model

/**
 * Represents a thematic Challenge in Madarat Al-Maarefa composed of exactly 3 interrelated questions.
 *
 * @property id Unique identifier (e.g. "astronomy_c1")
 * @property categoryId Educational House ID this challenge belongs to
 * @property title Thematic title connecting the 3 questions
 * @property themeDescription Concise description of the challenge's theme
 * @property difficulty Challenge difficulty level
 * @property questions Exactly 3 interrelated educational puzzles
 */
data class Challenge(
    val id: String,
    val categoryId: String,
    val title: String,
    val themeDescription: String,
    val difficulty: GameDifficulty = GameDifficulty.EXPLORATION,
    val questions: List<Puzzle>
) {
    init {
        require(questions.size == 3) {
            "Every challenge must consist of exactly 3 interrelated questions (found ${questions.size} in $id)"
        }
    }
}
