package com.rajabi.second.application.domain.repository

import com.rajabi.second.application.data.model.Info

interface InfoRepository {
    suspend fun saveInfo(info: Info): Info?
    suspend fun updateInfos(info: Info):Info?
}