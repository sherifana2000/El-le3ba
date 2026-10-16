package com.example.data.repository

import android.content.Context
import com.example.data.local.dao.PlayerProgressDao
import com.example.data.local.database.MadaratDatabase
import com.example.data.local.entity.PlayerProgressEntity
import kotlinx.coroutines.flow.Flow

/**
 * Repository mediating between the UI/ViewModel and Room local player progress persistence.
 */
class PlayerProgressRepository(
    private val playerProgressDao: PlayerProgressDao
) {

    /**
     * Observes persistent progress for a specific category.
     */
    fun getProgress(categoryId: String): Flow<PlayerProgressEntity?> {
        return playerProgressDao.getProgress(categoryId)
    }

    /**
     * Synchronously fetches the current progress record for a category.
     */
    suspend fun getProgressById(categoryId: String): PlayerProgressEntity? {
        return playerProgressDao.getProgressById(categoryId)
    }

    /**
     * Observes persistent progress for all categories.
     */
    fun getAllProgress(): Flow<List<PlayerProgressEntity>> {
        return playerProgressDao.getAllProgress()
    }

    /**
     * Records the outcome of a completed session for the given [categoryId].
     *
     * Rules:
     * - If no previous record exists, creates a new record.
     * - If a record exists, updates:
     *   - [highestScore]: max(existing, newScore) -> never overwrites a higher score with lower!
     *   - [completedPuzzlesCount]: max(existing, newCompletedCount)
     *   - [bestCompletionPercentage]: max(existing, newPercentage)
     *   - [lastPlayedTimestamp]: current time
     *   - [totalAttempts]: incremented by 1
     *   - [completedSessions]: incremented by 1 (if session finished)
     *   - [completedChallengesCount]: accumulated / maxed
     *   - [totalCorrectAnswers]: incremented by correct answers in session
     *   - [totalWrongAnswers]: incremented by wrong attempts
     */
    suspend fun saveSessionProgress(
        categoryId: String,
        score: Int,
        completedPuzzlesCount: Int,
        completionPercentage: Int,
        completedChallengesCountDelta: Int = 0,
        correctAnswersDelta: Int = 0,
        wrongAnswersDelta: Int = 0,
        isCompletedSession: Boolean = true
    ): PlayerProgressEntity {
        val existing = playerProgressDao.getProgressById(categoryId)
        val now = System.currentTimeMillis()

        val record = if (existing == null) {
            PlayerProgressEntity(
                categoryId = categoryId,
                highestScore = score,
                completedPuzzlesCount = completedPuzzlesCount,
                bestCompletionPercentage = completionPercentage,
                lastPlayedTimestamp = now,
                totalAttempts = 1,
                completedSessions = if (isCompletedSession) 1 else 0,
                completedChallengesCount = completedChallengesCountDelta,
                totalCorrectAnswers = correctAnswersDelta,
                totalWrongAnswers = wrongAnswersDelta
            )
        } else {
            existing.copy(
                highestScore = maxOf(existing.highestScore, score),
                completedPuzzlesCount = maxOf(existing.completedPuzzlesCount, completedPuzzlesCount),
                bestCompletionPercentage = maxOf(existing.bestCompletionPercentage, completionPercentage),
                lastPlayedTimestamp = now,
                totalAttempts = existing.totalAttempts + 1,
                completedSessions = if (isCompletedSession) existing.completedSessions + 1 else existing.completedSessions,
                completedChallengesCount = existing.completedChallengesCount + completedChallengesCountDelta,
                totalCorrectAnswers = existing.totalCorrectAnswers + correctAnswersDelta,
                totalWrongAnswers = existing.totalWrongAnswers + wrongAnswersDelta
            )
        }

        playerProgressDao.insertOrUpdateProgress(record)
        return record
    }

    /**
     * Resets progress for a specific category (useful for testing or profile reset).
     */
    suspend fun resetCategoryProgress(categoryId: String) {
        playerProgressDao.deleteProgress(categoryId)
    }

    /**
     * Clears all saved progress records.
     */
    suspend fun clearAll() {
        playerProgressDao.clearAllProgress()
    }

    companion object {
        @Volatile
        private var INSTANCE: PlayerProgressRepository? = null

        fun getInstance(context: Context): PlayerProgressRepository {
            return INSTANCE ?: synchronized(this) {
                val database = MadaratDatabase.getDatabase(context.applicationContext)
                val instance = PlayerProgressRepository(database.playerProgressDao())
                INSTANCE = instance
                instance
            }
        }
    }
}
