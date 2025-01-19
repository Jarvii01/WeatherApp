package com.example.weatherapp.domain.useCase.favourite

import com.example.weatherapp.domain.entity.City
import com.example.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class AddToFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    suspend operator fun invoke(city: City) = repository.addToFavourite(city)

}
