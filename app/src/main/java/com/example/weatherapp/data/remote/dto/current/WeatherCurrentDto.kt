package com.example.weatherapp.data.remote.dto.current

import com.google.gson.annotations.SerializedName

data class WeatherCurrentDto(
    @SerializedName("current") val current: WeatherDto
)
