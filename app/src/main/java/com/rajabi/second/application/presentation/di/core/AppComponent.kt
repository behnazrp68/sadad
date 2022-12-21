package com.rajabi.second.application.presentation.di.core

import com.rajabi.second.application.presentation.di.info.InfoSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataBaseModule::class,
        LocalDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        RemoteDataModule::class,
        NetModule::class
    ]
)
interface AppComponent {

    fun infoSubComponent(): InfoSubComponent.Factory
}