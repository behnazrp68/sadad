package com.rajabi.second.application.data.repository.datasource

import com.rajabi.second.application.data.model.Info

interface InfoLocalDataSource {
    suspend fun getInfosFromDB():List<Info>
    suspend fun saveInfoToDB(info:Info):Info?
    suspend fun updateInfoToDB(info:Info):Info?
    suspend fun clearAll()
}