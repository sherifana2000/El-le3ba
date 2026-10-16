package com.example.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.data.local.dao.PlayerProgressDao
import com.example.data.local.entity.PlayerProgressEntity

/**
 * Room Database for Madarat player progress persistence.
 *
 * Stores local progress records independently per educational House/category.
 */
@Database(
    entities = [PlayerProgressEntity::class],
    version = 2,
    exportSchema = false
)
abstract class MadaratDatabase : RoomDatabase() {

    abstract fun playerProgressDao(): PlayerProgressDao

    companion object {
        const val DATABASE_NAME = "madarat_player_progress.db"

        /**
         * Safe migration from v1 to v2: adds challenge & answer tracking columns without losing existing records.
         */
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE player_progress ADD COLUMN completedChallengesCount INTEGER NOT NULL DEFAULT 0")
                db.execSQL("ALTER TABLE player_progress ADD COLUMN totalCorrectAnswers INTEGER NOT NULL DEFAULT 0")
                db.execSQL("ALTER TABLE player_progress ADD COLUMN totalWrongAnswers INTEGER NOT NULL DEFAULT 0")
            }
        }

        @Volatile
        private var INSTANCE: MadaratDatabase? = null

        fun getDatabase(context: Context): MadaratDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MadaratDatabase::class.java,
                    DATABASE_NAME
                )
                    .addMigrations(MIGRATION_1_2)
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
