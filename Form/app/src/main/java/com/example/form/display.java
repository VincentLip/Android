package com.example.form;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class display extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        message = findViewById(R.id.message);
        Intent intent = getIntent();

        if(intent != null){
            String str = intent.getStringExtra("key");
            message.setText(str);
        }

    }
}