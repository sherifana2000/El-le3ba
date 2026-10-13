package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.entity.PlayerProgressEntity
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for local player progress persistence.
 */
@Dao
interface PlayerProgressDao {

    @Query("SELECT * FROM player_progress WHERE categoryId = :categoryId LIMIT 1")
    fun getProgress(categoryId: String): Flow<PlayerProgressEntity?>

    @Query("SELECT * FROM player_progress WHERE categoryId = :categoryId LIMIT 1")
    suspend fun getProgressById(categoryId: String): PlayerProgressEntity?

    @Query("SELECT * FROM player_progress ORDER BY lastPlayedTimestamp DESC")
    fun getAllProgress(): Flow<List<PlayerProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateProgress(progress: PlayerProgressEntity)

    @Query("UPDATE player_progress SET highestScore = :score, lastPlayedTimestamp = :timestamp WHERE categoryId = :categoryId")
    suspend fun updateBestScore(categoryId: String, score: Int, timestamp: Long)

    @Query("UPDATE player_progress SET completedPuzzlesCount = :count, lastPlayedTimestamp = :timestamp WHERE categoryId = :categoryId")
    suspend fun updateCompletedPuzzles(categoryId: String, count: Int, timestamp: Long)

    @Query("DELETE FROM player_progress WHERE categoryId = :categoryId")
    suspend fun deleteProgress(categoryId: String)

    @Query("DELETE FROM player_progress")
    suspend fun clearAllProgress()
}
