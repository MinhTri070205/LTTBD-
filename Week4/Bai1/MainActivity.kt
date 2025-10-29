package com.example.uthlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.example.uthlibrary.navigation.NavGraph
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryApp()
        }
    }
}

@Composable
fun LibraryApp() {
    val navController = rememberNavController()
    var selectedTab by remember { mutableStateOf("manage") }

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == "manage",
                    onClick = { selectedTab = "manage"; navController.navigate("manage") },
                    label = { Text("Quản lý") },
                    icon = {}
                )
                NavigationBarItem(
                    selected = selectedTab == "books",
                    onClick = { selectedTab = "books"; navController.navigate("books") },
                    label = { Text("DS Sách") },
                    icon = {}
                )
                NavigationBarItem(
                    selected = selectedTab == "students",
                    onClick = { selectedTab = "students"; navController.navigate("students") },
                    label = { Text("Sinh viên") },
                    icon = {}
                )
            }
        }
    ) { padding ->
        Surface(modifier = Modifier.padding(padding)) {
            NavGraph(navController)
        }
    }
}
