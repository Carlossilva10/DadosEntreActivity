package com.example.dadosentreactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dadosentreactivity.databinding.ActivityTerceiraBinding

class TerceiraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceiraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDados()
    }

    private fun recuperarDados() {
        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")

        binding.editNome.setText(nome)
        binding.editEmail.setText(email)

    }
}