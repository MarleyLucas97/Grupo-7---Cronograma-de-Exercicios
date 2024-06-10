package com.example.grupo7_cronogramadeexercicios

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grupo7_cronogramadeexercicios.login.Login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnLogin: ImageButton = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener() {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val btnTreino_A: ImageButton = findViewById(R.id.btn_peito)
        btnTreino_A.setOnClickListener(){
            val intent = Intent(this, Treino_A::class.java)
            startActivity(intent)
        }
        val btnTreino_B: ImageButton = findViewById(R.id.btn_costas)
        btnTreino_B.setOnClickListener(){
            val intent = Intent(this, Treino_B::class.java)
            startActivity(intent)
        }
        val btnTreino_C: ImageButton = findViewById(R.id.btn_perna)
        btnTreino_C.setOnClickListener(){
            val intent = Intent(this, Treino_C::class.java)
            startActivity(intent)
        }
    }
}