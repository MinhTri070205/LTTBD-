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
fun OnBoardingScreen1(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.onboarding1), contentDescription = null)
        Text("Easy Time Management", style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
        Text(
            "With management based on priority and daily tasks, it gives you convenience in managing and determining what must be done first.",
            textAlign = TextAlign.Center
        )
        Button(
            onClick = { navController.navigate("onboarding2") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Next")
        }
    }
}
