package com.example.newquizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score,question;
    private  Questions questions=new Questions();
    private  String answer;
    public int mscore=0;
    private int questionalength=questions.questions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();

        answer1=  findViewById(R.id.answer1);
        answer2=  findViewById(R.id.answer2);
        answer3=  findViewById(R.id.answer3);
        answer4=  findViewById(R.id.answer4);


        score=  findViewById(R.id.score);
        question=  findViewById(R.id.question);
        score.setText("score:"+mscore);
        updateQuestion(r.nextInt(questionalength));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText()==answer){
                    mscore++;
                    score.setText("score:"+mscore);
                    updateQuestion(r.nextInt(questionalength));
                }
                else
                {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText()==answer){
                    mscore++;
                    score.setText("score:"+mscore);
                    updateQuestion(r.nextInt(questionalength));
                }
                else
                {
                 gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText()==answer){
                    mscore++;
                    score.setText("score:"+mscore);
                    updateQuestion(r.nextInt(questionalength));
                }
                else
                {
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText()==answer){
                    mscore++;
                    score.setText("score:"+mscore);
                    updateQuestion(r.nextInt(questionalength));
                }
                else
                {
                    gameOver();
                }
            }
        });

    }
    private  void updateQuestion(int num)
    {
        question.setText(questions.getquestion(num));
        answer1.setText(questions.getchoice1(num));
        answer2.setText(questions.getchoice2(num));
        answer3.setText(questions.getchoice3(num));
        answer4.setText(questions.getchoice4(num));
 answer=questions.getcorrectanswer(num);
    }
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is"+score+"points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                             startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
        .setNegativeButton("EXIT",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
}
}
