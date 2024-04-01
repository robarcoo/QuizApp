package com.example.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextfieldWithIcon(givenText : String, title : String,  isPassword : Boolean = false, icon :  @Composable (() -> Unit)?) {
    var text by rememberSaveable { mutableStateOf("") }
    Spacer(modifier = Modifier.size(20.dp))
    Text(text = title, fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.rubik_medium)),
        color = colorResource(id = R.color.TitleColor))
    Spacer(modifier = Modifier.size(3.dp))
    TextField(
        modifier = Modifier.clip(shape = RoundedCornerShape(20.dp)).width(317.dp),
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(givenText) },
        leadingIcon = icon,
        colors = TextFieldColors(),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}


@Composable
fun TextFieldColors(
        textColor: Color = colorResource(id = R.color.TextFieldTextColor),
        backgroundColor: Color = colorResource(id = R.color.TextFieldColor),
        leadingIconColor: Color = colorResource(id = R.color.TextFieldIconColor),
        cursorColor : Color = colorResource(id = R.color.ButtonColor),
        focusedIndicatorColor : Color = colorResource(id = R.color.ButtonColor),
        placeholerColor: Color = colorResource(id = R.color.TextFieldTextColor))
     = TextFieldDefaults.textFieldColors(
        textColor = textColor,
        backgroundColor = backgroundColor,
        cursorColor = cursorColor,
        leadingIconColor = leadingIconColor,
        placeholderColor = placeholerColor,
        focusedIndicatorColor = focusedIndicatorColor
    )

