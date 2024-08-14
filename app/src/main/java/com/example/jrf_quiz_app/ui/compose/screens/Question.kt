package com.example.jrf_quiz_app.ui.compose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jrf_quiz_app.ui.compose.components.HomeAppbar
import com.example.jrf_quiz_app.ui.compose.components.QuestionAppbar
import com.example.jrf_quiz_app.ui.theme.JrfCustomTheme
import com.example.jrf_quiz_app.ui.viewmodels.QuizViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun QuestionScreen(
    modifier: Modifier = Modifier,
    onStartQuizClick: () -> Unit = {},
    viewModel: QuizViewModel = hiltViewModel(),

) {


    val time:String="5.36"
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            QuestionAppbar(time)
        }
    ) { contentPadding ->
        JrfCustomTheme {
            QuestionPageScreen(
                Modifier.padding(contentPadding),
                onStartQuizClick
            )
        }
    }
}


@Composable
fun QuestionPageScreen(
    modifier: Modifier = Modifier,
    onStartQuizClick: () -> Unit
){
    val scope = rememberCoroutineScope()
    var currentProgress by remember { mutableStateOf(0f) }
    var loading by remember { mutableStateOf(false) }
    Card {
        Column {
            Box {
                
            }
            LaunchedEffect(key1 = true) {
                loading = true
                scope.launch {
                    loadProgress { progress ->
                        currentProgress = progress
                    }
                }
                loading = false
            }
            LinearProgressIndicator(
                progress = { currentProgress },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}


/** Iterate the progress value */
suspend fun loadProgress(updateProgress: (Float) -> Unit) {
    for (i in 100 downTo 1) {
        updateProgress(i.toFloat() / 100)
        delay(100)
    }
}

@Preview(showBackground = true)
@Composable
fun QuestionScreenPreview(){
    JrfCustomTheme {
        QuestionPageScreen {

        }
    }

}