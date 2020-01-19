package com.example.btsaplication.network

import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @POST("api/signup")
    fun signUpUser()

    @POST("api/signin")
    fun signInUser()
}