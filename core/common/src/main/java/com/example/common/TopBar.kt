package com.example.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(text : String, color : Color = Color.Transparent, textColor : Color = colorResource(id = R.color.TopBarTextColor)) {
    Row (modifier = Modifier
        .height(75.dp)
        .fillMaxWidth()
        .background(color)
        .padding(start = 27.dp, end = 27.dp, bottom = 20.dp, top = 20.dp),
        verticalAlignment = Alignment.CenterVertically) {
        BackButton()
        Text(text = text, fontSize = 22.sp,
            modifier = Modifier.padding(start = 50.dp, end = 45.dp, bottom = 0.dp, top = 0.dp),
            color = textColor,
            fontFamily = FontFamily(Font(R.font.rubik_medium))
        )
    }
}