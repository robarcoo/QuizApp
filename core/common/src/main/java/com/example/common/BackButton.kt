package com.example.common

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun BackButton() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Go back", tint = Color.White)
    }
}