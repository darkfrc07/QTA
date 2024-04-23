package com.example.qta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

import com.example.qta.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val usuario : EditText = findViewById(R.id.txusuario)
        val pass : EditText = findViewById(R.id.txpass)


        binding.buttonIngresar.setOnClickListener {
            if (usuario.text.toString() == "prueba@gmail.com" && pass.text.toString() == "12345") {
                val principalIntent: Intent = Intent(this, PrincipalActivity::class.java)
                //principalIntent.putExtra("email", usuario)
                startActivity(principalIntent)
            }
        }
    }
}