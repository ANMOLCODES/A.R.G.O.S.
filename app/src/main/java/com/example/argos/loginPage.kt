package com.example.argos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_page.*

class loginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        login_button.setOnClickListener {
            var status: String = if (username_et.text.toString().equals("Nivedita kunj")
                && password_et.text.toString().equals("password")
            ) "Logged In Succesfully" else "Username/Password Is Incorrect, Try again!"
            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }


    }
}