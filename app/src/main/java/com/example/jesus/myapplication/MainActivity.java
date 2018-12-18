package com.example.jesus.myapplication;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView movieImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageView = findViewById(R.id.imageView);

        Button buttonGravity = findViewById(R.id.btnGravity);
        Button buttonJumanji = findViewById(R.id.btnJumanji);
        Button buttonLion = findViewById(R.id.btnReyLeon);
        Button buttonStarWars = findViewById(R.id.btnWars);
        Button buttonInception = findViewById(R.id.btnOrigen);
        Button buttonToyStory = findViewById(R.id.btnToy);

        buttonGravity.setOnClickListener(this);
        buttonJumanji.setOnClickListener(this);
        buttonLion.setOnClickListener(this);
        buttonStarWars.setOnClickListener(this);
        buttonInception.setOnClickListener(this);
        buttonToyStory.setOnClickListener(this);
    }

    @Override
    public void onClick(View buttonView) {
        int buttonId = buttonView.getId();

        int imageId;

        switch(buttonId) {
            case R.id.btnGravity:
                imageId = R.drawable.gravity;
                break;
            case R.id.btnJumanji:
                imageId = R.drawable.jumanji;
                break;
            case R.id.btnReyLeon:
                imageId = R.drawable.leon;
                break;
            case R.id.btnWars:
                imageId = R.drawable.gravity;
                break;
            case R.id.btnOrigen:
                imageId = R.drawable.origen;
                break;
            case R.id.btnToy:
                imageId = R.drawable.toy;
                break;
            default:
                imageId = 0;
        }

        if (imageId != 0) {
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this, imageId));
        }
    }
}