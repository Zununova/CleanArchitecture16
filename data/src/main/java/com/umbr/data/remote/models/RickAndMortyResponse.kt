package com.umbr.data.remote.models

import com.google.gson.annotations.SerializedName

data class RickAndMortyResponse(
    @SerializedName("info")
    val info: InfoDto,
    @SerializedName("results")
    val results: List<ResultDto>
)