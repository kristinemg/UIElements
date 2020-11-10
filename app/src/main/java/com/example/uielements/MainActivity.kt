package com.example.uielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submitBtn).setOnClickListener{

            val fnameTxt = findViewById<EditText>(R.id.fName)
            val fname: String = fnameTxt.text.toString()

            val lnameTxt = findViewById<EditText>(R.id.lName)
            val lname: String = lnameTxt.text.toString()

            val emailTxt = findViewById<EditText>(R.id.emailAdd)
            val email: String = emailTxt.text.toString()

            val button = findViewById<Button>(R.id.submitBtn)
            button.setOnClickListener {
                val intent = Intent(this, displayInfo::class.java)
                startActivity(intent)

            }
        }

    }
}