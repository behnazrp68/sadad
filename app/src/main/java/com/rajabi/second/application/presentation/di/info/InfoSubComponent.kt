package com.rajabi.second.application.presentation.di.info

import com.rajabi.second.application.presentation.MainActivity
import dagger.Subcomponent

@InfoScope
@Subcomponent(modules = [InfoModule::class])
interface InfoSubComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():InfoSubComponent
    }
}