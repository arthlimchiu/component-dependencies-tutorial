package com.arthlimchiu.componentdependencies.repos

import com.arthlimchiu.componentdependencies.Api
import com.arthlimchiu.componentdependencies.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ReposModule {

    @Provides
    @ActivityScope
    fun providesReposRepository(api: Api): ReposRepository {
        return ReposRepositoryImpl(api)
    }
}