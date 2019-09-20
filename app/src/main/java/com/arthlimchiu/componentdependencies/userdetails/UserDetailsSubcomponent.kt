package com.arthlimchiu.componentdependencies.userdetails

import com.arthlimchiu.componentdependencies.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        UserDetailsModule::class
    ]
)
interface UserDetailsSubcomponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): UserDetailsSubcomponent
    }

    fun inject(activity: UserDetailsActivity)
}