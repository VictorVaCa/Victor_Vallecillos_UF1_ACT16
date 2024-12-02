package com.example.victor_vallecillos_uf1_act16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BlauActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blau)

        val textView = findViewById<TextView>(R.id.textViewBlau)
        textView.text = "RGB: 0, 0, 255"

        val botonVolver = findViewById<Button>(R.id.botonVolverBlau)
        botonVolver.setOnClickListener {
            finish()
        }
    }
}