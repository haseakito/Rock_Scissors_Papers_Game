package com.example.our_first_android_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class SoloGame extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.solo_game);

        final ImageButton rock = findViewById(R.id.rock);
        final ImageButton scissors = findViewById(R.id.scissors);
        final ImageButton paper = findViewById(R.id.paper);

        rock.setOnClickListener(this);
        scissors.setOnClickListener(this);
        paper.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SoloGameResult.class);

        // put additional information to the Intent
        intent.putExtra("MY_HAND", view.getId());

        startActivity(intent);
    }
}
