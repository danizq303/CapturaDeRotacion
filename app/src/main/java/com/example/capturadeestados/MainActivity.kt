package com.example.capturadeestados

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onStop = 4
    private var onDestroy = 5
    private var onRestart = 6

    private lateinit var txtNombre: EditText
    private lateinit var txtApellido: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.nombre)
        txtApellido = findViewById(R.id.apellido)

        println("onCreate $onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("nombre", txtNombre.text.toString())
        savedInstanceState.putString("apellido", txtApellido.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        
        txtNombre.setText(savedInstanceState.getString("nombre"))
        txtApellido.setText(savedInstanceState.getString("apellido"))
    }
}