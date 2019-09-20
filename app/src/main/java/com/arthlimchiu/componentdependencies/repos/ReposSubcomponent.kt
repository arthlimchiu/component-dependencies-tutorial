package com.arthlimchiu.componentdependencies.repos

import com.arthlimchiu.componentdependencies.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        ReposModule::class
    ]
)
interface ReposSubcomponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): ReposSubcomponent
    }

    fun inject(activity: ReposActivity)
}