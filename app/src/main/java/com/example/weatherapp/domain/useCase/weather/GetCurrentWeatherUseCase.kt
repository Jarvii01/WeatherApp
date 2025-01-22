package com.example.weatherapp.domain.useCase.weather

import com.example.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

   suspend operator fun invoke(cityId: Int) = repository.getWeather(cityId)
}

