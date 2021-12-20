package com.example.stocksapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id:Int,
    val email:String,
    val password: String? = null,
    val token:String,
    val memberSince:Long
) : Parcelable

