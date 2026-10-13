package com.example.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Persistent Room entity storing player progress for an individual educational House (category).
 *
 * Each category maintains its own isolated record identified by [categoryId].
 */
@Entity(tableName = "player_progress")
data class PlayerProgressEntity(
    @PrimaryKey
    val categoryId: String,
    val highestScore: Int = 0,
    val completedPuzzlesCount: Int = 0,
    val bestCompletionPercentage: Int = 0,
    val lastPlayedTimestamp: Long = System.currentTimeMillis(),
    val totalAttempts: Int = 0,
    val completedSessions: Int = 0
)
