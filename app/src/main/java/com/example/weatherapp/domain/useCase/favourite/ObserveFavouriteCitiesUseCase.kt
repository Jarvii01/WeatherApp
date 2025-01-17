package com.example.weatherapp.domain.useCase.favourite

import com.example.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class ObserveFavouriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke(cityId: Int) = repository.observeIsFavourite(cityId)
}
