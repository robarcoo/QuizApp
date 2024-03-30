package com.example.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.common.BottomButton

@Composable
@Preview
fun WelcomeScreen() {
    val rubikMedium = FontFamily(Font(R.font.rubikmedium))
    Column(modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 7.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.icon), contentDescription = "Logo", modifier = Modifier.height(100.dp))
        Image(painter = painterResource(id = R.drawable.welcome),
            contentDescription = "Welcome Image",
            modifier = Modifier.height(274.dp))
        Column(modifier = Modifier
            .height(371.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(
                color = colorResource(id = R.color.CardColor),
                shape = RoundedCornerShape(20.dp)
            )
            .fillMaxWidth()
            .padding(11.dp, 20.dp, 11.dp, 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(id = R.string.card_label),
                fontSize = 24.sp, fontFamily = rubikMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 20.dp, top = 0.dp, end = 0.dp, start = 0.dp),
                color = colorResource(id = R.color.TitleColor)
            )
            Spacer(modifier = Modifier.size(13.dp))
            CardText(stringResource(id = R.string.card_text))
            Spacer(modifier = Modifier.size(18.dp))
            BottomButton(stringResource(id = R.string.first_button_text), colorResource(id = R.color.ButtonColor), colorResource(id = R.color.ButtonTextColor))
            Spacer(modifier = Modifier.size(16.dp))
            BottomButton(stringResource(id = R.string.second_button_text), colorResource(id = R.color.SecondButtonColor), colorResource(id = R.color.SecondButtonTextColor))
            Spacer(modifier = Modifier.size(8.dp))
            ClickText(stringResource(id = R.string.later))
        }
    }
}

@Composable
fun ClickText(text: String) {
    val rubik = FontFamily(
        Font(R.font.rubik_regular)
    )
    var enabled by rememberSaveable { mutableStateOf(true) }
    Text(modifier = Modifier.clickable(
        enabled = enabled,
        onClick = {
            enabled = false
        }), text = text, fontFamily = rubik, color = colorResource(R.color.ClickableTextColor),
        fontSize = 16.sp,
        textAlign = TextAlign.Center)
}
@Composable
fun CardText(text : String) {
    val rubik = FontFamily(
        Font(R.font.rubik_regular)
    )
    Text(text = text, fontFamily = rubik, color = colorResource(R.color.CardTextColor),
        fontSize = 16.sp,
        textAlign = TextAlign.Center)

}