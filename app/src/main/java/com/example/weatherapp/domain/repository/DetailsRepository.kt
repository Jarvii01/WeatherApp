package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.entity.Forecast
import com.example.weatherapp.domain.entity.Weather

interface DetailsRepository {


    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast




}
