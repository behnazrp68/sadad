package com.rajabi.second.application.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase

class MainActivityViewModel(
    private val saveInfoUseCase: SaveInfoUseCase,
    private val updateInfoUseCase: UpdateInfoUseCase
):ViewModel() {

    fun saveInfo(info: Info):LiveData<Info?> = liveData {
        val infoList : Info? = saveInfoUseCase.execute()
        emit(infoList)
    }

    fun updateInfo()= liveData {
        val updatedList = updateInfoUseCase.execute()
        emit(updatedList)
    }

}