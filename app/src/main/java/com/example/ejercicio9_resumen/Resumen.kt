package com.example.ejercicio9_resumen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9_resumen.databinding.ActivityResumenBinding

class Resumen : AppCompatActivity() {
    private lateinit var binding: ActivityResumenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val clase= intent.getIntExtra("CLASE", 0)
        val raza= intent.getIntExtra("RAZA", 0)

        binding.imageView3.setImageResource(clase)
        binding.imageView4.setImageResource(raza)

    }
}


