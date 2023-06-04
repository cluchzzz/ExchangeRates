package com.OxGomer.exchangerates.data.remote

import com.OxGomer.exchangerates.data.remote.api.RetrofitInstanse
import com.OxGomer.exchangerates.data.remote.models.rates.Rates
import com.OxGomer.exchangerates.data.remote.models.reserve.Reserve
import retrofit2.Response

class Repository {
    suspend fun getRates(): Response<Rates>{
        return RetrofitInstanse.api.getRates()
    }

    suspend fun getReserve(): Response<Reserve> {
        return RetrofitInstanse.api.getReserve()
    }
}