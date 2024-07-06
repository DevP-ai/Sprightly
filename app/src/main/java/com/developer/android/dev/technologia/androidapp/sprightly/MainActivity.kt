package com.developer.android.dev.technologia.androidapp.sprightly

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.developer.android.dev.technologia.androidapp.sprightly.databinding.ActivityMainBinding
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        val navController=navHostFragment.navController

        NavigationUI.setupWithNavController(binding.bottomNavigation,navController)


//        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
//
//        val badge:BadgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.homeFragment)
//        badge.isVisible = true
//        badge.number = 5

    }
}