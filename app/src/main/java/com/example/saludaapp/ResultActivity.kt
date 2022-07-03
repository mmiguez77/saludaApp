package com.example.saludaapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saludaapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{ onBackPressed() }
        getAndShowName()
    }

    @SuppressLint("SetTextI18n")
    private fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")

        binding.tvGreeting.text = "Bienvenido $name"
    }

}