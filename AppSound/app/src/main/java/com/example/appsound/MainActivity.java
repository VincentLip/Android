package com.example.appsound;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button buttonBlack;
    private Button buttonGreen;
    private Button buttonPurple;
    private Button buttonYellow;
    private Button buttonRed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonBlack = findViewById(R.id.buttonBlack);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.black);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        buttonGreen = findViewById(R.id.buttonGreen);
        MediaPlayer mp1 = MediaPlayer.create(this,R.raw.green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });

        buttonPurple = findViewById(R.id.buttonPurple);
        MediaPlayer mp2 = MediaPlayer.create(this,R.raw.purple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        buttonRed = findViewById(R.id.buttonRed);
        MediaPlayer mp3 = MediaPlayer.create(this,R.raw.red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        buttonYellow = findViewById(R.id.buttonYellow);
        MediaPlayer mp4 = MediaPlayer.create(this,R.raw.yellow);
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });

    }
}