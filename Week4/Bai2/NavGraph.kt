package com.example.uthsmarttasks.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uthsmarttasks.screens.*

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("onboarding1") { OnBoardingScreen1(navController) }
        composable("onboarding2") { OnBoardingScreen2(navController) }
        composable("onboarding3") { OnBoardingScreen3(navController) }
        composable("home") { HomeScreen() }
    }
}
