package com.example.data.model

/**
 * Represents an educational House / Category in Madarat Al-Maarefa.
 *
 * @property id Unique English identifier
 * @property arabicName Natural Arabic display name for the House
 * @property shortDescription Concise pedagogical description of the House
 * @property iconEmoji Cultural/visual emoji or icon symbol representing the House
 * @property challenges Collection of 3-question challenges belonging to this House
 * @property puzzles Collection of educational puzzles belonging to this House
 */
data class PuzzleCategory(
    val id: String,
    val arabicName: String,
    val shortDescription: String,
    val iconEmoji: String,
    val challenges: List<Challenge> = emptyList(),
    val puzzles: List<Puzzle> = challenges.flatMap { it.questions }
)
