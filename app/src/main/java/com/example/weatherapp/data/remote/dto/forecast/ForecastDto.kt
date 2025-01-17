package com.example.weatherapp.data.remote.dto.forecast

import com.google.gson.annotations.SerializedName

data class ForecastDto (
    @SerializedName("forecastday") val forecastday: List<Day>
)
