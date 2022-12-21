package com.rajabi.second.application.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.rajabi.second.application.data.model.Info

@Dao
interface InfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveInfos(info: Info)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateInfo(info: Info)

    @Query("DELETE FROM info_table")
    suspend fun deleteAllInfos()

    @Query("SELECT * FROM info_table")
    suspend fun getInfos(): List<Info>
}