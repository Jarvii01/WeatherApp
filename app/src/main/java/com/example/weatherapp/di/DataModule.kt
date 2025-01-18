package com.example.weatherapp.di

import android.app.Application
import android.content.Context
import com.example.weatherapp.data.local.db.FavouriteCitiesDao
import com.example.weatherapp.data.local.db.FavouriteDatabase
import com.example.weatherapp.data.remote.api.ApiFactory
import com.example.weatherapp.data.remote.api.ApiService
import com.example.weatherapp.data.repository.FavouriteRepositoryImpl
import com.example.weatherapp.data.repository.SearchRepositoryImpl
import com.example.weatherapp.data.repository.WeatherRepositoryImpl
import com.example.weatherapp.domain.repository.FavouriteRepository
import com.example.weatherapp.domain.repository.SearchRepository
import com.example.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    @[ApplicationScope Binds]
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideFavouriteDb(context: Context): FavouriteDatabase =
            FavouriteDatabase.getInstance(context)

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(context: Context): FavouriteCitiesDao =
            FavouriteDatabase.getInstance(context).favouriteCitiesDao()


    }


}
