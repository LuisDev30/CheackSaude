package com.example.empregaeu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.empregaeu4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edbutton = binding.idButton

        edbutton.setOnClickListener{
            val intent = Intent(this,segunda_tela::class.java)
            startActivity(intent)
        }

        val adbutton = binding.idcadastro

        adbutton.setOnClickListener{
            val intent = Intent(this,terceira_tela::class.java)
            startActivity(intent)
        }
    }
}