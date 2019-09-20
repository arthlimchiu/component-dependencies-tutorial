package com.arthlimchiu.componentdependencies.userdetails

import com.arthlimchiu.componentdependencies.di.ActivityScope
import com.arthlimchiu.componentdependencies.di.AppComponent
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [UserDetailsModule::class]
)
interface UserDetailsComponent {

    fun inject(activity: UserDetailsActivity)
}