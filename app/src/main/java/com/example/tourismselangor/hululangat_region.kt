package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hululangat_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hululangat_region)

        val tasikcempakabtn: Button = findViewById (R.id.tasikcempakabtn)

        tasikcempakabtn.setOnClickListener() {
            val intent = Intent(this, tasikcempaka::class.java)
            startActivity(intent)
        }

        val sungailepohbtn: Button = findViewById (R.id.sungailepohbtn)

        sungailepohbtn.setOnClickListener() {
            val intent = Intent(this, sungailepoh::class.java)
            startActivity(intent)
        }

        val chongkakparkbtn: Button = findViewById (R.id.chongkakparkbtn)

        chongkakparkbtn.setOnClickListener() {
            val intent = Intent(this, chongkakpark::class.java)
            startActivity(intent)
        }
    }
}