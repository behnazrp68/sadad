package com.rajabi.second.application.presentation.di.core

import android.content.Intent
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.data.repository.InfoRepositoryImpl
import com.rajabi.second.application.data.repository.datasource.InfoLocalDataSource
import com.rajabi.second.application.data.repository.datasource.InfoRemoteDataSource
import com.rajabi.second.application.domain.repository.InfoRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideInfoRepository(
        infoRemoteDataSource: InfoRemoteDataSource,
        infoLocalDataSource: InfoLocalDataSource,
        info: Info
    ): InfoRepository {
        return InfoRepositoryImpl(infoRemoteDataSource, infoLocalDataSource, info)
    }
}