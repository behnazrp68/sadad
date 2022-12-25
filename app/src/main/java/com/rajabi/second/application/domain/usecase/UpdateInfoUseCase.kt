package com.rajabi.second.application.domain.usecase

import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.domain.repository.InfoRepository

class UpdateInfoUseCase(private val infoRepository: InfoRepository,private val info: Info) {

    suspend fun execute(): Info? = infoRepository.updateInfo(info)
}