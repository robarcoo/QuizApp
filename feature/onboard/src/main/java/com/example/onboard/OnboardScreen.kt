package com.example.onboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun OnboardScreen() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    val textList = listOf(stringResource(R.string.onboard_first_screen),
        stringResource(R.string.onboard_second_screen))
    Column (modifier = Modifier.padding(15.dp)) {
        Spacer(modifier = Modifier.size(130.dp))
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            Image(painter = painterResource(id = R.drawable.onboard), contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp))
        }
        Spacer(modifier = Modifier.size(70.dp))
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color = if (pagerState.currentPage == iteration) Pair(colorResource(id = R.color.ChosenColor), colorResource(id = R.color.CircleColor)) else Pair(colorResource(id = R.color.CircleColor), colorResource(id = R.color.BorderColor))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(CircleShape)
                        .background(color.second)
                        .size(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .border(width = 2.dp, color = color.first, shape = CircleShape)
                            .size(10.dp)
                            .padding(1.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                    )
                }
            }
        }
        val rubikMedium = FontFamily(
            Font(R.font.rubik_medium)
        )
        Spacer(modifier = Modifier.size(28.dp))
        Column(modifier = Modifier
            .height(224.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(
                color = colorResource(id = R.color.CardColor),
                shape = RoundedCornerShape(20.dp)
            )
            .fillMaxWidth()
            .padding(11.dp, 20.dp, 11.dp, 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = textList[pagerState.currentPage],
                fontSize = 24.sp, fontFamily = rubikMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 20.dp, top = 0.dp, end = 0.dp, start = 0.dp),
                color = colorResource(id = R.color.TitleColor))
            BottomButton(">")
        }

    }
}


@Composable
fun BottomButton(text : String) {
    val rubikMedium = FontFamily(
        Font(R.font.rubik_medium)
    )
Button(onClick = { /*TODO*/ },
    modifier = Modifier
        .height(50.dp)
        .width(275.dp),
    shape = RoundedCornerShape(20.dp),
    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.ButtonColor))) {
    Text(fontSize = 16.sp,
        text = text,
        color = colorResource(id = R.color.ButtonTextColor),
        fontFamily = rubikMedium
        )

}
}