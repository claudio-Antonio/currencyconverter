package com.example.conversordemoedas.domain.model

import kotlinx.serialization.SerialName

data class CurrencyConversion(
    val baseCode: String,
    val targetCode: String,
    val convertionRate: String,
    val convertionResult: String
)
