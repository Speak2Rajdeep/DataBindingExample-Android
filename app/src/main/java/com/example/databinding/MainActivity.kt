package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

/**
 * 1. In this Project, Data Binding is Done.
 * 2. One data Class is there.
 * 3. Text are set in TextView through Data Binding.
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataClassObject = TextDataClass("This is Updated text")
        binding.variableText = dataClassObject
    }
}