package com.liviasilveiradarosa.imc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Pegando os dados recebidos
        val nome = intent.getStringExtra("NOME") ?: "Usuário"
        val imc = intent.getFloatExtra("KEY_RESULT_IMC", 0f)
        val peso = intent.getFloatExtra("PESO", 0f)
        val altura = intent.getFloatExtra("ALTURA", 0f)

        // Referências aos TextViews
        val tvNome = findViewById<TextView>(R.id.tv_nome)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        val tvPeso = findViewById<TextView>(R.id.tv_peso)
        val tvAltura = findViewById<TextView>(R.id.tv_altura)
        val btnVoltar = findViewById<Button>(R.id.btn_voltar)

        // Setando os valores na tela
        tvNome.text = "Nome: $nome"
        tvResult.text = "%.2f".format(imc)
        tvClassificacao.text = "Classificação: ${classificarImc(imc)}"
        tvPeso.text = "Peso: %.2f kg".format(peso)
        tvAltura.text = "Altura: %.2f m".format(altura)

        // Ação do botão Voltar
        btnVoltar.setOnClickListener {
            finish() // Encerra essa activity e volta para a anterior
        }
    }

    private fun classificarImc(imc: Float): String {
        return when {
            imc < 18.5f -> "Magreza"
            imc in 18.5f..24.9f -> "Normal"
            imc in 25f..29.9f -> "Sobrepeso"
            imc in 30f..39.9f -> "Obesidade"
            else -> "Obesidade Grave"
        }
    }
}

