package com.example.jrf_quiz_app.ui.compose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jrf_quiz_app.R
import com.example.jrf_quiz_app.ui.compose.components.HomeAppbar
import com.example.jrf_quiz_app.ui.compose.components.TimerItem
import com.example.jrf_quiz_app.ui.theme.JrfCustomTheme
import com.example.jrf_quiz_app.ui.viewmodels.QuizViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onStartQuizClick: () -> Unit = {},
    viewModel: QuizViewModel = hiltViewModel(),
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            HomeAppbar()
        }
    ) { contentPadding ->
        JrfCustomTheme {
            HomePageScreen(
                Modifier.padding(contentPadding),
                onStartQuizClick
            )
        }
    }
}


@Composable
fun HomePageScreen(
    modifier: Modifier = Modifier,
    onStartQuizClick: () -> Unit
){
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // First Box: Takes two-thirds of the screen
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.7f)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.primary,
                            MaterialTheme.colorScheme.secondary
                        )
                    )
                )
        ) {
            // Content for the first box (e.g., App Title)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Horizontal row with two image views
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(16.dp) // Add padding if needed
                ) {
                    // First image with two text views on top
                    Box(
                        modifier = Modifier
                            .weight(1f) // Distribute space evenly between images
                            .size(100.dp) // Set size for the image
                    ) {
                        // Image
                        Image(
                            painter = painterResource(id = R.drawable.icon_sun), // Replace with your image resource
                            contentDescription = "First Image",
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        // Texts on top of the image
                        Column(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(8.dp) // Add padding if needed
                        ) {
                            Text(
                                modifier = modifier.fillMaxWidth(),
                                text = "500",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Text(
                                modifier = modifier.fillMaxWidth(),
                                text = "High Score",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }

                    // Spacer to add space between the images
                    Spacer(modifier = Modifier.width(40.dp))

                    // Second image
                    Image(
                        painter = painterResource(id = R.drawable.frame), // Replace with your image resource
                        contentDescription = "Second Image",
                        modifier = Modifier
                            .weight(1f)
                            .size(100.dp)
                    )
                }
                Column (
                    modifier = modifier
                        .padding(16.dp)
                        .weight(1f)
                ){
                    // Text - bold-medium-large
                    Text(
                        text = "JRF Sunday's",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp) // Add padding for spacing
                    )

                    // Text - bold-large
                    Text(
                        text = "JRF Sunday's",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(top = 8.dp) // Add padding for spacing
                    )

                    // Text - medium
                    Text(
                        text = "JRF Sunday's",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(top = 8.dp) // Add padding for spacing
                    )
                }

            }


        }

        // Second Box: Takes one-third of the screen
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.4f)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Content for the second box (e.g., High Score and Start Quiz Button)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = "Today's Quiz on",
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "General knowledge",
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "The Quiz ends in :",
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(16.dp))

                Row (
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    TimerItem(time = 5, timerText = "Hour")
                    TimerItem(time = 60, timerText = "Minutes")
                    TimerItem(time = 5, timerText = "Seconds")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = onStartQuizClick,
                ) {
                    Text(text = "Play Quiz Now", color = Color.Black)
                }
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomePageScreenPreview(){
    JrfCustomTheme {
        HomePageScreen {
            
        }
    }

}