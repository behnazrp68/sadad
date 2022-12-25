package com.rajabi.second.application.presentation

import android.app.Application
import com.rajabi.second.application.presentation.di.core.AppComponent
import com.rajabi.second.application.presentation.di.core.AppModule
import com.rajabi.second.application.presentation.di.core.DaggerAppComponent
import com.rajabi.second.application.presentation.di.core.Injector
import com.rajabi.second.application.presentation.di.info.InfoSubComponent

class App:Application(),Injector {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()
    }

    override fun createInfoSubComponent(): InfoSubComponent {
        return appComponent.infoSubComponent().create()
    }
}