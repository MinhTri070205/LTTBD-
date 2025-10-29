package com.example.thuchanh02_email

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hooks
        
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)

        btnCheck.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            if (email.isEmpty()) {
                tvMessage.setTextColor(getColor(android.R.color.holo_red_dark))
                tvMessage.text = "Email không hợp lệ"
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvMessage.setTextColor(getColor(android.R.color.holo_red_dark))
                tvMessage.text = "Email không đúng định dạng"
            } else {
                tvMessage.setTextColor(getColor(android.R.color.holo_blue_dark))
                tvMessage.text = "Bạn đã nhập email hợp lệ"
            }
        }
        
    }
}
