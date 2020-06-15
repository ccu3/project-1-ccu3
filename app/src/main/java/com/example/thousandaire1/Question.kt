package com.example.thousandaire1

data class Question(val questionTextId: Int, val answerId: Int, var choiceIds: MutableList<Int>, val amount: Int){


}