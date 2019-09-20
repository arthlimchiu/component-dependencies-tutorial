package com.arthlimchiu.componentdependencies.di

import com.arthlimchiu.componentdependencies.Api
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun api(): Api
}