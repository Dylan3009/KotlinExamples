package com.melendez.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.melendez.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.actionChange.setOnClickListener {
            //navController.navigate(R.id.action_nameFragment_to_lastNameFragment)
            //navController.navigate(R.id.lastNameFragment)
            val action = NameFragmentDirections.actionNameFragmentToLastNameFragment("Sofia")
            navController.navigate(action)
        }
    }
}