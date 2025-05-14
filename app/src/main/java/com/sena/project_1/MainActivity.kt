package com.sena.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sena.project_1.ui.theme.Project_1Theme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.sena.project_1.view.ActivityOne.Img_1
import com.sena.project_1.view.ActivityOne.Img_2
import com.sena.project_1.view.ActivityOne.Img_3
import com.sena.project_1.view.Scrol

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                //Scrol()
                Img_1()
                //Img_2()
                //Img_3()
            }
        }
    }
}
/*
@Composable
fun Base(texto1: String, texto2: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround) {
        Texto1(texto1, Modifier.width(70.dp))
        Texto1(texto2, Modifier.width(70.dp))
    }
}

@Composable
fun Centro(texto: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.Center) {
        Texto1(texto, Modifier.width(70.dp))
    }
}

@Composable
fun Col() {
    Column(modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center) {
        Base("TEXTO 1", "TEXTO 2")
        Centro("TEXTO 3")
        Base("TEXTO 4", "TEXTO 5")
    }
}

@Composable
fun Texto1(text: String, modifier: Modifier = Modifier) {
    Text(text = text, modifier = modifier, color = Color.Blue)
}
/*
@Composable
fun Texto2(text: String){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxHeight(0.5f)){
            Text(text = text,
                modifier =  Modifier
                    .fillMaxSize()
                    .padding(all = 56.dp)
                    .background(Color.Blue),)
        }
    }
}*/*/

@Composable
fun Body(){
    Column(
        modifier = Modifier.fillMaxSize(),
    ){
        Image(
            painter = painterResource(R.drawable.card),
            contentDescription = null,
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    Project_1Theme {
        //Scrol()
        //Img_1()
        //Img_2()
        //Img_3()
    }
}
