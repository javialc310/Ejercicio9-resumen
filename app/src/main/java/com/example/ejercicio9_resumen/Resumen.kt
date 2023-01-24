package com.example.ejercicio9_resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.ejercicio9_resumen.databinding.ActivityResumenBinding
import kotlin.random.Random


@SuppressWarnings("rawtypes")
class Resumen : AppCompatActivity() {
    private lateinit var binding: ActivityResumenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val clase_im= intent.getIntExtra("CLASE_IMAGEN", 0)
        val raza_im= intent.getIntExtra("RAZA_IMAGEN", 0)
        val clase= intent.getStringExtra("CLASE_STRING")
        val raza= intent.getStringExtra("RAZA_STRING")

        binding.imageView3.setImageResource(clase_im)
        binding.imageView4.setImageResource(raza_im)

        binding.texto.text="Vida: 200\n" +
                "Fuerza: ${Random.nextInt(10, 15)}\n" +
                "Defensa: ${Random.nextInt(1, 5)}\n" +
                "Tamaño mochila: 100\n" +
                "Monedero: Vacío"

        binding.clase.text="$clase"
        binding.raza.text="$raza"

        botones(binding)

    }

    fun botones (binding: ActivityResumenBinding){

        lateinit var intent:Intent

        binding.continuar.setOnClickListener {
            if (binding.editText.text.isEmpty()){
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error")
                builder.setMessage("Tienes que introducir un nombre para el personaje")
                builder.setPositiveButton("Aceptar") { dialog, which ->
                    Toast.makeText(applicationContext,
                        "Aceptar", Toast.LENGTH_SHORT).show()
                }
                builder.show()
            }else{
                intent= Intent(this, Ejercicio10::class.java)
                startActivity(intent)
            }
        }

        binding.volver.setOnClickListener {
            intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }


}


