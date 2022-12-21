package com.rajabi.second.application.presentation.di.core

import com.rajabi.second.application.data.db.InfoDao
import com.rajabi.second.application.data.repository.datasource.InfoLocalDataSource
import com.rajabi.second.application.data.repository.datasourceimpl.InfoLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideInfoLocalDataSource(infoDao: InfoDao): InfoLocalDataSource {
            return InfoLocalDataSourceImpl(infoDao)
    }
}