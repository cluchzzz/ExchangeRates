package com.OxGomer.exchangerates.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstanse {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://bank.gov.ua/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}