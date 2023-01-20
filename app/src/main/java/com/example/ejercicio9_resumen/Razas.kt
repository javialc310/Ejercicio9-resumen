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

        binding.humano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.hombre)
            imagen=R.drawable.hombre
        }
        binding.elfo.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.elfo)
            imagen=R.drawable.elfo
        }

        binding.enano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.enano)
            imagen=R.drawable.enano
        }

        binding.goblin.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.goblin)
            imagen=R.drawable.goblin
        }

        binding.aceptar2.setOnClickListener {
            val clase = intent.getIntExtra("CLASE", 0)
            val intent= Intent(this, Resumen::class.java)
            intent.putExtra("RAZA", imagen)
            intent.putExtra("CLASE", clase)
            startActivity(intent)
        }

    }
}