package com.example.geoquiz

import android.app.AlertDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

/**
 * Represents a quiz for a specific country.
 *
 * @property country The country associated with the quiz.
 * @property index The index of the current question in the quiz.
 * @property score The score achieved by the user in the quiz.
 * @property context The context of the quiz (usually an activity or application context).
 */
class Quiz(
    val country: Country,
    var index: Int = 0,
    var score: Int = 0,
    val context: Context
) {
    private var questions = country.getQuestions()
    private lateinit var questionTextView: TextView
    private lateinit var answersRadioGroup: RadioGroup
    private var alertDialog: AlertDialog? = null

    /**
     * Starts the quiz by showing the first question.
     */
    fun startQuiz() {
        showQuestionDialog()
    }

    private fun showQuestionDialog() {
        // Inflate the quiz_question.xml layout
        val inflater = LayoutInflater.from(context)
        val quizLayout = inflater.inflate(R.layout.quiz_question, null)

        // Find the views in the inflated layout
        questionTextView = quizLayout.findViewById(R.id.questionTextView)
        answersRadioGroup = quizLayout.findViewById(R.id.answersRadioGroup)

        // Display the current question
        displayQuestion()

        // Create the AlertDialog for the current question
        val builder = AlertDialog.Builder(context)
        builder.setView(quizLayout)
        builder.setPositiveButton("Next") { _, _ ->
            // Process the user's answer and move to the next question or finish the quiz
            processAnswer()
        }
        alertDialog = builder.create()
        alertDialog?.show()
    }

    private fun displayQuestion() {
        val currentQuestion = questions[index]
        questionTextView.text = currentQuestion.text

        answersRadioGroup.removeAllViews()
        for (option in currentQuestion.options) {
            val radioButton = RadioButton(context)
            radioButton.text = option
            answersRadioGroup.addView(radioButton)
        }
    }

    private fun processAnswer() {
        val currentQuestion = questions[index]

        // Get the user's selected answer
        val selectedRadioButtonId = answersRadioGroup.checkedRadioButtonId
        val selectedRadioButton = answersRadioGroup.findViewById<RadioButton>(selectedRadioButtonId)
        val userAnswer = selectedRadioButton?.text.toString()

        // Check if the answer is correct and update the score
        if (isCorrectAnswer(userAnswer, currentQuestion.answer)) {
            score++
        }

        // Move to the next question or finish the quiz
        index++
        if (index < questions.size) {
            // Display the next question
            showQuestionDialog()
        } else {
            // Quiz finished, display the final score or perform any other actions
            showQuizResult()
        }
    }

    private fun isCorrectAnswer(userAnswer: String, correctAnswer: String): Boolean {
        return userAnswer == correctAnswer
    }

    private fun showQuizResult() {
        // Dismiss the last question dialog if it's still showing
        alertDialog?.dismiss()

        // Display the final score in a toast message
        val resultMessage = "Quiz finished!\nYour score: $score/${questions.size}"
        Toast.makeText(context, resultMessage, Toast.LENGTH_LONG).show()

        // Show the country choice dialog if there are locked neighbors
        val choice = CountryChoice(context, country, score)
        if (country.getLockedNeighbors().size > 0) {
            choice.showCountryChoiceDialog()
        }
    }
}
