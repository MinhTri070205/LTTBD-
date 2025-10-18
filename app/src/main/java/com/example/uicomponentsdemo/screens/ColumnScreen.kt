package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ExperimentalMaterial3Api


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColumnScreen() {
    Scaffold(topBar = { TopAppBar(title = { Text("Column Layout") }) }) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            repeat(4) {
                Box(modifier = Modifier.fillMaxWidth().height(60.dp).background(Color(0xFFB3E5FC)).padding(8.dp)) { }
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}
