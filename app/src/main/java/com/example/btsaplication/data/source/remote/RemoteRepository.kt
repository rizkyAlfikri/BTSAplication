package com.example.btsaplication.data.source.remote

import com.example.btsaplication.network.ApiService

class RemoteRepository private constructor(private val apiService: ApiService){

    companion object{

        private var INSTANCE: RemoteRepository? = null

        fun newInstance(apiService: ApiService): RemoteRepository {
            if (INSTANCE == null) {
                INSTANCE = RemoteRepository(apiService)
            }

            return INSTANCE ?: RemoteRepository(apiService)
        }

    }

    fun getSignUp() {
        apiService.signInUser()
    }

    fun getSignIn() {
        apiService.signInUser()
    }


}