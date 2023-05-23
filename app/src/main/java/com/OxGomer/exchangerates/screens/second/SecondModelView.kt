package com.OxGomer.exchangerates.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.OxGomer.exchangerates.data.repository.Repository
import com.OxGomer.exchangerates.model.rates.Rates
import com.OxGomer.exchangerates.model.reserve.Reserve
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondModelView: ViewModel() {
    var repo = Repository()
    val MoneyList: MutableLiveData<Response<Reserve>> = MutableLiveData()

    fun getReserve(){
        viewModelScope.launch {
            MoneyList.value = repo.getReserve()
        }
    }
}