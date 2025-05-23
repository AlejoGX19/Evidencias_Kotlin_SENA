package com.sena.project_1.view.ActivityOne

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.sena.project_1.Botones
import com.sena.project_1.R

@Composable
fun Img_1(pagerState: Int) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = ".bibi",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(80.dp))

                Image(
                    painter = painterResource(R.drawable.img1),
                    contentDescription = null,
                    modifier = Modifier.size(350.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))

                Text(
                    text = "For students who want to become flight attendants",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 40.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))

                Text(
                    text = "Communicate with flight attendants, meet, find out useful information that will help you fulfill your dream.",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 35.dp)
                )
                Botones(pagerState)
            }
        }
    }
}