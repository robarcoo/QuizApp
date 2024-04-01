package com.example.signup


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.ui.text.font.Font
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.common.BottomButton
import com.example.common.ClickText
import com.example.common.TextfieldWithIcon
import com.example.common.TopBar


@Composable
@Preview
fun SignupScreen() {
    Column (modifier = Modifier.padding(bottom = 24.dp, start = 32.dp, end = 32.dp, top = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        TopBar(text = stringResource(id = R.string.createAccount), color = colorResource(id = com.example.common.R.color.ButtonColor),
            textColor = colorResource(id = com.example.common.R.color.ButtonTextColor))
        Column {
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterName),
                title = stringResource(id = R.string.name)) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "User Name"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterSurname),
                title = stringResource(id = R.string.surname)) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "User Surname"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterEmail),
                title = stringResource(id = R.string.email)) {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = "Email"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterPassword),
                title = stringResource(id = R.string.password),
                isPassword = true) {
                Icon(
                    Icons.Filled.Lock,
                    contentDescription = "Password"
                )
            }
            TextfieldWithIcon(givenText = stringResource(id = R.string.enterPasswordAgain),
                title = stringResource(id = R.string.passwordAgain),
                isPassword = true) {
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




