package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class klang_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klang_region)

        val tanjungharapanbtn: Button = findViewById (R.id.tanjungharapanbtn)

        tanjungharapanbtn.setOnClickListener() {
            val intent = Intent(this, tanjungharapan::class.java)
            startActivity(intent)
        }

        val silkpalacebtn: Button = findViewById (R.id.silkpalacebtn)

        silkpalacebtn.setOnClickListener() {
            val intent = Intent(this, chennaisilk::class.java)
            startActivity(intent)
        }

        val masjidindiabtn: Button = findViewById (R.id.masjidindiabtn)

        masjidindiabtn.setOnClickListener() {
            val intent = Intent(this, masjidindia::class.java)
            startActivity(intent)
        }
    }
}