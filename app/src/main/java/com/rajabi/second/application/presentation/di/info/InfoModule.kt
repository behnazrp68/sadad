package com.rajabi.second.application.presentation.di.info

import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfosUseCase
import com.rajabi.second.application.presentation.MainActivityViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class InfoModule {
    @InfoScope
    @Provides
    fun providesMainActivityViewModelFactory(
        saveInfoUseCase: SaveInfoUseCase,
        updateInfoUseCase: UpdateInfoUseCase,
        updateInfosUseCase: UpdateInfosUseCase
    ): MainActivityViewModelFactory {
        return MainActivityViewModelFactory(saveInfoUseCase, updateInfoUseCase,updateInfosUseCase)
    }
}