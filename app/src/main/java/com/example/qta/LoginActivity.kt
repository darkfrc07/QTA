package com.example.qta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.qta.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var usuario = intent.getStringExtra((findViewById<TextInputEditText>(R.id.txusuario).toString()))

        binding.buttonIngresar.setOnClickListener {
            val principalIntent : Intent = Intent( this, PrincipalActivity::class.java)
            principalIntent.putExtra("email",usuario)
            startActivity(principalIntent)
        }
    }
}