package com.example.common

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomButton(text : String, color: Color, textColor: Color) {
    val rubikMedium = FontFamily(
        Font(R.font.rubik_medium)
    )
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .height(50.dp)
            .width(275.dp),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = color)) {
        Text(fontSize = 16.sp,
            text = text,
            color = textColor,
            fontFamily = rubikMedium
        )

    }
}