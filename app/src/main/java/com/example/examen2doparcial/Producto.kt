package com.example.examen2doparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Producto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto)
        val button = findViewById<Button>(R.id.button_guardar)
        button.setOnClickListener {
            val nombre = findViewById<EditText>(R.id.product_name).text.toString()
            val precio = findViewById<EditText>(R.id.product_cost).text.toString()
            if (nombre.isNotEmpty() && precio.isNotEmpty()) {
                val text = nombre + " " + precio + "\n"
                // val list = intent.getStringArrayListExtra("lista")
                var str = intent.getStringExtra("str")
                str += text
                intent.putExtra("str", str)
                Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Debe ingresar datos validos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}