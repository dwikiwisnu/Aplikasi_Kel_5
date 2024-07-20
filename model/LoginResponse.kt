package com.example.uas_kel5_android.model

data class LoginResponse(
    val status: Boolean,
    val message: String,
    val data: Data?
) {
    data class Data(
        val id: Int,
        val username: String
    )
}