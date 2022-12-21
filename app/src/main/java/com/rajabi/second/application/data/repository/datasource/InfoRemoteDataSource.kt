package com.rajabi.second.application.data.repository.datasource

import android.content.Intent
import com.rajabi.second.application.data.model.Info
import retrofit2.Response

interface InfoRemoteDataSource {
    suspend fun saveInfo():Response<Info>
}