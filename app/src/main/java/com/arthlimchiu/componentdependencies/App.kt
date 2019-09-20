package com.arthlimchiu.componentdependencies

import android.app.Application
import com.arthlimchiu.componentdependencies.di.AppComponent
import com.arthlimchiu.componentdependencies.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .build()
    }
}

lateinit var appComponent: AppComponent