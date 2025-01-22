package com.example.weatherapp.data.remote.dto.current

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("condition") val condition: CurrentConditionDto,
    @SerializedName("temp_c") val tempC: Float,
    @SerializedName("last_updated_epoch") val data: Long,


    )
