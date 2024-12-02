package com.example.victor_vallecillos_uf1_act16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnVerd).setOnClickListener {
            startActivity(Intent(this, VerdActivity::class.java))
        }

        findViewById<Button>(R.id.btnVermell).setOnClickListener {
            startActivity(Intent(this, VermellActivity::class.java))
        }

        findViewById<Button>(R.id.btnBlau).setOnClickListener {
            startActivity(Intent(this, BlauActivity::class.java))
        }
    }
}