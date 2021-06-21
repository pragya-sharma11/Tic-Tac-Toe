package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button reset;
    private String startGame = "X";
    private int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, xCount = 0, oCount = 0, i = 0;
    private TextView scoreX, scoreO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btnImage1);
        button2 = findViewById(R.id.btnImage2);
        button3 = findViewById(R.id.btnImage3);
        button4 = findViewById(R.id.btnImage4);
        button5 = findViewById(R.id.btnImage5);
        button6 = findViewById(R.id.btnImage6);
        button7 = findViewById(R.id.btnImage7);
        button8 = findViewById(R.id.btnImage8);
        button9 = findViewById(R.id.btnImage9);
        scoreX=findViewById(R.id.scoreX);
        scoreO=findViewById(R.id.score0);
        reset = findViewById(R.id.reset);
        onClickReset();
    }
    private void onClickReset(){
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetValue();
                xCount=0;
                oCount=0;
                scoreX.setText("Score X : 0 ");
                scoreO.setText("Score 0 : 0 ");
            }
        });
    }
    private void resetValue(){
        b1 = 5; b2 = 5; b3 = 5; b4 = 5; b5 = 5; b6 = 5; b7 = 5; b8 = 5; b9 = 5;
    }
    private void onClickButton1(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(startGame.equals("X")){
                   button1.setImageResource(R.drawable.cross);
                   b1=1;
                   i++;
               }
               else{
                   button1.setImageResource(R.drawable.circle);
                   b1=0;
                   i++;
               }
               choosePlayer();
               winningGame();
            }
        });
    }
    private void onClickButton2(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    button2.setImageResource(R.drawable.cross);
                    b1=1;
                    i++;
                }
                else{
                    button2.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }
}