package com.umbr.data.remote.models


import com.google.gson.annotations.SerializedName

data class LocationDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)