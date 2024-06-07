package com.example.quotesapp.presention.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesapp.DataManager
import com.example.quotesapp.R
import com.example.quotesapp.models.QuoteModel

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 07/06/2024
 */

@Composable
fun QuoteDetailed(quote: QuoteModel) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(),
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 24.dp)

        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth(1f)
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {

//                imageVector = Icons.Filled.Star,
//                colorFilter = ColorFilter.tint(Color.Black),

                Image(
                    painter = painterResource(id = R.drawable.quote),

                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180f)
                )
                Text(
                    text = quote.text,
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(top = 10.dp)

                )

                Text(
                    text = quote.author,
                    color = Color.Black,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 8.dp)

                )
            }

        }

    }

}