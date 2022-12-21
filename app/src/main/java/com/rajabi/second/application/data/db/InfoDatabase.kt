package com.rajabi.second.application.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rajabi.second.application.data.model.Info

@Database(
    entities = [Info::class],
    version = 1, exportSchema = false
)

abstract class InfoDatabase : RoomDatabase() {
    abstract fun infoDao(): InfoDao
}