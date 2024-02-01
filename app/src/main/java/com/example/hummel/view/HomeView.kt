package com.example.hummel.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hummel.R
import com.example.hummel.Screen

@Composable
fun HomeView(
    navController: NavController
) {

    val provider = OneEntryProducts.instance

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.grue),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Нажми на кнопку",
            fontSize = 30.sp,
            fontWeight = FontWeight.W500
        )

        Button(
            onClick = {
                navController.navigate(route = Screen.SecondScreen.route)
            }
        ) {

            Text(text = "Кнопка")
        }
    }
}