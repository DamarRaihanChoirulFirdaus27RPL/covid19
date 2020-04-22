package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu1 : AppCompatActivity() {
    private lateinit var btn_covid: Button
    private lateinit var btn_gejala: Button
    private lateinit var btn_lindung: Button
    private lateinit var btn_rapid: Button
    private lateinit var btn_home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
        btn_covid = findViewById(R.id.btn_covid)
        btn_gejala = findViewById(R.id.btn_gejala)
        btn_lindung = findViewById(R.id.btn_lindung)
        btn_rapid = findViewById(R.id.btn_rapid)
        btn_home = findViewById(R.id.btn_home)

        btn_covid.setOnClickListener{
            startActivity(Intent(this, menu::class.java))}
        btn_gejala.setOnClickListener{
            startActivity(Intent(this, menu2::class.java))}
        btn_lindung.setOnClickListener{
            startActivity(Intent(this, menu3::class.java))}
        btn_rapid.setOnClickListener{
            startActivity(Intent(this, menu4::class.java))}
        btn_home.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))}

    }
}
