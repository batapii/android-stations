package com.example.techtrain.railway.android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.button)
        val EditText = findViewById<EditText>(R.id.editTextText)

        button.setOnClickListener {
            text.text = EditText.text
        }
    }
}
