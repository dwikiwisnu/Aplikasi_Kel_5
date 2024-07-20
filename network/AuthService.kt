package com.example.uas_kel5_android.network

import com.example.uas_kel5_android.model.LoginRequest
import com.example.uas_kel5_android.model.LoginResponse
import com.example.uas_kel5_android.model.RegisterRequest
import com.example.uas_kel5_android.model.RegisterResponse
import com.example.uas_kel5_android.model.ProductResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {

    @POST("auth/login")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("auth/register")
    fun register(@Body registerRequest: RegisterRequest): Call<RegisterResponse>

    @GET("products")
    fun getProducts(): Call<ProductResponse>
}