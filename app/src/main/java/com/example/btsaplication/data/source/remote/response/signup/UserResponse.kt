package com.example.btsaplication.data.source.remote.response.signup

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("encrypted_password")
    val encrypted_password: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("postcode")
    val postcode: String,
    @SerializedName("username")
    val username: String
)