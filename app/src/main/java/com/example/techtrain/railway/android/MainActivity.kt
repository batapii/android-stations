package com.example.techtrain.railway.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techtrain.railway.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val KEY_INPUT_TEXT = "KEY_INPUT_TEXT"
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("KEY_INPUT_TEXT", binding.editTextText.text.toString())
            }
            startActivity(intent)
        }
    }
}
