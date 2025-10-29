package com.example.uthlibrary.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uthlibrary.data.Book
import com.example.uthlibrary.data.Student

@Composable
fun StudentListScreen() {
    val students = remember {
        mutableStateListOf(
            Student(1, "Nguyễn Văn A", mutableListOf(Book(1, "Lập trình Kotlin"))),
            Student(2, "Trần Thị B", mutableListOf(Book(2, "Cấu trúc dữ liệu"), Book(3, "Mạng máy tính"))),
            Student(3, "Lê Văn C", mutableListOf())
        )
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("👥 Danh sách Sinh viên", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))

        LazyColumn {
            items(students) { student ->
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(student.name, style = MaterialTheme.typography.titleMedium)
                        Text("Số sách đang mượn: ${student.borrowedBooks.size}")
                    }
                }
            }
        }
    }
}
