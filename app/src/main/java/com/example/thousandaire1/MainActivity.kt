package com.example.thousandaire1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.AbsSavedState
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var questionTextView: TextView
    private lateinit var Choice1Button: Button
    private lateinit var Choice2Button: Button
    private lateinit var Choice3Button: Button
    private lateinit var Choice4Button: Button
    var selectedButton: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val game = Game()

        var currentQuestionIndex = 1

        questionTextView = findViewById(R.id.question_text_view)
        Choice1Button = findViewById(R.id.choice1_Button)
        Choice2Button = findViewById(R.id.choice2_Button)
        Choice3Button = findViewById(R.id.choice3_Button)
        Choice4Button = findViewById(R.id.choice4_Button)

        game.addQuestion(
            R.string.question_first,
            1,
            mutableListOf(
                R.string.question1_answer1_Button,
                R.string.question1_option2_Button,
                R.string.question1_option3_Button,
                R.string.question1_option4_Button
            ),
            0
        )
        game.addQuestion(
            R.string.question_second,
            3,
            mutableListOf(
                R.string.question2_option1_Button,
                R.string.question2_option2_Button,
                R.string.question2_answer3_Button,
                R.string.question2_option4_Button
            ),
            100
        )
        game.addQuestion(
            R.string.question_third,
            3,
            mutableListOf(
                R.string.question3_option1_Button,
                R.string.question3_option2_Button,
                R.string.question3_answer3_Button,
                R.string.question3_option4_Button
            ),
            300
        )
        game.addQuestion(
            R.string.question_fourth,
            4,
            mutableListOf(
                R.string.question4_option1_Button,
                R.string.question4_option2_Button,
                R.string.question4_option3_Button,
                R.string.question4_answer4_Button
            ),
            200
        )
        game.addQuestion(
            R.string.question_fifth,
            4,
            mutableListOf(
                R.string.question5_option1_Button,
                R.string.question5_option2_Button,
                R.string.question5_option3_Button,
                R.string.question5_answer4_Button
            ),
            500
        )
        game.addQuestion(
            R.string.question_sixth,
            3,
            mutableListOf(
                R.string.question6_option1_Button,
                R.string.question6_option2_Button,
                R.string.question6_answer3_Button,
                R.string.question6_option4_Button
            ),
            1000
        )
    }
}



       //questionTextView.text = getText(game.questions[game.currentIndex].questionTextId)
        //Choice1Button.text = getText(game.questions[game.currentIndex].choiceIds[0])
       // Choice2Button.text = getText(game.questions[game.currentIndex].choiceIds[2])
       // Choice3Button = getText(game.questions[game.currentIndex].choiceIds[2])
       // Choice4Button = getText(game.questions[game.currentIndex].questionTextId)


