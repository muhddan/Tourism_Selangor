package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kualaselangor_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kualaselangor_region)

        val malawatihillbtn: Button = findViewById (R.id.malawatihillbtn)

        malawatihillbtn.setOnClickListener() {
            val intent = Intent(this, bukitmalawati::class.java)
            startActivity(intent)
        }

        val batuhamparbtn: Button = findViewById (R.id.batuhamparbtn)

        batuhamparbtn.setOnClickListener() {
            val intent = Intent(this, batuhampar::class.java)
            startActivity(intent)
        }

        val sultanibrahimbtn: Button = findViewById (R.id.sultanibrahimbtn)

        sultanibrahimbtn.setOnClickListener() {
            val intent = Intent(this, sultanibrahimmosque::class.java)
            startActivity(intent)
        }
    }
}