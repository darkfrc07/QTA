package com.example.qta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.qta.databinding.ActivityPrincipalBinding

private lateinit var binding: ActivityPrincipalBinding
class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    val button_perfil2 = root.findViewById<BottomNavigationItemView>(R.id.Menu)
    val button_notificaciones = root.findViewById<BottomNavigationItemView>(R.id.Notif)
    val button_tareas1 = root.findViewById<BottomNavigationItemView>(R.id.Tareas)



}