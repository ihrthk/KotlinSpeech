package com.example.kotlinspeech

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/{user}")
    suspend fun getUserInfo(@Path("user") user: String): Repo
}

data class Repo(val id: Long, val name: String, val avatar_url: String)