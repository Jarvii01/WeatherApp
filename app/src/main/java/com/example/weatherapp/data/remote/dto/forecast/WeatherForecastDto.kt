package com.example.weatherapp.data.remote.dto.forecast

import com.example.weatherapp.data.remote.dto.current.WeatherDto
import com.google.gson.annotations.SerializedName

data class WeatherForecastDto(
    @SerializedName("current") val current: WeatherDto,
    @SerializedName("forecast") val forecast: ForecastDto
)
