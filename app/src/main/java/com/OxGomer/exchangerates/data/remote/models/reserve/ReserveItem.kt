package com.OxGomer.exchangerates.data.remote.models.reserve

data class ReserveItem(
    val dt: String,
    val freq: String,
    val id_api: String,
    val leveli: Int,
    val parent: String,
    val txt: String,
    val txten: String,
    val tzep: String,
    val value: Double
)