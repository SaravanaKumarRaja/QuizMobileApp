package com.example.quizapp

object Constants3{

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "How many hours do we have in a day","12 hours",
            "48 hours","20 hours","24 hours",4
        )
        questionsList.add(que1)
//2
        val que2 = Question(2, "Which animal is called the King of the jungle?","Lion",
            "Tiger","Elephant","Rabbit",1
        )
        questionsList.add(que2)
//3
        val que3 = Question(3, "Which is the largest planent in our Solar System?","Saturn",
            "Earth","Jupiter","Mars",3
        )
        questionsList.add(que3)
//4
        val que4 = Question(4, "Which month of the year has least number of days?",
            "January",
            "Febraury","July","May",2
        )
        questionsList.add(que4)
//5
        val que5 = Question(5, "Which Color symbolises Peace?","Green",
            "Red","White","Blue",3
        )
        questionsList.add(que5)
//6
        val que6 = Question(6, "Which is the Capital of India?","Chennai",
            "Delhi","Kolkata","Mumbai",2
        )
        questionsList.add(que6)
//7
        val que7 = Question(7, "How many Continents are there in the world?","9",
            "11","6","7",4
        )
        questionsList.add(que7)
//8
        val que8 = Question(8, "Which is the largest Mammal","Blue Whale",
            "Cow","Monkey","Elephant",1
        )
        questionsList.add(que8)
//9
        val que9 = Question(9, "Which is the Smallest Continent","Australia",
            "Asia","America","Africa",1
        )
        questionsList.add(que9)
//10
        val que10 = Question(10, "Which Planet is Known as the Red Planet","Uranus",
            "Venus","Mercury","Mars",4
        )
        questionsList.add(que10)



        return questionsList

    }
}