package com.rajabi.second.application.presentation.di.core

import android.content.Context
import com.rajabi.second.application.presentation.di.info.InfoSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [InfoSubComponent::class])
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}