package com.johnny.jmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class formCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        //        Escondendo o header roxo
        supportActionBar!!.hide()

    }
}