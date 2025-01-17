package com.example.weatherapp.data.remote.dto.forecast

import com.example.weatherapp.data.remote.dto.current.CurrentConditionDto
import com.google.gson.annotations.SerializedName

data class DayDto(
    @SerializedName("condition") val condition: CurrentConditionDto,
    @SerializedName("avgtemp_c") val avgtempC: Float,
)
