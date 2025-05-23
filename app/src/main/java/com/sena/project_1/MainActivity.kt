package com.sena.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.sena.project_1.view.ActivityOne.Img_1
import com.sena.project_1.view.ActivityOne.Img_2
import com.sena.project_1.view.ActivityOne.Img_3
import com.sena.project_1.view.ActivityOne.Login
import com.sena.project_1.view.ActivityOne.NavegateActivity
import com.sena.project_1.view.ActivityOne.Register
import com.sena.project_1.view.Navegate
import com.sena.project_1.view.Scrol
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                //Horizontal()
                //Navegate()
                //Scrol()
                //Img_1()
                //Img_2()
                //Img_3()
                //Login()
                //Register()
                NavegateActivity()
            }
        }
    }
}

@Composable
fun Horizontal(navController: NavController){
    val pagerState = rememberPagerState(pageCount = {3})
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000L)
            val  nexPage = (pagerState.currentPage + 1 ) % 3
            pagerState.animateScrollToPage(page = nexPage,
                animationSpec = tween(600, easing = FastOutLinearInEasing ))
        }
    }
    HorizontalPager(state = pagerState) { page ->
        when(page){
            0 -> Img_1(pagerState.currentPage)
            1 -> Img_2(pagerState.currentPage)
            2 -> Img_3(pagerState.currentPage, navController)
            else -> Text(text = "No se encontro")
        }
    }

}

@Composable
fun Botones(pagerState: Int){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 60.dp, horizontal = 30.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(3){ i ->
            Box(
                modifier = Modifier
                    .padding(horizontal = 2.dp)
                    .size(10.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(if (pagerState == i) Color.Blue else Color.Gray)
            ){ }

        }
    }
}

@Composable
fun PrimeraVantana(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff00d7f9)),
        contentAlignment = Alignment.Center
    )
    {
        Text(text = "Hola desde ventana 1",
            modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun SegundaVantana(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff0b2d32)),
        contentAlignment = Alignment.Center
    )
    {
        Text(text = "Hola desde ventana 2",
            modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun TerceraVantana(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff003423)),
        contentAlignment = Alignment.Center
    )
    {
        Text(text = "Hola desde ventana 3",
            modifier = Modifier.align(Alignment.Center))
    }
}



//----------------------------------------------------------------------------


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
/*
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
}*/
