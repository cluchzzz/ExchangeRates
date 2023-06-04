package com.OxGomer.exchangerates.presentations.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.OxGomer.exchangerates.data.remote.Repository
import com.OxGomer.exchangerates.data.remote.models.rates.Rates
import kotlinx.coroutines.launch
import retrofit2.Response

class StartModelView: ViewModel() {
    var repo = Repository()
    val MoneyList: MutableLiveData<Response<Rates>> = MutableLiveData()

    fun getCash(){
        viewModelScope.launch {
            MoneyList.value = repo.getRates()
        }
    }
}