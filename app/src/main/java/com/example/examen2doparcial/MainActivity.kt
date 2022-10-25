package com.example.examen2doparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = ""

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            val intent = Intent(this, Producto::class.java)
            //intent.putStringArrayListExtra("lista", lista as ArrayList<String>)
            intent.putExtra("str", str)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, Grid::class.java)
            //intent.putStringArrayListExtra("lista", lista as ArrayList<String>)
            intent.putExtra("str", str)
            startActivity(intent)
        }
    }

}