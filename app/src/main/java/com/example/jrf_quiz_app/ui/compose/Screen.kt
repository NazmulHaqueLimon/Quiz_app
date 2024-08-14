package com.example.jrf_quiz_app.ui.compose

import androidx.navigation.NamedNavArgument

sealed class Screen(
    val route: String,
    val navArgs: List<NamedNavArgument> = emptyList()
) {

    data object Home : Screen("home")

    data object Question : Screen("question")
}