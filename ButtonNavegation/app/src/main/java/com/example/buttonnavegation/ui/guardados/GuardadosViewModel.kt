package com.example.buttonnavegation.ui.guardados

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class GuardadosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este es el fragmento de guardados"
    }
    val text: LiveData<String> = _text
}