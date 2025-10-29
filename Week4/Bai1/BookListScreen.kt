package com.example.uthlibrary.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uthlibrary.data.Book

@Composable
fun BookListScreen() {
    val books = remember {
        mutableStateListOf(
            Book(1, "Lập trình Kotlin"),
            Book(2, "Cấu trúc dữ liệu"),
            Book(3, "Mạng máy tính"),
            Book(4, "Hệ điều hành")
        )
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("📖 Danh sách Sách", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))

        LazyColumn {
            items(books) { book ->
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)) {
                    Row(modifier = Modifier.padding(12.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(book.title)
                        Button(
                            onClick = { book.isBorrowed = !book.isBorrowed },
                            colors = ButtonDefaults.buttonColors(
                                if (book.isBorrowed) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
                            )
                        ) {
                            Text(if (book.isBorrowed) "Trả" else "Mượn")
                        }
                    }
                }
            }
        }
    }
}
