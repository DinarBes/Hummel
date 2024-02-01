package com.example.hummel

sealed class Screen(val route: String) {

    object HomeScreen: Screen(route = "home_screen")

    object SecondScreen: Screen(route = "second_screen")
}