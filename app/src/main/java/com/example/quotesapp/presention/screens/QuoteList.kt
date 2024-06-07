package com.example.quotesapp.presention.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quotesapp.models.QuoteModel

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 07/06/2024
 */


@Composable
fun QuoteList(datas:Array<QuoteModel>,onClick:(quote:QuoteModel)->Unit){

    LazyColumn(content = {

      items(datas){
          QuoteListItem(quote = it,onClick)
      }

    })
}