package com.example.btsaplication.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofirService {
    private fun init(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://3.0.56.213:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    fun <T> createService(service: Class<T>): T {
        return init().create(service)
    }
}