package com.example.geoquiz

/**
 * Represents a question in the quiz.
 *
 * @property text The text of the question.
 * @property options The list of answer options for the question.
 * @property answer The correct answer to the question.
 */
class Question(
    val text: String,
    val options: ArrayList<String>,
    val answer: String
) {}
