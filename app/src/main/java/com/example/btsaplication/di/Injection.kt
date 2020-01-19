package com.example.btsaplication.di

import com.example.btsaplication.data.source.MainDataSourceImp
import com.example.btsaplication.data.source.remote.RemoteRepository
import com.example.btsaplication.network.ApiService
import com.example.btsaplication.network.RetrofirService

class Injection {

    companion object{
        fun provideRepositoryResource(): MainDataSourceImp {
            val apiService = RetrofirService.createService(ApiService::class.java)

            val remoteRepository = RemoteRepository.newInstance(apiService)

            return MainDataSourceImp.newInstance(remoteRepository)

        }
    }
}