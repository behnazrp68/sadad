package com.rajabi.second.application.domain.usecase

import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.domain.repository.InfoRepository

class UpdateInfosUseCase(private val infoRepository: InfoRepository, private val infos: List<Info>) {

    suspend fun execute() = infoRepository.updateInfos(infos)
}