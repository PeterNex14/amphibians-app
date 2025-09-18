package com.gabsee.amphibiansapp

import android.app.Application
import com.gabsee.amphibiansapp.data.AppContainer
import com.gabsee.amphibiansapp.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}