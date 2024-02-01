package com.example.hummel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hummel.view.HomeView
import com.example.hummel.view.SecondView

@Composable
fun NavigationGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {

        composable(
            route = Screen.HomeScreen.route
        ) {

            HomeView(
                navController = navController
            )
        }

        composable(
            route = Screen.SecondScreen.route
        ) {

            SecondView()
        }
    }
}