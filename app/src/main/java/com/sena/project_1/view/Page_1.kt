package com.sena.project_1.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {
            Text(text = "Hola desde ventana 1")
            Button(onClick = { navController.navigate("info")}) {
                Text(text = "Ir a Info")
            }
            Button(onClick = { navController.navigate("home")}) {
                Text(text = "Ir a Home")
            }
        }
    }
}