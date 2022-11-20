package com.example.our_first_android_application;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class Hands {
    public static final int rock = 0;
    public static final int scissors = 1;
    public static final int paper = 2;
}

public class SoloGameResult extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.solo_game_result);

        int id = getIntent().getIntExtra("MY_HAND", 0);

        ImageView myHandImage = findViewById(R.id.myHandImage);
        int myHand = 0;

        switch (id) {
            case R.id.rock:
                myHandImage.setImageResource(R.drawable.rock);
                myHand = Hands.rock;
                break;
            case R.id.scissors:
                myHandImage.setImageResource(R.drawable.scissors);
                myHand = Hands.scissors;
                break;
            case R.id.paper:
                myHandImage.setImageResource(R.drawable.paper);
                myHand = Hands.paper;
                break;
        }

        ImageView computerHandImage = findViewById(R.id.computerHandImage);
        int computerHand = (int) Math.round(Math.random() * 3);

        switch (computerHand) {
            case Hands.rock:
                computerHandImage.setImageResource(R.drawable.rock);
                break;
            case Hands.scissors:
                computerHandImage.setImageResource(R.drawable.scissors);
                break;
            case Hands.paper:
                computerHandImage.setImageResource(R.drawable.paper);
                break;
        }

        TextView result = findViewById(R.id.solo_game_result);
        int gameResult = (computerHand - myHand + 3) % 3;

        switch (gameResult) {
            case 0:
                result.setText(R.string.result_draw);
                break;
            case 1:
                result.setText(R.string.result_win);
                break;
            case 2:
                result.setText(R.string.result_lose);
                break;
        }

        final Button button_to_menu = findViewById(R.id.Button_to_menu);
        button_to_menu.setOnClickListener(this);

        final Button button_to_another_game = findViewById(R.id.Button_to_another_game);
        button_to_another_game.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Button_to_menu:
                startActivity(new Intent(this, Menu.class));
                break;
            case R.id.Button_to_another_game:
                startActivity(new Intent(this, SoloGame.class));
                break;
        }
    }
}
