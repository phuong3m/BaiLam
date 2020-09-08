package com.example.kiemtra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user_name = findViewById(R.id.user_name) as EditText
        var password = findViewById(R.id.password) as EditText
        var btn_submid = findViewById(R.id.btn_submit) as Button
        var btn_reset = findViewById(R.id.btn_reset) as Button
        btn_reset.setOnClickListener(){
            user_name.setText("")
            password.setText("")
        }
        btn_submid.setOnClickListener(){
            val intent: Intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
