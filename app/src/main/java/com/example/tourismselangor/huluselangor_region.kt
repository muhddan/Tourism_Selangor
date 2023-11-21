package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class huluselangor_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huluselangor_region)


        val serendahwaterbtn: Button = findViewById (R.id.serendahwaterbtn)

        serendahwaterbtn.setOnClickListener() {
            val intent = Intent(this, serendah_waterfall::class.java)
            startActivity(intent)
        }

        val gentingfarmbtn: Button = findViewById (R.id.gentingfarmbtn)

        gentingfarmbtn.setOnClickListener() {
            val intent = Intent(this, gentingfarm::class.java)
            startActivity(intent)
        }

        val darulquranbtn: Button = findViewById (R.id.darulquranbtn)

        darulquranbtn.setOnClickListener() {
            val intent = Intent(this, darulquran::class.java)
            startActivity(intent)
        }
    }
}