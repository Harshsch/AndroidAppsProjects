package com.example.quizz

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():java.util.ArrayList<Question>{
        val questionList =ArrayList<Question>()
        val que1=Question(
            1,"what country flag is this ?",R.drawable.ic_flag_of_belgium,
            "India","Belgium","Africa","Argentina",2
        )
        questionList.add(que1)
        val que2=Question(
            2,"what country flag is this ?",R.drawable.ic_flag_of_australia,
            "Argentina","Australia","China","India",2
        )
        questionList.add(que2)
        //3
        val que3=Question(
            3,"what country flag is this ?",R.drawable.ic_flag_of_india,
            "India","Australia","Africa","Argentina",1
        )
        questionList.add(que3)
        //4
        val que4=Question(
            4,"what country flag is this ?",R.drawable.ic_bg,
            "India","Australia","Africa","None",4
        )
        questionList.add(que4)
        //5
        val que5=Question(
            5,"what country flag is this ?",R.drawable.ic_flag_of_germany,
            "India","Australia","Germany","Argentina",3
        )
        questionList.add(que5)

        return questionList
    }
}