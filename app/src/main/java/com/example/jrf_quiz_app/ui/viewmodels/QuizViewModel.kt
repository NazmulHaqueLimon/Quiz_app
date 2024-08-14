package com.example.jrf_quiz_app.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.jrf_quiz_app.data.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject internal constructor(
    private val quizRepository: QuizRepository
):ViewModel() {
}