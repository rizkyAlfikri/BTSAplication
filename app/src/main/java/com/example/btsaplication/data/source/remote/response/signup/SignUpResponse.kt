package com.example.btsaplication.data.source.remote.response.signup

import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("user")
    val user: UserResponse
)