package com.example.our_first_android_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;


public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu);

        final Button start_button = findViewById(R.id.Button_to_Game);
        final Button description_button = findViewById(R.id.Button_to_description);

        start_button.setOnClickListener(this);
        description_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Button_to_Game:
                startActivity(new Intent(this, SoloGame.class));
                break;
            case R.id.Button_to_description:
                startActivity(new Intent(this, Description.class));
                break;
        }
    }
}