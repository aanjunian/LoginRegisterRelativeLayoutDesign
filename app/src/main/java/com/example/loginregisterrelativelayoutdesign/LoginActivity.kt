package com.example.loginregisterrelativelayoutdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregisterrelativelayoutdesign.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        supportActionBar?.hide()
        setContentView(view)

        btnBackListener()
        txtRegListener()

        }

    private fun txtRegListener() {
        binding.txtRegister.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }

    private fun btnBackListener() {
        binding.lImgShape1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
