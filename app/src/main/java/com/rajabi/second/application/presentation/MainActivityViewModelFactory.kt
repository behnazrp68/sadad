package com.rajabi.second.application.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase

class MainActivityViewModelFactory(
    private val saveInfoUseCase: SaveInfoUseCase,
    private val updateInfoUseCase: UpdateInfoUseCase
) :ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(saveInfoUseCase,updateInfoUseCase) as T
    }
}