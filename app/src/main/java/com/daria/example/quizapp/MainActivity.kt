package com.daria.example.quizapp

import android.os.Bundle
import com.daria.example.quizapp.ui.theme.QuizAppTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.splash.SplashViewModel
import com.example.onboard.OnboardScreen
import com.example.signup.SignupScreen
import com.example.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {

    private val viewModel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition{ viewModel.isLoading.value}
        setContent {
            QuizAppTheme {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Image(
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.background),
                            contentDescription = ""
                        )
                    }
                    SignupScreen()
            }
        }
    }
}
