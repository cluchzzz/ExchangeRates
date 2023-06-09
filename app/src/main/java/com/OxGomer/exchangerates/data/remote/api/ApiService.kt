package com.OxGomer.exchangerates.data.remote.api

import com.OxGomer.exchangerates.data.remote.models.rates.Rates
import com.OxGomer.exchangerates.data.remote.models.reserve.Reserve
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("NBUStatService/v1/statdirectory/exchange?json")
    suspend fun getRates(): Response<Rates>

    @GET("NBUStatService/v1/statdirectory/res?date=201708&json")
    suspend fun getReserve(): Response<Reserve>
}