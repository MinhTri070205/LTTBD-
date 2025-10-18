package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
fun PasswordFieldScreen() {
    val pwd = remember { mutableStateOf("") }
    Scaffold(topBar = { TopAppBar(title = { Text("PasswordField") }) }) { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding).padding(16.dp)) {
            OutlinedTextField(value = pwd.value, onValueChange = { pwd.value = it }, label = { Text("Mật khẩu") }, modifier = Modifier.fillMaxWidth(), visualTransformation = PasswordVisualTransformation())
            Text("Độ dài mật khẩu: ${pwd.value.length}")

        }
    }
}
