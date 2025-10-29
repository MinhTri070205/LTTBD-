package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen() {
    val state = remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopAppBar(title = { Text("TextField") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = state.value,
                onValueChange = { state.value = it },
                label = { Text("Nhập thông tin") },
                modifier = Modifier.fillMaxWidth()
            )

            // ✅ Hiển thị text nhập vào
            Text(
                text = "Tự động cập nhật dữ liệu theo textfield: ${state.value}",
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
