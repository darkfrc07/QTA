package com.example.qta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

import com.example.qta.databinding.ActivityPrincipalBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView

private lateinit var binding: ActivityPrincipalBinding
class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val button_perfil2 = this.findViewById<BottomNavigationItemView>(R.id.Menu)
        val button_notificaciones = this.findViewById<BottomNavigationItemView>(R.id.Notif)
        val button_tareas1 = this.findViewById<BottomNavigationItemView>(R.id.Tareas)

        button_perfil2.setOnClickListener {
            val PrincipalIntent : Intent = Intent( this, PrincipalActivity::class.java)
            startActivity(PrincipalIntent)

        }
        button_notificaciones.setOnClickListener {
            val PrincipalIntent2 : Intent = Intent( this, PrincipalActivity2::class.java)
            startActivity(PrincipalIntent2)

        }
        button_tareas1.setOnClickListener {
            val PrincipalIntent3 : Intent = Intent( this, PrincipalActivity3::class.java)
            startActivity(PrincipalIntent3)

        }

        val usuario : EditText = findViewById(R.id.editText_cadena)
    }







}