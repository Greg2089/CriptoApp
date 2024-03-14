package com.example.criptoapp.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CoinInfoListOfData(

    @SerializedName("Data")
    @Expose
    val data: List<Datum>? = null
)

