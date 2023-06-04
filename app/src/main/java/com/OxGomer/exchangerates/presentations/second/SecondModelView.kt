package com.OxGomer.exchangerates.presentations.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.OxGomer.exchangerates.data.remote.Repository
import com.OxGomer.exchangerates.data.remote.models.reserve.Reserve
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