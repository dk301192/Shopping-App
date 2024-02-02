package com.example.shoppingapp

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.shoppingapp.databinding.ActivityLoginBinding
import com.example.shoppingapp.databinding.ActivityPurchaseStatusBinding
import com.example.shoppingapp.databinding.ActivityShippingBinding

class ShippingActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityShippingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShippingBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}