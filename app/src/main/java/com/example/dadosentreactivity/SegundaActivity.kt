package com.example.dadosentreactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dadosentreactivity.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDados()

        binding.btnProsseguir.setOnClickListener { prosseguir() }

    }

    private fun recuperarDados() {
        val nome = intent.getStringExtra("nome")
        binding.editNome.setText(nome)
    }

    private fun prosseguir() {
        val nome = binding.editNome.text.toString()
        val email = binding.editEmail.text.toString()

        val intent = Intent(this, TerceiraActivity::class.java)
        intent.putExtra("nome", nome)
        intent.putExtra("email", email)

        startActivity(intent)
    }
}