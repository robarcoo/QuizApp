package com.example.common

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.sp

@Composable
fun TextfieldWithIcon(givenText : String, title : String,  isPassword : Boolean = false, icon :  @Composable (() -> Unit)?) {
    var text by rememberSaveable { mutableStateOf("") }
    Text(text = title, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.rubik_medium)))
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(givenText) },
        leadingIcon = icon,
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}
