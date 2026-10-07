package com.umaee.ejemploimagenes

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity: AppCompatActivity(){
    lateinit var imagen: ImageView
    lateinit var btnAnterior: Button
    lateinit var btnSiguiente: Button

    var posicion = 0
    val listaImagenes = arrayOf(
        R.drawable.imagen6,
        R.drawable.imagen7,
        R.drawable.imagen8
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagen = findViewById(R.id.imageGaleria)
        btnAnterior = findViewById(R.id.BtnAnterior)
        btnSiguiente = findViewById(R.id.BtnSiguiente)

        btnSiguiente.setOnClickListener {
            posicion++
            if(posicion >= listaImagenes.size){
                posicion = 0
            }
            imagen.setImageResource(listaImagenes[posicion])
        }

        btnAnterior.setOnClickListener {
            posicion--
            if(posicion < 0){
                posicion = listaImagenes.size - 1
            }
            imagen.setImageResource(listaImagenes[posicion])
        }

    }
}

