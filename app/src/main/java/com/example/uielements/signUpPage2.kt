package com.example.uielements

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class signUpPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page2)

        var intent = intent
        val fname = intent.getStringExtra("fname")
        val lname = intent.getStringExtra("lname")
        val email = intent.getStringExtra("email")
        val finAge = intent.getStringExtra("finAge")
        val phoneNum = intent.getStringExtra("phoneNum")


        val cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)
        val bDateTxt = findViewById<TextView>(R.id.bDateTxt)
        val infoComp = findViewById<Button>(R.id.infoComplete)
        val setBDate = findViewById<Button>(R.id.setBDate)
        val p2Greeting = findViewById<TextView>(R.id.p2Greeting)

        p2Greeting.text = "Hello, " + fname + "! Please set your birthdate to complete sign-up."

        setBDate.setOnClickListener{
            val dateTxt = DatePickerDialog(
                    this,
                    DatePickerDialog.OnDateSetListener { view: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->
                        bDateTxt.setText("" + mDay + "/" + mMonth + "/" + mYear)}, year, month, day)
            dateTxt.show()
        }



        infoComp.setOnClickListener {
            var finBDate = bDateTxt.text.toString()
            val intent = Intent(this, displayInfo::class.java)
            intent.putExtra("fname" , fname)
            intent.putExtra("lname" , lname)
            intent.putExtra("email" , email)
            intent.putExtra("finAge", finAge)
            intent.putExtra("phoneNum", phoneNum)
            intent.putExtra("finBDate", finBDate)
            startActivity(intent)
        }

    }
}