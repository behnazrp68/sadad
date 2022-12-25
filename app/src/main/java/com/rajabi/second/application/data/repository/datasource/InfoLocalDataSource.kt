package com.rajabi.second.application.data.repository.datasource

import androidx.room.Transaction
import com.rajabi.second.application.data.model.Info

interface InfoLocalDataSource {
    suspend fun getInfosFromDB():List<Info>
    suspend fun saveInfoToDB(info:Info):Info?
    suspend fun updateInfoToDB(info:Info):Info?
    suspend fun updateInfos(infos: List<Info>)
    suspend fun clearAll()
}