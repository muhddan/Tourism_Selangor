package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kualalangat_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kualalangat_region)

        val splashmaniabtn: Button = findViewById (R.id.splashmaniabtn)

        splashmaniabtn.setOnClickListener() {
            val intent = Intent(this, splashmania::class.java)
            startActivity(intent)
        }

        val riversurvivebtn: Button = findViewById (R.id.riversurvivebtn)

        riversurvivebtn.setOnClickListener() {
            val intent = Intent(this, riverinepark::class.java)
            startActivity(intent)
        }

        val twentyfivebtn: Button = findViewById (R.id.twentyfivebtn)

        twentyfivebtn.setOnClickListener() {
            val intent = Intent(this, quayside::class.java)
            startActivity(intent)
        }
    }
}