package com.example.techtrain.railway.android

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        Log.d(TAG, "onCreate()")
        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("KEY_INPUT_TEXT", binding.editTextText.text.toString())
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity")
    }
}
