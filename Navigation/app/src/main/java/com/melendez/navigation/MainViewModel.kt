package com.melendez.navigation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val name =MutableLiveData("")
    val lastName =MutableLiveData("")
}