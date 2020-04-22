package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profil : AppCompatActivity() {
    private lateinit var btn_home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        btn_home = findViewById(R.id.btn_home)

        btn_home.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))}
    }
}
