package com.rajabi.second.application.data.repository.datasourceimpl

import android.content.Intent
import com.rajabi.second.application.data.api.InfoService
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.data.repository.datasource.InfoRemoteDataSource
import retrofit2.Response

class InfoRemoteDataSourceImpl (
    private val infoServices: InfoService,
    private val apiKey: String
    ) : InfoRemoteDataSource {
    override suspend fun saveInfo(): Response<Info> {
      return  infoServices.saveInfo(apiKey)
    }
}