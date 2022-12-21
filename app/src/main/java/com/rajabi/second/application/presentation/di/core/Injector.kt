package com.rajabi.second.application.presentation.di.core

import com.rajabi.second.application.presentation.di.info.InfoSubComponent

interface Injector {
    fun createInfoSubComponent():InfoSubComponent
}