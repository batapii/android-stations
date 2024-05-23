package com.example.techtrain.railway.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techtrain.railway.android.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val inputText = intent.getStringExtra(MainActivity.KEY_INPUT_TEXT)
        inputText?.let {
            binding.textView2.text = it
        }
    }
}
