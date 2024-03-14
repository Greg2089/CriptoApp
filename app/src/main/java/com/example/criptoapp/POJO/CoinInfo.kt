package com.example.criptoapp.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CoinInfo(
    @SerializedName("Id")
    @Expose
    val id: String? = null,

    @SerializedName("Name")
    @Expose
    val name: String? = null,

    @SerializedName("FullName")
    @Expose
    val fullName: String? = null,

    @SerializedName("ImageUrl")
    @Expose
    private val imageUrl: String? = null
)