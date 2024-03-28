package com.daria.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daria.example.quizapp.ui.theme.QuizAppTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: QuizViewModel by viewModels()
        setContent {
            QuizAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background) {

                }
            }

        }
    }
}
