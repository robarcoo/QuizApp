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
import com.example.common.CardText
import com.example.common.ClickText

@Composable
@Preview
fun WelcomeScreen() {
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
                fontSize = 24.sp, fontFamily = FontFamily(Font(R.font.rubikmedium)),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 20.dp, top = 0.dp, end = 0.dp, start = 0.dp),
                color = colorResource(id = R.color.TitleColor)
            )
            Spacer(modifier = Modifier.size(13.dp))
            CardText(stringResource(id = R.string.card_text))
            Spacer(modifier = Modifier.size(18.dp))
            BottomButton(stringResource(id = R.string.first_button_text))
            Spacer(modifier = Modifier.size(16.dp))
            BottomButton(stringResource(id = R.string.second_button_text), colorResource(id = R.color.SecondButtonColor), colorResource(id = R.color.SecondButtonTextColor))
            Spacer(modifier = Modifier.size(8.dp))
            ClickText(stringResource(id = R.string.later))
        }
    }
}


