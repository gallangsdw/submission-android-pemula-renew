package com.sdwtech.sadewacoffee.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sdwtech.sadewacoffee.data.DataFood
import com.sdwtech.sadewacoffee.data.Food

class FoodViewModel: ViewModel() {
    private val listfood = MutableLiveData<List<Food>>()

    fun setData() {
        listfood.postValue(DataFood.getDataFood())
    }

    fun getData(): LiveData<List<Food>> = listfood
}