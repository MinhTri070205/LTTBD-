package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentsListScreen(onNavigate: (String) -> Unit) {
    val items = listOf(
        "Text Detail" to "text",           // ✅ Thêm dòng này để mở TextScreen
        "Image" to "image",
        "TextField" to "textfield",
        "PasswordField" to "password",
        "Column Layout" to "column",
        "Row Layout" to "row"
    )

    Scaffold(
        topBar = { TopAppBar(title = { Text("UI Components List") }) }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding).padding(16.dp)) {
            items(items) { (label, route) ->
                Button(
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                        .fillMaxWidth(),
                    onClick = { onNavigate(route) }
                ) {
                    Text(label)
                }
            }
        }
    }
}
