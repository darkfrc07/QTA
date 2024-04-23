package com.example.qta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.example.qta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonIngresar.setOnClickListener {
            val loginIntent : Intent = Intent( this, LoginActivity::class.java)
            startActivity(loginIntent)
            // juliana 1234
        }


    }

}