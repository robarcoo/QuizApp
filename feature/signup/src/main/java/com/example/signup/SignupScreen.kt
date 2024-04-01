package com.example.signup


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.common.BottomButton
import com.example.common.ClickText


@Composable
fun SignupScreen() {
    Column {
        Row (modifier = Modifier
            .height(75.dp)
            .fillMaxWidth()
            .background(colorResource(id = com.example.common.R.color.ButtonColor))) {
            BackButton()
            Text(text = "")
        }
        Column {
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterName)) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "User Name"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterSurname)) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "User Surname"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterEmail)) {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = "Email"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterPassword), isPassword = true) {
                Icon(
                    Icons.Filled.Lock,
                    contentDescription = "Password"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterPasswordAgain), isPassword = true) {
                Icon(
                    Icons.Filled.Lock,
                    contentDescription = "Password Again"
                )
            }
        }
        BottomButton(text = stringResource(id = R.string.createAccount))
        ClickText(stringResource(id = R.string.acceptPolicy))
    }
}

@Composable
fun TextfieldWithIcon(givenText : String, isPassword : Boolean = false, icon :  @Composable (() -> Unit)?) {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(givenText) },
        leadingIcon = icon,
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
    )
}


@Composable
fun BackButton() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Go back")
    }
}