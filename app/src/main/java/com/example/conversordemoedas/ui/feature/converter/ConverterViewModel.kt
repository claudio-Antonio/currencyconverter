package com.example.conversordemoedas.ui.feature.converter

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.conversordemoedas.ui.feature.converter.model.ConverterFormEvent
import com.example.conversordemoedas.ui.feature.converter.model.ConverterFormState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ConverterViewModel: ViewModel() {
    private val _formState = MutableStateFlow(ConverterFormState())
    val formState = _formState.asStateFlow()

    init {
        _formState.update {
            it.copy(
                fromCurrenciesList = listOf("BRL", "USD", "EUR"),
                toCurrenciesList = listOf("USD", "BRL", "EUR"),
                fromCurrencySelected = "BRL",
                toCurrencySelected = "USD"
            )
        }
    }

    fun onFormEvent(event: ConverterFormEvent) {
        when (event) {
            is ConverterFormEvent.OnFromCurrencySelected -> {
                _formState.update {
                    it.copy(fromCurrencySelected = event.currency)
                }
            }

            is ConverterFormEvent.OnToCurrencySelected -> {
                _formState.update {
                    it.copy(toCurrencySelected = event.currency)
                }
            }

            is ConverterFormEvent.OnFromCurrencyAmountChanged -> {
                _formState.update {
                    it.copy(fromCurrencySelected = event.amount)
                }
            }

            ConverterFormEvent.SendConverterForm -> {
                Log.d("ConverterViewModel", "onFormEvent: ${_formState.value}")
            }
        }
    }
}