package com.jarvizu.customerlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.customerlist.R
import com.example.customerlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val navController = binding.navHostFragment.findNavController()
        navController.navigate(R.id.mainFragment)
    }
}