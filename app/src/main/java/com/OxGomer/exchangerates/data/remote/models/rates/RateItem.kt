package com.OxGomer.exchangerates.data.remote.models.rates

data class RateItem(
    val cc: String,
    val exchangedate: String,
    val r030: Int,
    val rate: Double,
    val txt: String
)