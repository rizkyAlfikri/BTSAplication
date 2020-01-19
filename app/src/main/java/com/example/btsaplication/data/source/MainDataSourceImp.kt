package com.example.btsaplication.data.source

import com.example.btsaplication.data.source.remote.RemoteRepository

class MainDataSourceImp private constructor(private val remoteRepository: RemoteRepository): MainDataSource{


    companion object{
        private var INSTANCE: MainDataSourceImp? = null

        fun newInstance(remoteRepository: RemoteRepository): MainDataSourceImp {
            if (INSTANCE == null) {
                INSTANCE =
                    MainDataSourceImp(
                        remoteRepository
                    )
            }

            return MainDataSourceImp(
                remoteRepository
            )
        }
    }


    override fun getSignUpData() {
        remoteRepository.getSignUp()
    }

    override fun getSignInData() {
        remoteRepository.getSignIn()
    }
}