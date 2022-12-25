package com.rajabi.second.application.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfosUseCase

class MainActivityViewModelFactory(
    private val saveInfoUseCase: SaveInfoUseCase,
    private val updateInfoUseCase: UpdateInfoUseCase,
    private val updateInfosUseCase: UpdateInfosUseCase
) :ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(saveInfoUseCase,updateInfoUseCase,updateInfosUseCase) as T
    }
}