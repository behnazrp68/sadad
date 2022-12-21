package com.rajabi.second.application.presentation.di.core

import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.domain.repository.InfoRepository
import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideSaveInfoUseCase(infoRepository: InfoRepository, info: Info): SaveInfoUseCase {
        return SaveInfoUseCase(infoRepository, info)
    }

    @Singleton
    @Provides
    fun provideUpdateInfoUseCase(infoRepository: InfoRepository,info: Info): UpdateInfoUseCase {
        return UpdateInfoUseCase(infoRepository,info)
    }
}