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
fun OnBoardingScreen3(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.onboarding3), contentDescription = null)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Reminder Notification", style = MaterialTheme.typography.headlineSmall)
            Text(
                "This app reminds you to do tasks according to your set time.",
                textAlign = TextAlign.Center
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { navController.navigate("onboarding2") }) { Text("Back") }
            Button(onClick = { navController.navigate("home") }) { Text("Get Started") }
        }
    }
}
