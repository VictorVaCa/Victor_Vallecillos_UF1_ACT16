package com.example.victor_vallecillos_uf1_act16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VerdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verd)

        val textView = findViewById<TextView>(R.id.textViewVerde)
        textView.text = "RGB: 0, 255, 0"

        val botonVolver = findViewById<Button>(R.id.botonVolverVerde)
        botonVolver.setOnClickListener {
            finish()
        }
    }
}