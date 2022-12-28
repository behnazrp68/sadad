package com.rajabi.second.application.data.repository

import android.util.Log
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.data.repository.datasource.InfoLocalDataSource
import com.rajabi.second.application.data.repository.datasource.InfoRemoteDataSource
import com.rajabi.second.application.domain.repository.InfoRepository

class InfoRepositoryImpl(
    private val infoRemoteDataSource: InfoRemoteDataSource,
    private val infoLocalDataSource: InfoLocalDataSource
) : InfoRepository {


    override suspend fun updateInfo(info: Info): Info? {
        return infoLocalDataSource.saveInfoToDB(info)
    }

    override suspend fun updateInfos(infos: List<Info>) {
        infoLocalDataSource.updateInfos(infos)
        saveInfoToApi()
    }


    override suspend fun saveInfo(info: Info): Info {
        try {
            infoLocalDataSource.saveInfoToDB(info)!!
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return info
    }

    suspend fun saveInfoToApi(): Info {
        lateinit var info: Info
        try {
            val response = infoRemoteDataSource.saveInfo()

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return info
    }
}