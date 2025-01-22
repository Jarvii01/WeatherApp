package com.example.weatherapp.presentation.favorite

import com.example.weatherapp.domain.entity.City
import kotlinx.coroutines.flow.StateFlow

interface FavouriteComponent {

    val model: StateFlow<FavouriteStore.State>

    fun onClickSearch()

    fun onClickAddFavorite()

    fun onCityItemClick(city: City)
}
