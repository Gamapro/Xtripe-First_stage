package com.example.examen2doparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Grid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        val button = findViewById<Button>(R.id.button_grid_back)

        // val lista = intent.getStringArrayListExtra("lista")
        val str = intent.getStringExtra("str")
        val text_lista = findViewById<TextView>(R.id.text_lista)

        text_lista.text = str

        /*
        for (element in lista!!) {
            val text = text_lista.text.toString() + element
            text_lista.text = text
        }
        */

        button.setOnClickListener {
            finish()
        }
    }

}