package com.example.weatherapp.domain.useCase.details

import com.example.weatherapp.domain.repository.DetailsRepository
import com.example.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val repository: DetailsRepository
) {

   suspend operator fun invoke(cityId: Int) = repository.getWeather(cityId)
}

