package com.google.com.mvvm

import retrofit2.http.GET
import retrofit2.http.Path

interface GithubAPI {

    @GET("users/{user}")
    fun getUser(@Path("user") user: String): String

}
