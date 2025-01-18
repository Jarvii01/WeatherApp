package com.example.weatherapp.data.repository

import com.example.weatherapp.data.mapper.toEntityList
import com.example.weatherapp.data.remote.api.ApiService
import com.example.weatherapp.domain.entity.City
import com.example.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> = apiService.searchCity(query)
        .toEntityList()
}
