package com.example.quizapp

object Constants2{

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "The members of the Rajya Sabha are elected by","People",
            "Lok Sabha","elected members of the legislative assembly","elected members of the legislative council",3
        )
        questionsList.add(que1)
//2
        val que2 = Question(2, "The power to decide an election petition is vested in the","Parliament",
            "Supreme Court","High Court","Election Commission",3
        )
        questionsList.add(que2)
//3
        val que3 = Question(3, "The present Lok Sabha is the","14th Lok Sabha",
            "15th Lok Sabha","16th Lok Sabha","17th Lok Sabha",4
        )
        questionsList.add(que3)
//4
        val que4 = Question(4, "The members of Lok Sabha hold office for a term of",
            "4 years",
            "5 years","6 years","7 years",2
        )
        questionsList.add(que4)
//5
        val que5 = Question(5, "The minimum age to qualify for election to the Lok Sabha is","25 years",
            "21 years","18 years","35 years",1
        )
        questionsList.add(que5)
//6
        val que6 = Question(6, "The minimum age of the voter in India is","19 years",
            "18 years","21 years","14 years",2
        )
        questionsList.add(que6)
//7
        val que7 = Question(7, "The position of a chief minister is","dentical to that of the president",
            "not constitutional","a combination of the position of the prime minister and president","similar to that of the prime minister",4
        )
        questionsList.add(que7)
//8
        val que8 = Question(8, "Preamble enshrines the ideals of liberty, equality and fraternity - ideals inspired by the","Russian Revolution",
            "Irish Revolution","French Revolution","US Constitution",3
        )
        questionsList.add(que8)
//9
        val que9 = Question(9,"The power to prorogue the Lok Sabha rests with","Speaker",
            "The minister for Parliamentary affairs","Prime Minister","President",4
        )
        questionsList.add(que9)
//10
        val que10 = Question(10, "The power of Supreme Court of India to decide the dispute between the centre and states falls under its","advisory jurisdiction",
            "appellate jurisdiction","original jurisdiction","constitutional jurisdiction",3
        )
        questionsList.add(que10)



        return questionsList

    }
}