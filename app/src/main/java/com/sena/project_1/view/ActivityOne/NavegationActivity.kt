package com.sena.project_1.view.ActivityOne

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.project_1.Horizontal

@Composable
fun NavegateActivity(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Horizontal"){
        composable("Horizontal") {
            Horizontal(navController)
        }
        composable("inicio"){
            Login(navController)
        }
        composable("register"){
            Register(navController)
        }
    }
}