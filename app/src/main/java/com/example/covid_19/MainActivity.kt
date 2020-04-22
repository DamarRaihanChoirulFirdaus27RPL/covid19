package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn_menu: Button
    private lateinit var btn_profil: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_menu = findViewById(R.id.btn_menu)
        btn_profil= findViewById(R.id.btn_profil)

        btn_menu.setOnClickListener{
            startActivity(Intent(this, Menu1::class.java))}
        btn_profil.setOnClickListener{
            startActivity(Intent(this, profil::class.java))}

    }
}
