package com.example.victor_vallecillos_uf1_act16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VermellActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vermell)

        val textView = findViewById<TextView>(R.id.textViewVermell)
        textView.text = "RGB: 255, 0, 0"

        val botonVolver = findViewById<Button>(R.id.botonVolverVermell)
        botonVolver.setOnClickListener {
            finish()
        }
    }
}