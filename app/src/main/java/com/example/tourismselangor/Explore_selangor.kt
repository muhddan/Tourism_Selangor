package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Explore_selangor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_selangor)

        val gombakbtn: Button = findViewById (R.id.gombakbtn)

        gombakbtn.setOnClickListener() {
            val intent = Intent(this, Gombak_region::class.java)
            startActivity(intent)
        }

        val hululangatbtn: Button = findViewById (R.id.hululangatbtn)

        hululangatbtn.setOnClickListener() {
            val intent = Intent(this, hululangat_region::class.java)
            startActivity(intent)
        }

        val huluselangorbtn: Button = findViewById (R.id.huluselangorbtn)

        huluselangorbtn.setOnClickListener() {
            val intent = Intent(this, huluselangor_region::class.java)
            startActivity(intent)
        }

        val klangbtn: Button = findViewById (R.id.klangbtn)

        klangbtn.setOnClickListener() {
            val intent = Intent(this, klang_region::class.java)
            startActivity(intent)
        }

        val kualalangatbtn: Button = findViewById (R.id.kualalangatbtn)

        kualalangatbtn.setOnClickListener() {
            val intent = Intent(this, kualalangat_region::class.java)
            startActivity(intent)
        }

        val kualaselangorbtn: Button = findViewById (R.id.kualaselangorbtn)

        kualaselangorbtn.setOnClickListener() {
            val intent = Intent(this, kualaselangor_region::class.java)
            startActivity(intent)
        }

        val petalingbtn: Button = findViewById (R.id.petalingbtn)

        petalingbtn.setOnClickListener() {
            val intent = Intent(this, petaling_region::class.java)
            startActivity(intent)
        }

        val sabakbernambtn: Button = findViewById (R.id.sabakbernambtn)

        sabakbernambtn.setOnClickListener() {
            val intent = Intent(this, sabakbernam_region::class.java)
            startActivity(intent)
        }

        val sepangbtn: Button = findViewById (R.id.sepangbtn)

        sepangbtn.setOnClickListener() {
            val intent = Intent(this, sepang_region::class.java)
            startActivity(intent)
        }

    }
}