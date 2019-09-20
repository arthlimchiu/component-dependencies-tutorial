package com.arthlimchiu.componentdependencies.di

import com.arthlimchiu.componentdependencies.repos.ReposSubcomponent
import com.arthlimchiu.componentdependencies.userdetails.UserDetailsSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun userDetailsSubcomponent(): UserDetailsSubcomponent.Builder

    fun reposSubcomponent(): ReposSubcomponent.Builder
}