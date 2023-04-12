package com.example.myapplication.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.ImageButton
import android.widget.TextView
import com.example.myapplication.R
import java.util.*

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        /** Creacion de los botones (aunque son imagebuttons)
         *  para mas tarde redireccionarlo
         * a sus respectivas pestañas de la app
         */
        val tvCalen = findViewById<TextView>(R.id.tvCalen)
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        val btnHome = findViewById<ImageButton>(R.id.home)
        val btnCalen = findViewById<ImageButton>(R.id.cale)
        val btnSearch = findViewById<ImageButton>(R.id.lupa)
        val btnSaved = findViewById<ImageButton>(R.id.fav)
        val btnList = findViewById<ImageButton>(R.id.lista)

        /** Redireccionamiento de cada boton a su pestaña
         *  correspondiente, para ello utilizamos intent
         */

        btnSaved.setOnClickListener {
            val intent = Intent(this,SavedActivity::class.java)
            startActivity(intent)
        }
        btnSearch.setOnClickListener {
            val intent = Intent(this,SearchActivity::class.java)
            startActivity(intent)
        }
        btnList.setOnClickListener {
            val intent = Intent(this,NotesActivity::class.java)
            startActivity(intent)
        }
        btnHome.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        val currentDate = Calendar.getInstance()
        calendarView.date = currentDate.timeInMillis

    }
}