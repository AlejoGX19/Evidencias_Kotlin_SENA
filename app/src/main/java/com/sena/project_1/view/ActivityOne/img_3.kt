package com.sena.project_1.view.ActivityOne

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.project_1.R

@Composable
fun Img_3(){
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
                    painter = painterResource(R.drawable.img3),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 80.dp)
                        .size(350.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )

                Text(text = "Get Started!",
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 50.dp)
                        .padding(horizontal = 70.dp)
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 100.dp)
                        .padding(horizontal = 30.dp)
                        .height(50.dp)
                        .border(BorderStroke(2.dp, Color.Blue), shape = RoundedCornerShape(26.dp)),
                        colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = LocalContentColor.current
                    )
                ) {
                    Text(
                        text = "REGISTRATION",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                Row(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 20.dp)
                        .padding(horizontal = 50.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Already have an account? ",
                        fontSize = 20.sp,
                        color = Color.Gray,
                    )
                    Text(
                        text = "Login",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}