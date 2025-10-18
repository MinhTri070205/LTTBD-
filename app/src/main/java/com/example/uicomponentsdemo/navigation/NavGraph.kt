package com.example.uicomponentsdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uicomponentsdemo.screens.*

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(onReady = { navController.navigate("list") }) }
        composable("list") { ComponentsListScreen(onNavigate = { route -> navController.navigate(route) }) }
        composable("text") { TextScreen() }
        composable("image") { ImageScreen() }
        composable("textfield") { TextFieldScreen() }
        composable("password") { PasswordFieldScreen() }
        composable("column") { ColumnScreen() }
        composable("row") { RowScreen() }
        composable("text") {
            TextScreen()
        }
    }
}
