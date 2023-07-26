package com.example.hw21

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private var count = 0
    private var isIncrementing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            if (isIncrementing) {
                count++
                if (count == 10) {
                    isIncrementing = false
                    button.text = "-1"
                }
            } else {
                count--
            }
            updateTextView()
        }
    }

    private fun updateTextView() {
        textView.text = count.toString()
        if (count == 0 && !isIncrementing) {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("COUNT", count)
        startActivity(intent)
    }
}