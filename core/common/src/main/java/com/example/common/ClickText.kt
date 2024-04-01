package com.example.common

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ClickText(text: String) {
    var enabled by rememberSaveable { mutableStateOf(true) }
    Text(modifier = Modifier.clickable(
        enabled = enabled,
        onClick = {
            enabled = false
        }), text = text, fontFamily = FontFamily(Font(R.font.rubik)),
        color = colorResource(R.color.ClickableTextColor),
        fontSize = 16.sp,
        textAlign = TextAlign.Center)
}