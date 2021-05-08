package com.teekay.listviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_login`)

        btnLogin.setOnClickListener {
           if (edEmail.text.toString().equals("cassienath@micasa.com")
                && edPassword.text.toString().equals("password")) {
               val intent = Intent(this, ListView::class.java)
               startActivity(intent)
           }
           else Toast.makeText(applicationContext, "Shey you don type rubbish?",Toast.LENGTH_SHORT).show()


        }


    }
}
