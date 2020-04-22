package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu4 : AppCompatActivity() {
    private lateinit var btn_menu: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)
        btn_menu = findViewById(R.id.btn_menu)

        btn_menu.setOnClickListener{
            startActivity(Intent(this, Menu1::class.java))}
    }
}
