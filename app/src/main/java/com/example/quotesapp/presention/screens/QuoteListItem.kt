package com.example.quotesapp.presention.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesapp.R
import com.example.quotesapp.models.QuoteModel

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 07/06/2024
 */

//@Preview(showBackground = true, widthDp = 400)

@Composable
fun QuoteListItem(quote:QuoteModel,onClick:(quote:QuoteModel)->Unit) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.White
        ),
        modifier = Modifier.clickable {  onClick(quote)
        }.padding(horizontal = 15.dp, vertical = 10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),

        ) {

        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.quote),
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = ""
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Column(modifier = Modifier.weight(1F)) {

                Text(
                    text = quote.text,
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 8.dp)
                )
                Box(
                    modifier = Modifier.background(
                        Color(0xFFEEEEEE),
                    ).fillMaxWidth(.4F).height(1.dp)
                )
                Text (text = quote.author,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Thin,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 4.dp)
                )

            }

        }

    }
}



