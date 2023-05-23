package com.OxGomer.exchangerates.model.rates

data class RateItem(
    val cc: String,
    val exchangedate: String,
    val r030: Int,
    val rate: Double,
    val txt: String
)