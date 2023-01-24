package com.example.ejercicio9_resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9_resumen.databinding.ActivityRazasBinding

class Razas : AppCompatActivity() {
    private lateinit var binding: ActivityRazasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRazasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cambiarImagenes(binding)
    }

    fun cambiarImagenes(binding: ActivityRazasBinding){
        var imagen=0
        var raza=""

        binding.humano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.hombre)
            imagen=R.drawable.hombre
            raza="Hombre"
        }
        binding.elfo.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.elfo)
            imagen=R.drawable.elfo
            raza="Elfo"
        }

        binding.enano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.enano)
            imagen=R.drawable.enano
            raza="Enano"
        }

        binding.goblin.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.goblin)
            imagen=R.drawable.goblin
            raza="Goblin"
        }

        binding.aceptar2.setOnClickListener {
            val clase = intent.getIntExtra("CLASE_IMAGEN", 0)
            val claseIm = intent.getStringExtra("CLASE_STRING")
            val intent= Intent(this, Resumen::class.java)
            intent.putExtra("RAZA_IMAGEN", imagen)
            intent.putExtra("RAZA_STRING", raza)
            intent.putExtra("CLASE_IMAGEN", clase)
            intent.putExtra("CLASE_STRING", claseIm)
            startActivity(intent)
        }

    }
}