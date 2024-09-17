package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val resultado = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classicacao)


        tvResult.text = resultado.toString()

        val classicacao: String = if(resultado <= 18.5f){
             "MAGREZA"
        } else if(resultado > 18.5f && resultado <= 24.9f){
             "NORMAL"
        } else if(resultado > 25f && resultado <= 29.9f) {
             "SOBREPESO"
        } else if ( resultado > 30f && resultado <= 39.9f) {
            "OBESIDADE"
        } else {
             "OBESIDADE GRAVE"
        }

        tvClassificacao.text = classicacao

        }
    }