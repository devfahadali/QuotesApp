package com.example.quotesapp.presention.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotesapp.models.QuoteModel

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 08/06/2024
 */

@Composable
fun QuoteListScreen(data: Array<QuoteModel>, onClick: (quote:QuoteModel) -> Unit) {

    Column {

        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 24.dp)
                .fillMaxWidth(1f)
        )

        QuoteList(datas = data,onClick)
    }
}