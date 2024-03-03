package com.example.loginregisterrelativelayoutdesign

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginregisterrelativelayoutdesign.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        supportActionBar?.hide()
        setContentView(view)

        btnBackRegister()
        txtLoginListener()

        }

    private fun txtLoginListener() {
        binding.txtLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    private fun btnBackRegister() {
        binding.btnBackR.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
