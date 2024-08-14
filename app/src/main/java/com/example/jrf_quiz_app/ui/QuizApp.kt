package com.example.jrf_quiz_app.ui

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jrf_quiz_app.ui.compose.Screen
import com.example.jrf_quiz_app.ui.compose.screens.HomeScreen

@Composable
fun QuizApp(){
    val navController = rememberNavController()
    QuizAppNavHost( navController =navController)
}

@Composable
fun QuizAppNavHost(
    navController: NavHostController
) {
    val activity = (LocalContext.current as Activity)

    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(route = Screen.Home.route) {
            HomeScreen(
                onStartQuizClick={
                    navController.navigate(Screen.Question.route)
                }
            )
        }
    }
}
