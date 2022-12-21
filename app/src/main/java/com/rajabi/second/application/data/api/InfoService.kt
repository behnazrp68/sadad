package com.rajabi.second.application.data.api

import com.rajabi.second.application.data.model.Info
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface InfoService  {

    @GET("info/save")
    suspend fun saveInfo(@Query("api_key") apiKey: String): Response<Info>

}