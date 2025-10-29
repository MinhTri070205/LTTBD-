package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.uicomponentsdemo.R

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun ImageScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Images Demo") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            // Ảnh từ resources (drawable)
            Text("📷 Ảnh từ tài nguyên nội bộ (res/drawable):")
            Image(
                painter = painterResource(id = R.drawable.uth),
                contentDescription = "Local image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 8.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Ảnh từ URL (AsyncImage)
            Text("🌐 Ảnh tải từ Internet:")
            AsyncImage(
                model = "https://share.google/images/WxYwnWuTbjW2okwhx",
                contentDescription = "Network image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 8.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Ảnh base64 minh họa ngắn (chỉ ví dụ)
            Text("🧩 Ảnh từ chuỗi Base64 (ví dụ nhỏ):")
            AsyncImage(
                model = "",
                contentDescription = "Base64 Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 8.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}
