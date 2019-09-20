package com.arthlimchiu.componentdependencies.repos

import com.google.gson.annotations.SerializedName

data class Repo(
    @SerializedName("name") val name: String
)