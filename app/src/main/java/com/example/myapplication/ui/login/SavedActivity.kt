package com.example.myapplication.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.myapplication.R

class SavedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)
        /** Creacion de los botones (aunque son imagebuttons)
         *  para mas tarde redireccionarlo
         * a sus respectivas pestañas de la app
         */
        val btnHome = findViewById<ImageButton>(R.id.home)
        val btnCalen = findViewById<ImageButton>(R.id.cale)
        val btnSearch = findViewById<ImageButton>(R.id.lupa)
        val btnSaved = findViewById<ImageButton>(R.id.fav)
        val btnList = findViewById<ImageButton>(R.id.lista)

        /** Redireccionamiento de cada boton a su pestaña
         *  correspondiente, para ello utilizamos intent
         */

        btnCalen.setOnClickListener {
            val intent = Intent(this,CalendarActivity::class.java)
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
    }
}