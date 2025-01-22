package com.example.weatherapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkivanov.decompose.defaultComponentContext
import com.example.weatherapp.WeatherApp
import com.example.weatherapp.domain.useCase.favourite.AddToFavouriteStateUseCase
import com.example.weatherapp.domain.useCase.favourite.GetFavouriteCitiesUseCase
import com.example.weatherapp.domain.useCase.search.SearchCityUseCase
import com.example.weatherapp.presentation.root.DefaultRootComponent
import com.example.weatherapp.presentation.root.RootContent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var rootComponentFactory: DefaultRootComponent.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as WeatherApp).applicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RootContent(component = rootComponentFactory.create(defaultComponentContext()))
        }
    }
}

