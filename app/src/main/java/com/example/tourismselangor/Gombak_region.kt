package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Gombak_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gombak_region)

        val tasikbirubtn: Button = findViewById (R.id.tasikbirubtn)

        tasikbirubtn.setOnClickListener() {
            val intent = Intent(this, tasikbirukundang::class.java)
            startActivity(intent)
        }

        val bigbucketbtn: Button = findViewById (R.id.bigbucketbtn)

        bigbucketbtn.setOnClickListener() {
            val intent = Intent(this, Bucket_splash::class.java)
            startActivity(intent)
        }

        val zoobtn: Button = findViewById (R.id.zoobtn)

        zoobtn.setOnClickListener() {
            val intent = Intent(this, zoo_negara::class.java)
            startActivity(intent)
        }

    }
}