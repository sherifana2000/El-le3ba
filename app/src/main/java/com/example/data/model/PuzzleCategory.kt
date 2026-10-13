package com.example.data.model

/**
 * Represents an educational House / Category in Madarat Al-Maarefa.
 *
 * @property id Unique English identifier (e.g. cars, science, astronomy, history, arabic_language)
 * @property arabicName Natural Arabic display name for the House
 * @property shortDescription Concise pedagogical description of the House
 * @property iconEmoji Cultural/visual emoji or icon symbol representing the House
 * @property puzzles Collection of educational puzzles belonging to this House
 */
data class PuzzleCategory(
    val id: String,
    val arabicName: String,
    val shortDescription: String,
    val iconEmoji: String,
    val puzzles: List<Puzzle> = emptyList()
)
