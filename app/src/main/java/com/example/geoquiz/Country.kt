package com.example.geoquiz

import android.graphics.Color

class Country
    (
    val name : String,
    val capital : String,
    val color : Int,
    var unlocked : Boolean = false,
    var completed : Boolean = false
    ) {
    val neighbors = ArrayList<Country>()
    val questionList = ArrayList<Question>()

    fun addNeighbor(neighbor: Country)
    {
        neighbors.add(neighbor)
    }

    fun addQuestion(question : Question)
    {
        questionList.add(question)
    }

    fun getQuestions() : ArrayList<Question>
    {
        if(getLockedNeighbors().size == 0)
            return questionList
        val q = ArrayList<Question>()
        while(q.size < getLockedNeighbors().size)
        {
            val question = questionList.random()
            if(!q.contains(question))
                q.add(question)
        }
        return q
    }

    fun getLockedNeighbors(): ArrayList<Country> {
        val lockedNeighbors = ArrayList<Country>()
        for(n in neighbors)
            if(!n.unlocked)
                lockedNeighbors.add(n)
        return lockedNeighbors
    }


}