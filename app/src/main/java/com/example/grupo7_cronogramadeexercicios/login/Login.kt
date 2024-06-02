package com.example.grupo7_cronogramadeexercicios.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.grupo7_cronogramadeexercicios.MainActivity
import com.example.grupo7_cronogramadeexercicios.R

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnVoltar: Button = findViewById(R.id.voltar_login)
        btnVoltar.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}