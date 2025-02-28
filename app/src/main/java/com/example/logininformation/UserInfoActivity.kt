package com.example.logininformation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val nameText = findViewById<TextView>(R.id.nameText)
        val ageText = findViewById<TextView>(R.id.ageText)

        val name = intent.getStringExtra("USER_NAME") ?: "Unknown"
        val age = intent.getStringExtra("USER_AGE") ?: "Unknown"

        nameText.text = "Name: $name"
        ageText.text = "Age: $age"
    }
}
