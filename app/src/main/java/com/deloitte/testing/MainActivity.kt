package com.deloitte.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val button = findViewById<Button>(R.id.button)
    val userName = findViewById<TextView>(R.id.userName)
    val password = findViewById<TextView>(R.id.password)
    val confirmPassword = findViewById<TextView>(R.id.confirmPassword)
    button.setOnClickListener {

    }
  }
}