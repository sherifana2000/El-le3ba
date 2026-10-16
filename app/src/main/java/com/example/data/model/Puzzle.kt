package com.example.data.model

/**
 * Represents a single educational word puzzle in the Celestial Atlas / Madarat universe.
 *
 * @property id Unique numeric puzzle identifier
 * @property categoryId Unique string identifier of the parent category (e.g. "astronomy", "cars")
 * @property category Arabic display title for the House (e.g. "بيت الفضاء والفلك")
 * @property question Clear, educational Arabic clue/question
 * @property correctAnswer Target Arabic word (normalized during validation)
 * @property availableLetters Scrambled pool of letters containing target characters and distractors
 * @property hint Optional instructional guidance
 * @property rewardPoints Points awarded upon correct submission
 * @property explanation Educational explanation shown after correct solving
 * @property challengeId Parent challenge ID
 * @property challengeTitle Title of the 3-question challenge
 * @property questionIndexInChallenge Index within the challenge (1, 2, or 3)
 * @property totalQuestionsInChallenge Total questions in challenge (default 3)
 * @property visualEmoji Visual symbol representing the question
 * @property visualTheme Thematic topic tag
 * @property difficulty The difficulty level of this question
 */
data class Puzzle(
    val id: Int,
    val categoryId: String = "cars",
    val category: String = "بيت السيارات والاختراعات",
    val question: String,
    val correctAnswer: String,
    val availableLetters: List<String>,
    val hint: String? = null,
    val rewardPoints: Int = 15,
    val explanation: String = "",
    val challengeId: String = "",
    val challengeTitle: String = "",
    val questionIndexInChallenge: Int = 1,
    val totalQuestionsInChallenge: Int = 3,
    val visualEmoji: String = "✨",
    val visualTheme: String = "",
    val difficulty: GameDifficulty = GameDifficulty.EXPLORATION
)
