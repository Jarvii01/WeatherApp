package com.example.weatherapp.data.repository

import com.example.weatherapp.data.local.db.FavouriteCitiesDao
import com.example.weatherapp.data.local.model.CityDbModel
import com.example.weatherapp.data.mapper.toDbModel
import com.example.weatherapp.data.mapper.toEntityList
import com.example.weatherapp.domain.entity.City
import com.example.weatherapp.domain.repository.FavouriteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class FavouriteRepositoryImpl @Inject constructor(
    private val dao: FavouriteCitiesDao
) : FavouriteRepository {

    override val favouriteCities: Flow<List<City>> = dao.getFavouriteCities()
        .map { it.toEntityList() }

    override fun observeIsFavourite(cityId: Int): Flow<Boolean> = dao.observeIsFavourite(cityId)

    override suspend fun addToFavourite(city: City) = dao.addToFavourite(city.toDbModel())

    override suspend fun removeFromFavourite(cityId: Int) = dao.removeFromFavourite(cityId)
}
