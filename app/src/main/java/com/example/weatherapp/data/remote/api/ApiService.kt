package com.example.weatherapp.data.remote.api

import com.example.weatherapp.data.remote.dto.current.WeatherCurrentDto
import com.example.weatherapp.data.remote.dto.forecast.WeatherForecastDto
import com.example.weatherapp.data.remote.dto.location.CityDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current.json")
    suspend fun loadCurrentWeather(
        @Query("q") query: String,
    ): WeatherCurrentDto

    @GET("forecast.json")
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") daysCount: Int = 4,
    ): WeatherForecastDto

    @GET("search.json")
    suspend fun searchCity(
        @Query("q") query: String,
    ): List<CityDto>

}
