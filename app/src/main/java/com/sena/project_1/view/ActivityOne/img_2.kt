package com.sena.project_1.view.ActivityOne

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.project_1.R

@Composable
fun Img_2(){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item (){

            Column(
                modifier = Modifier
                    .fillMaxWidth().padding(top = 50.dp)
                ){
                Text(text = ".bibi",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 20.dp)
                )

                Image(
                    painter = painterResource(R.drawable.img2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .size(350.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )

                Text(text = "For cabin crew who want to train Students",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 50.dp)
                        .padding(horizontal = 70.dp)
                )

                Text(text = "Share your knowledge \n with students, recruit students \n and earn money on it",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier

                        .padding(top = 40.dp)
                        .padding(horizontal = 70.dp),

                    )
            }
        }
    }
}