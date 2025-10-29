package com.example.thuchanh02_number

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
        
        val edtNumber = findViewById<EditText>(R.id.edtNumber)
        val btnCreate = findViewById<Button>(R.id.btnCreate)
        val tvError = findViewById<TextView>(R.id.tvError)
        val listContainer = findViewById<LinearLayout>(R.id.listContainer)

        btnCreate.setOnClickListener {
            listContainer.removeAllViews()
            tvError.text = ""
            val input = edtNumber.text.toString().trim()
            val n = try { input.toInt() } catch (e: Exception) { -1 }
            if (n <= 0) {
                tvError.text = "Vui lòng nhập số nguyên dương"
                return@setOnClickListener
            }
            if (n > 200) {
                tvError.text = "Số quá lớn (<=200)"
                return@setOnClickListener
            }
            for (i in 1..n) {
                val b = Button(this)
                b.text = i.toString()
                val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                lp.setMargins(0,8,0,0)
                b.layoutParams = lp
                b.setBackgroundColor(resources.getColor(android.R.color.holo_red_light))
                b.setTextColor(resources.getColor(android.R.color.white))
                b.setOnClickListener { Toast.makeText(this, "Bạn bấm số: ${'$'}{i}", Toast.LENGTH_SHORT).show() }
                listContainer.addView(b)
            }
        }
        
    }
}
