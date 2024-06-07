package com.example.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import com.example.quotesapp.models.QuoteModel
import com.google.gson.Gson
import java.nio.charset.Charset

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 07/06/2024
 */

object DataManager {

     var  data = emptyArray<QuoteModel>()

    var currentPage= mutableStateOf(Pages.LISTING)
    var isDataLoaded = mutableStateOf(false)

    var currentQuote:QuoteModel? = null


    fun loadAssetsFromFile(context: Context){

        var inputStream=  context.assets.open("quote.json")
        val size:Int= inputStream.available()
        val buffer= ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, Charsets.UTF_8)

        val gson = Gson()
        data= gson.fromJson(json,Array<QuoteModel>::class.java)
        isDataLoaded.value  = true
    }

    fun switchPages(quote:QuoteModel?){

        if (currentPage.value==Pages.LISTING){
            currentQuote = quote
            currentPage.value =Pages.DETAILED
        }else{
            currentPage.value= Pages.LISTING
        }

    }
}