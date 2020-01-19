package com.example.btsaplication.data.source.remote.response.signin

import com.google.gson.annotations.SerializedName

data class SignInResponse(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String
)