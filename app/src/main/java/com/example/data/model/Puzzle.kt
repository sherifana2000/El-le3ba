package com.example.data.model

/**
 * Represents a single educational word puzzle in the Celestial Atlas / Madarat universe.
 *
 * @property id Unique numeric puzzle identifier
 * @property categoryId Unique string identifier of the parent category (e.g. "cars", "science")
 * @property category Arabic display title for the House (e.g. "بيت السيارات والمواصلات")
 * @property question Clear, educational Arabic clue/question
 * @property correctAnswer Target Arabic word (normalized during validation)
 * @property availableLetters Scrambled pool of letters containing target characters and distractors
 * @property hint Optional instructional guidance
 * @property rewardPoints Points awarded upon correct submission
 */
data class Puzzle(
    val id: Int,
    val categoryId: String = "cars",
    val category: String = "بيت السيارات والمواصلات",
    val question: String,
    val correctAnswer: String,
    val availableLetters: List<String>,
    val hint: String? = null,
    val rewardPoints: Int = 15
)
