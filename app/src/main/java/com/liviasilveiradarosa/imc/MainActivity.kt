package com.liviasilveiradarosa.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome = findViewById<TextInputEditText>(R.id.edt_nome)
        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val nomeStr = edtNome.text.toString()
            val pesoStr = edtPeso.text.toString()
            val alturaStr = edtAltura.text.toString()

            if (nomeStr.isEmpty() || pesoStr.isEmpty() || alturaStr.isEmpty()) {
                Snackbar
                    .make(edtPeso, "Preencha todos os campos", Snackbar.LENGTH_LONG)
                    .show()
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()
                val resultado = peso / (altura * altura)

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("KEY_RESULT_IMC", resultado)
                intent.putExtra("NOME", nomeStr)
                intent.putExtra("PESO", peso)
                intent.putExtra("ALTURA", altura)
                startActivity(intent)
            }
        }
    }
}
