package com.example.jrf_quiz_app.data

import javax.inject.Inject

class QuizRepository @Inject constructor(
    private val service: QuizService
) {
}