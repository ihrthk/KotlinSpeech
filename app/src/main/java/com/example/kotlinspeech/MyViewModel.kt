package com.example.kotlinspeech

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {

    fun showText() {
        viewModelScope.launch {

        }
    }
}