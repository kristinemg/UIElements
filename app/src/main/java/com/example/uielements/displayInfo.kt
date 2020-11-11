package com.example.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class displayInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_info)

        var intent = intent
        val fname = intent.getStringExtra("fname")
        val lname = intent.getStringExtra("lname")
        val email = intent.getStringExtra("email")
        val finAge = intent.getStringExtra("finAge")
        val phoneNum = intent.getStringExtra("phoneNum")
        val finBDate = intent.getStringExtra("finBDate")



        val infoDisplay = findViewById<TextView>(R.id.infoDisplay)
        infoDisplay.text = "First Name: " + fname + "\n" + "\n" +
                           "Last Name: " + lname + "\n" + "\n" +
                           "Email Address: " + email + "\n" + "\n" +
                           "Age: " + finAge + "\n" + "\n" +
                           "Phone Number: " + phoneNum + "\n" + "\n" +
                           "Birthdate: " + finBDate

    }

}

