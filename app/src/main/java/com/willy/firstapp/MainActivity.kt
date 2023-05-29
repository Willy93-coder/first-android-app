package com.willy.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingButton: Button = findViewById(R.id.btGreeting)
        greetingButton.setOnClickListener { greeting() }
    }

    private fun greeting() {
        val input: EditText = findViewById(R.id.etForm)
        if (input.text.toString().isEmpty()) {
            Toast.makeText(this, R.string.msgEmpty, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, getString(R.string.msgGreeting, input.text), Toast.LENGTH_SHORT)
                .show()
        }
    }
}