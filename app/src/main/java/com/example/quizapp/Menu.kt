package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN




        btn_india.setOnClickListener {
            val intent = Intent(
                this,
                QuizQuestionsActivity::class.java
            )
            intent.putExtra(Constants.USER_NAME,mUserName)

            startActivity(intent)
            finish()
        }

        btn_child.setOnClickListener {
            val intent1 = Intent(
                this,
                ChildQuiz::class.java
            )

            intent1.putExtra(Constants.USER_NAME,mUserName)
            startActivity(intent1)
            finish()
        }

        btn_politics.setOnClickListener {
            val intent2 = Intent(
                this,
                PoliticalQuiz::class.java
            )

            intent2.putExtra(Constants.USER_NAME,mUserName)
            startActivity(intent2)
            finish()
        }



        }




    }
