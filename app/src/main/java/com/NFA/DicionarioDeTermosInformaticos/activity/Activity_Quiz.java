package com.NFA.DicionarioDeTermosInformaticos.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.NFA.DicionarioDeTermosInformaticos.R;
import com.NFA.DicionarioDeTermosInformaticos.class_support.Question;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Activity_Quiz extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    private Question mQuestion = new Question();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLenght = mQuestion.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        r = new Random();

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);

        score = findViewById(R.id.score);
        question = findViewById(R.id.question);

        score.setText("Score " + mScore);

        updateQuestion(r.nextInt(mQuestionLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score");
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score");
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score");
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score");
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });
    }

    private void gameOver() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Activity_Quiz.this);
        alertDialogBuilder
                .setMessage(getString(R.string.quiz_message) +" "+ mScore +" "+ getString(R.string.quiz_spots))
                .setCancelable(false)
                .setPositiveButton(getString(R.string.quiz_new_game),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), Activity_Quiz.class));
                                finish();
                            }
                        })
                .setNegativeButton(getString(R.string.quiz_finish), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void updateQuestion(int num) {

        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoice1(num));
        answer2.setText(mQuestion.getChoice2(num));
        answer3.setText(mQuestion.getChoice3(num));
        answer4.setText(mQuestion.getChoice4(num));

        mAnswer = mQuestion.getCorrectAnswer(num);
    }
}