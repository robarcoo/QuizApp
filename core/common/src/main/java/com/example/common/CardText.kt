package com.example.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CardText(text : String) {
    val rubik = FontFamily(
        Font(R.font.rubik)
    )
    Text(text = text, fontFamily = rubik, color = colorResource(R.color.CardTextColor),
        fontSize = 16.sp,
        textAlign = TextAlign.Center)

}