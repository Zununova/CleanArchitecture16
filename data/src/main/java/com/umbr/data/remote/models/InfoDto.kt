package com.umbr.data.remote.models


import com.google.gson.annotations.SerializedName

data class InfoDto(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("prev")
    val prev: Any
)