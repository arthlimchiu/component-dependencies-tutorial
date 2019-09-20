package com.arthlimchiu.componentdependencies.userdetails

import com.arthlimchiu.componentdependencies.di.ActivityScope
import com.arthlimchiu.componentdependencies.Api
import dagger.Module
import dagger.Provides

@Module
class UserDetailsModule {

    @Provides
    @ActivityScope
    fun providesUserRepository(api: Api): UserRepository {
        return UserRepositoryImpl(api)
    }
}