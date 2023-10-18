package com.example.navgtion.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Home() {
    Box(
        modifier = Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {

            },
            text = "Home",

            fontWeight = FontWeight.Bold
        )
    }
}