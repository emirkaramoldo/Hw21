package com.example.hw21

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val secondTextView = findViewById<TextView>(R.id.secondTextView)
        val count = intent.getIntExtra("COUNT", 0)
        secondTextView.text = "Value from First Activity: $count"
    }
}