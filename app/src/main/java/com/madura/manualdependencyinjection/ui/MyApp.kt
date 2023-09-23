package com.madura.manualdependencyinjection.ui

import android.app.Application
import com.madura.manualdependencyinjection.di.AppModule
import com.madura.manualdependencyinjection.di.AppModuleImpl

class MyApp : Application() {
    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }
}