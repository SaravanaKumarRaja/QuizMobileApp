package com.example.quizapp

object Constants{

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "What is the official language in India?","Tamil",
            "Telugu","Gujarathi","There isn't one official language",4
        )
    questionsList.add(que1)
//2
        val que2 = Question(2, "In India, how do people traditionally eat their food?","with right hand",
            "wiht spoon","with left hand","None of the above",1
        )
        questionsList.add(que2)
//3
        val que3 = Question(3, "Which major festival in India signifies the victory of light over darkness?","Pongal",
            "Holi","Diwali","ramadan",3
        )
        questionsList.add(que3)
//4
        val que4 = Question(4, "Which very popular form of Indian music and dance originated in the Punjab region of north-west India?",
            "Sattriya",
            "Bhangra","Raga","Bharatham",2
        )
        questionsList.add(que4)
//5
        val que5 = Question(5, "Which animal is considered sacred in India?","Dog",
            "Horse","Cow","Pig",3
        )
        questionsList.add(que5)
//6
        val que6 = Question(6, "Rajgir Mahotsav is celebrated in ?","Rajastan",
            "Bihar","UttarPradesh","MadhyaPradesh",2
        )
        questionsList.add(que6)
//7
        val que7 = Question(7, "Which is the largest Indian museum?","Nizam's Museum",
            "Salar Jung Museum","AP state Archaeology Museum","Indian Museum Kolkata",4
        )
        questionsList.add(que7)
//8
        val que8 = Question(8, "The famous ‘Hornbill festival’ is celebrated in which of the following States of India?","Nagaland",
            "Mizoram","Assam","Meghalaya",1
        )
        questionsList.add(que8)
//9
        val que9 = Question(9, "Which of the following has been included by the UNESCO in the list of literature signifying World Human Heritage?","Rig Veda",
            "Sama veda","Yajur veda","Atharvana veda",1
        )
        questionsList.add(que9)
//10
        val que10 = Question(10, "Which island is named after Dr. A.P.J. Abdul Kalam?","Landfall island",
            "Bhavani island","Sriharikota"," Wheeler Island, Odisha",4
        )
        questionsList.add(que10)



        return questionsList

    }
}