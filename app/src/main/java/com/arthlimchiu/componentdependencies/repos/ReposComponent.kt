package com.arthlimchiu.componentdependencies.repos

import com.arthlimchiu.componentdependencies.di.ActivityScope
import com.arthlimchiu.componentdependencies.di.AppComponent
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ReposModule::class]
)
interface ReposComponent {

    fun inject(activity: ReposActivity)
}