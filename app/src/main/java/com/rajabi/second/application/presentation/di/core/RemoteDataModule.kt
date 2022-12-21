package com.rajabi.second.application.presentation.di.core

import android.content.Intent
import com.rajabi.second.application.BuildConfig
import com.rajabi.second.application.data.api.InfoService
import com.rajabi.second.application.data.repository.datasource.InfoRemoteDataSource
import com.rajabi.second.application.data.repository.datasourceimpl.InfoRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideRemoteDataModule(  infoService: InfoService):InfoRemoteDataSource{
        return InfoRemoteDataSourceImpl(infoService, BuildConfig.API_KEY)
    }
}