package com.example.weatherapp.data.remote.dto.forecast

import com.google.gson.annotations.SerializedName

data class DayDto(
    @SerializedName("date_epoch") val date: Long,
    @SerializedName("day") val day: DayWeatherDto
)
