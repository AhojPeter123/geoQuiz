package com.example.geoquiz

import android.graphics.Color

/**
 * Represents a country in the GeoQuiz game.
 *
 * @param name      The name of the country.
 * @param capital   The capital city of the country.
 * @param color     The color associated with the country.
 * @param unlocked  Indicates whether the country is unlocked or not. Default is false.
 * @param completed Indicates whether the country is completed or not. Default is false.
 */
class Country(
    val name: String,
    val capital: String,
    val color: Int,
    var unlocked: Boolean = false,
    var completed: Boolean = false
) {
    val neighbors = ArrayList<Country>()
    val questionList = ArrayList<Question>()

    /**
     * Adds a neighboring country to the current country.
     *
     * @param neighbor The neighboring country to add.
     */
    fun addNeighbor(neighbor: Country) {
        neighbors.add(neighbor)
    }

    /**
     * Adds a question to the country's question list.
     *
     * @param question The question to add.
     */
    fun addQuestion(question: Question) {
        questionList.add(question)
    }

    /**
     * Retrieves the list of questions for the country. If there are no locked neighbors,
     * returns the complete question list. Otherwise, returns a random selection of questions
     * corresponding to the locked neighbors.
     *
     * @return The list of questions for the country.
     */
    fun getQuestions(): ArrayList<Question> {
        if (getLockedNeighbors().isEmpty())
            return questionList

        val lockedNeighborsQuestions = ArrayList<Question>()
        while (lockedNeighborsQuestions.size < getLockedNeighbors().size) {
            val question = questionList.random()
            if (!lockedNeighborsQuestions.contains(question))
                lockedNeighborsQuestions.add(question)
        }
        return lockedNeighborsQuestions
    }

    /**
     * @return The list of locked neighboring countries.
     */
    fun getLockedNeighbors(): ArrayList<Country> {
        val lockedNeighbors = ArrayList<Country>()
        for (neighbor in neighbors) {
            if (!neighbor.unlocked) {
                lockedNeighbors.add(neighbor)
            }
        }
        return lockedNeighbors
    }
}
