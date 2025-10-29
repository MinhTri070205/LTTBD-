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
fun ManageScreen() {
    val students = remember {
        mutableStateListOf(
            Student(1, "Nguyễn Văn A", mutableListOf(Book(1, "Lập trình Kotlin", true))),
            Student(2, "Trần Thị B", mutableListOf(Book(2, "Cấu trúc dữ liệu", true), Book(3, "Mạng máy tính", true))),
            Student(3, "Lê Văn C", mutableListOf())
        )
    }

    var searchName by remember { mutableStateOf("") }
    val selectedStudent = students.find { it.name.equals(searchName, ignoreCase = true) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("📚 Hệ thống Quản lý Thư viện", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = searchName,
            onValueChange = { searchName = it },
            label = { Text("Nhập tên sinh viên") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(12.dp))

        if (selectedStudent == null) {
            Text("Không tìm thấy sinh viên hoặc chưa nhập tên.")
        } else if (selectedStudent.borrowedBooks.isEmpty()) {
            Text("Sinh viên này chưa mượn quyển sách nào.")
        } else {
            Text("Danh sách sách đã mượn:", style = MaterialTheme.typography.titleMedium)
            LazyColumn {
                items(selectedStudent.borrowedBooks) { book ->
                    Card(modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)) {
                        Row(modifier = Modifier.padding(12.dp)) {
                            Checkbox(checked = true, onCheckedChange = null)
                            Spacer(Modifier.width(8.dp))
                            Text(book.title)
                        }
                    }
                }
            }
        }
    }
}
