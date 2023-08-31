package com.example.form;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText firstname;
    private EditText lastname;
    private EditText phone;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        phone = findViewById(R.id.phone);
        sendButton = findViewById(R.id.test);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = lastname.getText().toString() + " " + firstname.getText().toString()+ " " + phone.getText().toString();
                Intent intent = new Intent(MainActivity.this, display.class);
                intent.putExtra("key", str);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}