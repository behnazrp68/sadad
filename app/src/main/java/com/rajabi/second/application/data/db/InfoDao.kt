package com.rajabi.second.application.data.db

import androidx.room.*
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



    @Transaction
    suspend fun updateInfos(infos: List<Info>) {
        infos.forEach { info ->
            if (info.bool==false) {
                updateInfo(info)
            }
        }
    }

}