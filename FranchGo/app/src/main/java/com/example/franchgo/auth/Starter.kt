package com.example.franchgo.auth

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.franchgo.MainActivity
import com.example.franchgo.R

class Starter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)

        Handler().postDelayed({
            startActivity(Intent(this@Starter, MainActivity::class.java))
            finish()
        }, 1000)
    }
}