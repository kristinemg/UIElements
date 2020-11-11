package com.example.uielements

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fnameTxt = findViewById<EditText>(R.id.fName)
        val lnameTxt = findViewById<EditText>(R.id.lName)
        val emailTxt = findViewById<EditText>(R.id.emailAdd)
        var ageTxt = findViewById<TextView>(R.id.ageTxt)
        val pnSwitch = findViewById<Switch>(R.id.pnSwitch)
        val phoneTxt= findViewById(R.id.phoneNum)as EditText
        pnSwitch.setOnClickListener{
            if (pnSwitch.isChecked == true){
                phoneTxt.visibility = View.VISIBLE

            }else{
                pnSwitch.isChecked == false
                phoneTxt.visibility = View.INVISIBLE
            }

        }


        val ageSeekBar = findViewById<SeekBar>(R.id.ageSeekBar)

        ageSeekBar.setOnSeekBarChangeListener(@SuppressLint("AppCompatCustomView")
        object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, p2: Boolean) {
                val ageTxt = findViewById<TextView>(R.id.ageTxt)
                ageTxt.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        findViewById<Button>(R.id.submitBtn).setOnClickListener{

            val fname: String = fnameTxt.text.toString()
            val lname: String = lnameTxt.text.toString()
            val email: String = emailTxt.text.toString()
            val finAge: String = ageTxt.text.toString()
            val phoneNum: String = phoneTxt.text.toString()

            //val ageSeekBar = findViewById<SeekBar>(R.id.ageSeekBar)


            val intent = Intent(this, signUpPage2::class.java)
            intent.putExtra("fname" , fname)
            intent.putExtra("lname" , lname)
            intent.putExtra("email" , email)
            intent.putExtra("finAge", finAge)
            intent.putExtra("phoneNum", phoneNum)
            startActivity(intent)



        }

    }
}