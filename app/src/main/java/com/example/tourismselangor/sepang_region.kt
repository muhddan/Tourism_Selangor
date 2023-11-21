package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sepang_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sepang_region)

        val mitsuibtn: Button = findViewById (R.id.mitsuibtn)

        mitsuibtn.setOnClickListener() {
            val intent = Intent(this, mitsuioutlet::class.java)
            startActivity(intent)
        }

        val ioimallbtn: Button = findViewById (R.id.ioimallbtn)

        ioimallbtn.setOnClickListener() {
            val intent = Intent(this, ioicity::class.java)
            startActivity(intent)
        }

        val sepangcircuitbtn: Button = findViewById (R.id.sepangcircuitbtn)

        sepangcircuitbtn.setOnClickListener() {
            val intent = Intent(this, sepang::class.java)
            startActivity(intent)
        }
    }
}