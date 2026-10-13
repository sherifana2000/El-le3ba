package com.example.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.local.dao.PlayerProgressDao
import com.example.data.local.entity.PlayerProgressEntity

/**
 * Room Database for Madarat player progress persistence.
 *
 * Stores local progress records independently per educational House/category.
 */
@Database(
    entities = [PlayerProgressEntity::class],
    version = 1,
    exportSchema = false
)
abstract class MadaratDatabase : RoomDatabase() {

    abstract fun playerProgressDao(): PlayerProgressDao

    companion object {
        const val DATABASE_NAME = "madarat_player_progress.db"

        @Volatile
        private var INSTANCE: MadaratDatabase? = null

        fun getDatabase(context: Context): MadaratDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MadaratDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
