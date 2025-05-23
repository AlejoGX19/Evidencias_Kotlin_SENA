package com.sena.project_1.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController

@Composable
fun Info(navController: NavHostController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(text = "Hola desde ventana 2", textAlign = TextAlign.Center)

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Button(onClick = { navController.navigate("detalles")}) {
                    Text(text = "Ir a detalles")
                }
                Button(onClick = { navController.navigate("home")}) {
                    Text(text = "Ir a Home")
                }
            }
        }
    }
}