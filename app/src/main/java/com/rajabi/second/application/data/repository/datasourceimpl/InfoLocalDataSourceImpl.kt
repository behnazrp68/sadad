package com.rajabi.second.application.data.repository.datasourceimpl

import com.rajabi.second.application.data.db.InfoDao
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.data.repository.datasource.InfoLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class InfoLocalDataSourceImpl(private val infoDao: InfoDao) : InfoLocalDataSource {
    override suspend fun getInfosFromDB(): List<Info> {
        return infoDao.getInfos()
    }

    override suspend fun saveInfoToDB(info: Info): Info? {
        CoroutineScope(Dispatchers.IO).launch {
             infoDao.saveInfos(info)
        }
        return info
    }

    override suspend fun updateInfoToDB(info: Info): Info? {
        CoroutineScope(Dispatchers.IO).launch {
            infoDao.updateInfo(info)
        }
        return info
    }

    override suspend fun updateInfos(infos: List<Info>) {
        CoroutineScope(Dispatchers.IO).launch {
            infoDao.updateInfos(infos)
        }
    }


    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            infoDao.deleteAllInfos()
        }

    }
}