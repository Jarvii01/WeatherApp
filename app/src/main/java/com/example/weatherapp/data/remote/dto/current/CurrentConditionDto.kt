package com.example.weatherapp.data.remote.dto.current

import com.google.gson.annotations.SerializedName

data class CurrentConditionDto(
    @SerializedName("text") val conditionText: String,
    @SerializedName("icon") val iconUrl: String
)
