package com.example.aulafragments2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulafragments2.fragments.ChamdasFragment
import com.example.aulafragments2.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {


   private  lateinit var buttonConversas : Button
    private lateinit var buttonChamadas : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonConversas = findViewById(R.id.buttonConversas)
        buttonChamadas = findViewById(R.id.buttonchamas)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMenu, ChamdasFragment())
                .commit() // para que ele apareca quando for chamado
        // apontando para o container e o fragment que serao usadosg
        }

        buttonConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMenu, ConversasFragment())  // apontando para o container e o fragment que serao usadosg
                .commit()  // comit para que ele apareca quando for chamado
        }



    }

}