package com.example.buttonnavegation.ui.calendario

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.icu.util.Calendar
import android.widget.CalendarView
import com.example.buttonnavegation.R

class calendarioViewModel: ViewModel() {

        private val _text = MutableLiveData<String>().apply {
            value = "Este es el fragmento del calendario"
        }
        val text: LiveData<String> = _text


}