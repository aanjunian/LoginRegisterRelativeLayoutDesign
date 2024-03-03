package com.example.loginregisterrelativelayoutdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregisterrelativelayoutdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        supportActionBar?.hide()
        setContentView(view)

        btnLoginListener()
        btnRegListener()
    }

    private fun btnRegListener() {
        binding.btnRegister1.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun btnLoginListener() {
        binding.btnLogin1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}