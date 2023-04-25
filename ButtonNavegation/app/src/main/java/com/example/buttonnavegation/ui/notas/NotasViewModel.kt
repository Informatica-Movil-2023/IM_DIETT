package com.example.buttonnavegation.ui.notas

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class NotasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este es el fragmento de las notas"
    }
    val text: LiveData<String> = _text
}