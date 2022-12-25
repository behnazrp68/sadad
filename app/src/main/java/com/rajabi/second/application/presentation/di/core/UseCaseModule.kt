package com.rajabi.second.application.presentation.di.core

import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.domain.repository.InfoRepository
import com.rajabi.second.application.domain.usecase.SaveInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfoUseCase
import com.rajabi.second.application.domain.usecase.UpdateInfosUseCase
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton
import kotlin.collections.ArrayList

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

    @Singleton
    @Provides
    fun provideUpdateInfosUseCase(infoRepository: InfoRepository,infos: List<Info>): UpdateInfosUseCase {
        return UpdateInfosUseCase(infoRepository,infos)
    }

    @Provides
    @Singleton
    fun provideRecipeList(): List<Info> {
        return java.util.ArrayList<Info>()
    }


}