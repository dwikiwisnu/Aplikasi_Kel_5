package com.example.uas_kel5_android.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: Int,
    val name: String,
    val desc: String,
    val price: String,
    val image: String,
    val created_at: String,
    val updated_at: String,
    var isFavorite: Boolean = false
) : Parcelable