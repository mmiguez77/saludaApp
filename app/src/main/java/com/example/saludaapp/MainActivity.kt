package com.example.saludaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.saludaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnChangeActivity.setOnClickListener{ checkValue() }
    }

    fun checkValue() {
        if (binding.etName.text.toString().isEmpty()){
            Toast.makeText(this, "El nombre es obligatorio", Toast.LENGTH_LONG).show()
        } else  {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.etName.text)
            startActivity(intent)
        }
    }
}