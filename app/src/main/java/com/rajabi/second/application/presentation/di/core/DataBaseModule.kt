package com.rajabi.second.application.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.rajabi.second.application.data.db.InfoDao
import com.rajabi.second.application.data.db.InfoDatabase
import com.rajabi.second.application.data.model.Info
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideInfoDataBaseModule(context: Context):InfoDatabase{
        return Room.databaseBuilder(context,InfoDatabase::class.java,"infoclient")
            .build()
    }

    @Singleton
    @Provides
    fun provideInfoDao(infoDatabase: InfoDatabase):InfoDao{
        return infoDatabase.infoDao()
    }

    @Provides
    fun provideInfo(): Info =Info()
}