package com.example.logininformation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextText1)
        val editTextAge = findViewById<EditText>(R.id.editTextText2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()

            val intent = Intent(this, UserInfoActivity::class.java).apply {
                putExtra("USER_NAME", name)
                putExtra("USER_AGE", age)
            }
            startActivity(intent)
        }
    }
}
