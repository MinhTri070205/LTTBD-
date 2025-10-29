package com.example.thuchanh01_agecategory

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
        
        val edtName = findViewById<EditText>(R.id.edtName)
        val edtAge = findViewById<EditText>(R.id.edtAge)
        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCheck.setOnClickListener {
            val name = edtName.text.toString().trim()
            val ageText = edtAge.text.toString().trim()
            if (name.isEmpty() || ageText.isEmpty()) {
                tvResult.text = "Vui lòng nhập đủ thông tin"
                return@setOnClickListener
            }
            val age = try { ageText.toInt() } catch (e: Exception) { -1 }
            if (age < 0) {
                tvResult.text = "Tuổi không hợp lệ"
                return@setOnClickListener
            }
            val category = when {
                age <= 1 -> "Em bé"
                age in 2..6 -> "Trẻ em"
                age in 7..65 -> "Người lớn"
                else -> "Người già"
            }
            tvResult.text = "$name thuộc nhóm: $category"
        }
        
    }
}
