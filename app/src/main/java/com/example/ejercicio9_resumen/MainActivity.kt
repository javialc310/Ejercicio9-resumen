package com.example.ejercicio9_resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9_resumen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cambiarImagenes(binding)
    }

    fun cambiarImagenes(binding: ActivityMainBinding){
        var imagen=0

        binding.guerrero.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.guerrero)
            imagen=R.drawable.guerrero
        }
        binding.mago.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.mago)
            imagen=R.drawable.mago
        }

        binding.ladron.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.ladron)
            imagen=R.drawable.ladron
        }

        binding.clerigo.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.clerigo)
            imagen=R.drawable.clerigo
        }

        binding.aceptar.setOnClickListener {
            val intent= Intent(this, Razas::class.java)
            intent.putExtra("CLASE", imagen)
            startActivity(intent)
        }

    }
}