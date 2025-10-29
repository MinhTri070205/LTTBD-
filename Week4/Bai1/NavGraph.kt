package com.example.uthlibrary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uthlibrary.screens.*

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "manage") {
        composable("manage") { ManageScreen() }
        composable("books") { BookListScreen() }
        composable("students") { StudentListScreen() }
    }
}
