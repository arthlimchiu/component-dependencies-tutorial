package com.arthlimchiu.componentdependencies.di

import com.arthlimchiu.componentdependencies.Api
import com.arthlimchiu.componentdependencies.repos.ReposSubcomponent
import com.arthlimchiu.componentdependencies.userdetails.UserDetailsSubcomponent
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(
    subcomponents = [
        UserDetailsSubcomponent::class,
        ReposSubcomponent::class
    ]
)
class AppModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }
}