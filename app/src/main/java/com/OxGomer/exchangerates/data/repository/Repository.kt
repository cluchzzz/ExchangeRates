package com.OxGomer.exchangerates.data.repository

import com.OxGomer.exchangerates.data.api.RetrofitInstanse
import com.OxGomer.exchangerates.model.rates.Rates
import com.OxGomer.exchangerates.model.reserve.Reserve
import retrofit2.Response

class Repository {
    suspend fun getRates(): Response<Rates>{
        return RetrofitInstanse.api.getRates()
    }

    suspend fun getReserve(): Response<Reserve> {
        return RetrofitInstanse.api.getReserve()
    }
}