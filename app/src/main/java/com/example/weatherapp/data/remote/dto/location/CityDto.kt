package com.example.weatherapp.data.remote.dto.location

import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("id") val id: String,
    @SerializedName("name") val cityName: String,
    @SerializedName("country") val country: String,

    )
