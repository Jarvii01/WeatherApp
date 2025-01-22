package com.example.weatherapp.data.mapper

import com.example.weatherapp.data.remote.dto.location.CityDto
import com.example.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntityList(): List<City> = map { it.toEntity() }
