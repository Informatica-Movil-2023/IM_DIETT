package com.example.buttonnavegation.ui.busqueda

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class BusquedaViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este es el fragmento de la busqueda"
    }
    val text: LiveData<String> = _text

}