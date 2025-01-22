package com.example.weatherapp.domain.useCase.favourite

import com.example.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class RemoveFromFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    suspend operator fun invoke(cityId: Int) = repository.removeFromFavourite(cityId)
}
