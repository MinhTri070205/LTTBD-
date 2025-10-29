package com.example.uthsmarttasks.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uthsmarttasks.R

@Composable
fun OnBoardingScreen2(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.onboarding2), contentDescription = null)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Increase Work Effectiveness", style = MaterialTheme.typography.headlineSmall)
            Text(
                "Time management and determination of more important tasks give better results and improvement.",
                textAlign = TextAlign.Center
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { navController.navigate("onboarding1") }) { Text("Back") }
            Button(onClick = { navController.navigate("onboarding3") }) { Text("Next") }
        }
    }
}
