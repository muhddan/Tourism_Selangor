package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class petaling_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petaling_region)

        val watchetawanbtn: Button = findViewById (R.id.watchetawanbtn)

        watchetawanbtn.setOnClickListener() {
            val intent = Intent(this, watchetawan::class.java)
            startActivity(intent)
        }

        val gardensmallbtn: Button = findViewById (R.id.gardensmallbtn)

        gardensmallbtn.setOnClickListener() {
            val intent = Intent(this, tropicanagardensmall::class.java)
            startActivity(intent)
        }

        val selangorjapanbtn: Button = findViewById (R.id.selangorjapanbtn)

        selangorjapanbtn.setOnClickListener() {
            val intent = Intent(this, selangorjapan::class.java)
            startActivity(intent)
        }
    }
}