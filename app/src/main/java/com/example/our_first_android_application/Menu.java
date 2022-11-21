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

        //set and display a xml file in layout
        setContentView(R.layout.menu);

        // search by key and assign buttons to variables
        final Button start_button = findViewById(R.id.Button_to_Game);
        final Button description_button = findViewById(R.id.Button_to_description);

        // add the implemented logic in onClick to the variables
        start_button.setOnClickListener(this);
        description_button.setOnClickListener(this);
    }

    // this method is responsible for implementing the logic what the button should do
    @Override
    public void onClick(View view) {
        // when there're more than one button, use conditionals to decide on which button is pushed
        // Intent is a contaner for information of what to do next (in this case, change display display)
        // and startActivity initiate what's inside the Intent
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