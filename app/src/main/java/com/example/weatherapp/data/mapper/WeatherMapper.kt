package com.example.weatherapp.data.mapper


import com.example.weatherapp.data.remote.dto.current.WeatherCurrentDto
import com.example.weatherapp.data.remote.dto.current.WeatherDto
import com.example.weatherapp.data.remote.dto.forecast.WeatherForecastDto
import com.example.weatherapp.domain.entity.Forecast
import com.example.weatherapp.domain.entity.Weather
import java.util.Calendar
import java.util.Date

fun WeatherCurrentDto.toEntity(): Weather = current.toEntity()


fun WeatherDto.toEntity(): Weather = Weather(
    tempC = tempC,
    conditionText = condition.text,
    iconUrl = condition.iconUrl.correctImageUrl(),
    date = data.toCalendar()
)

fun WeatherForecastDto.toEntity() = Forecast(
    currentWeather = current.toEntity(),
    upcoming = forecast.forecastday.drop(1).map { dayDto ->
        val dayWeatherDto = dayDto.day
        Weather(
            tempC = dayWeatherDto.avgtempC,
            conditionText = dayWeatherDto.condition.text,
            iconUrl = dayWeatherDto.condition.iconUrl.correctImageUrl(),
            date = dayDto.date.toCalendar()
        )
    },
)

private fun Long.toCalendar() = Calendar.getInstance().apply {
    time = Date(this@toCalendar * 1000)
}

private fun String.correctImageUrl() = "https:$this".replace(
    oldValue = "64x64",
    newValue = "128x128"
)
