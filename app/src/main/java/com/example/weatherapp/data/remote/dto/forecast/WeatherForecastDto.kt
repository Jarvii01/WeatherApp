package com.example.weatherapp.data.remote.dto.forecast

import com.example.weatherapp.data.remote.dto.current.CurrentDto
import com.google.gson.annotations.SerializedName

data class WeatherForecastDto(
    @SerializedName("current") val current: CurrentDto,
    @SerializedName("forecast") val forecast: ForecastDto
)
