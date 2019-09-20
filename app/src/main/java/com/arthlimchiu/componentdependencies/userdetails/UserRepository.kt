package com.arthlimchiu.componentdependencies.userdetails

import com.arthlimchiu.componentdependencies.userdetails.User


interface UserRepository {

    fun getUser(username: String, onSuccess: (user: User) -> Unit, onFailure: (t: Throwable) -> Unit)
}