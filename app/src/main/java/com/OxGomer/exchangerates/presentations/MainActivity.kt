package com.OxGomer.exchangerates.presentations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.OxGomer.exchangerates.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}