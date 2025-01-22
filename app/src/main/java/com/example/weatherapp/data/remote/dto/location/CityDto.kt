package com.example.weatherapp.data.remote.dto.location

import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") val country: String,

    )
