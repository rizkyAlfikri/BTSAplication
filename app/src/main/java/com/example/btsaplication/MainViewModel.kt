package com.example.btsaplication

import androidx.lifecycle.ViewModel
import com.example.btsaplication.data.source.remote.response.signup.SignUpResponse
import com.example.btsaplication.di.Injection

class MainViewModel: ViewModel() {

    private val mainDataSourceImp = Injection.provideRepositoryResource()


    fun getSignUp(data: SignUpResponse) {
        mainDataSourceImp.getSignUpData()
    }

    fun getSignIn(data: SignUpResponse) {
        mainDataSourceImp.getSignInData()
    }
}