package com.example.uniytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.uniytestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.etvHello.setText("Hello")
        binding.etvHello.setText("Hello")
  binding.btn.setOnClickListener {
      binding.tvSecond.text = binding.etvHello.text
  }

    }
}