package com.example.uicomponentsdemo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Text Detail", color = Color(0xFF007AFF)) }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp)
        ) {
            val styledText = buildAnnotatedString {
                // “The quick” có gạch ngang
                withStyle(
                    style = SpanStyle(textDecoration = TextDecoration.LineThrough)
                ) {
                    append("The quick ")
                }

                // “Brown” màu nâu đậm
                withStyle(
                    style = SpanStyle(color = Color(0xFFB8860B), fontSize = 28.sp)
                ) {
                    append("Brown\n")
                }

                // “fox jumps” bình thường nhưng chữ cách rộng
                withStyle(
                    style = SpanStyle(letterSpacing = 6.sp)
                ) {
                    append("fox jumps ")
                }

                // “over” in đậm
                withStyle(
                    style = SpanStyle(fontWeight = FontWeight.Bold)
                ) {
                    append("over\n")
                }

                // “the” gạch chân
                withStyle(
                    style = SpanStyle(textDecoration = TextDecoration.Underline)
                ) {
                    append("the ")
                }

                // “lazy” in nghiêng
                withStyle(
                    style = SpanStyle(fontStyle = FontStyle.Italic)
                ) {
                    append("lazy ")
                }

                // “dog.” bình thường
                append("dog.")
            }

            Text(
                text = styledText,
                fontSize = 22.sp,
                lineHeight = 30.sp
            )
        }
    }
}
