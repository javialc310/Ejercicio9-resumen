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
        var clase=""

        binding.guerrero.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.guerrero)
            imagen=R.drawable.guerrero
            clase="Guerrero"
        }
        binding.mago.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.mago)
            imagen=R.drawable.mago
            clase="Mago"
        }

        binding.ladron.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.ladron)
            imagen=R.drawable.ladron
            clase="Ladrón"
        }

        binding.clerigo.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.clerigo)
            imagen=R.drawable.clerigo
            clase="Clérigo"
        }

        binding.aceptar.setOnClickListener {
            val intent= Intent(this, Razas::class.java)
            intent.putExtra("CLASE_STRING", clase)
            intent.putExtra("CLASE_IMAGEN", imagen)
            startActivity(intent)
        }

    }
}