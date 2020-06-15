package com.example.thousandaire1


import android.util.Log


class Game {


    var currentIndex: Int = 0
    var currentQuestionText: Int = 0
    var currentQuestionAnswer: Int = 0
    var nextQuestionAmount: Int = 0
    lateinit var currentQuestionChoices: MutableList<Int>
    fun addQuestion(
        questionText: Int,
        questionAnswer: Int,
        choices: MutableList<Int>,
        amount: Int
    ) {
       currentIndex++
        currentQuestionText = questionText
        currentQuestionAnswer = questionAnswer
        currentQuestionChoices = choices
        nextQuestionAmount = amount
      // questions.add(Question(questionText,questionText, mutableListOf(choices[currentIndex]),amount))
    }

    lateinit var questions: MutableList<Question>

    // Question(currentQuestionText,currentQuestionAnswer,currentQuestionChoices,nextQuestionAmount)

}
       /* for (i in 0.. (questions.size)) {
            val currentObj = questions[i]
           // var obj = Question(questionText, questionAnswer, choices, amount)
           // obj = Question(currentObj.questionTextId,currentQuestionAnswer,
              //  mutableListOf(currentQuestionChoice[currentQuestionIndex]), nextQuestionAmount)
            //questions.add(Question(questionText, questionAnswer, choices, amount))
            //questions.add(Question(questionText,questionAnswer, mutableListOf(choices[currentQuestionIndex]),amount))
            // questions.add(Question(questionText,questionAnswer, mutableListOf(choices[currentQuestionIndex]),amount))
            Log.i("question index", " " + currentQuestionIndex)
            currentQuestionIndex++
            // val question = questions.get(currentQuestionIndex - 1)
            // MainActivity().choice1_Button.text = (question.questionTextId).toString()
        }*/








/*lateinit var currentQuestion: Question
var currentQuestionIndex = 1
val maxNumberOfQuestions = 6
lateinit var questions: ArrayList<Question>
/*val currentQuestionText: Int
    get() = questions[currentQuestionIndex].questionTextId

val currentQuestionAnswer: Int
    get() = questions[currentQuestionIndex].answerId*/

        val que1 = Question(
            R.string.currentQuestionText,
            1,
            arrayListOf(R.string.question1_answer1_Button, R.string.question1_option2_Button,R.string.question1_option3_Button,R.string.question1_option4_Button),
            0
        )
        val que2 = Question(
            R.string.question_second,
            3,
            arrayListOf(R.string.question2_option1_Button, R.string.question2_option2_Button,R.string.question2_answer3_Button,R.string.question2_option4_Button),
            100
        )
        val que3 = Question(
            R.string.question_third,
            3,
            arrayListOf(R.string.question3_option1_Button, R.string.question3_option2_Button,R.string.question3_answer3_Button,R.string.question3_option4_Button),
            300
        )
        val que4 = Question(
            R.string.question_fourth,
            4,
            arrayListOf(R.string.question4_option1_Button, R.string.question4_option2_Button,R.string.question4_option3_Button,R.string.question4_answer4_Button),
            200
        )
        val que5 = Question(
            R.string.question_fifth,
            4,
            arrayListOf(R.string.question5_option1_Button, R.string.question5_option2_Button,R.string.question5_option3_Button,R.string.question5_answer4_Button),
            500
        )
        val que6 = Question(
            R.string.question_sixth,
            3,
            arrayListOf(R.string.question1_answer1_Button, R.string.question2_option1_Button),
            1000
        )

fun proceedToNextQuestion() {
    Game().currentQuestionIndex = (Game().currentQuestionIndex + 1) % Game().questions.size
    Log.i("QUESTION SIZE"," " + Game().questions.size)

}*/








