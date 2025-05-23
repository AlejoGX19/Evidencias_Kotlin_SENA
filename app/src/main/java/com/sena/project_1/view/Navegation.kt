package com.sena.project_1.view

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegate(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "home"){
        composable("home"){
            Home(navController)
        }
        composable("info"){
            Info(navController)
        }
        composable("detalles"){
            Detalles(navController)
        }
    }
}