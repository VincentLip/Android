package com.example.todo;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Todo extends AppCompatActivity {

    private Button sendButton;
    private EditText task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        sendButton = findViewById(R.id.sendButton);
        task = findViewById(R.id.task);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = task.getText().toString();
                Intent intent = new Intent(Todo.this, MainActivity.class);
                intent.putExtra("key", str);
                Todo.this.startActivity(intent);
            }
        });


    }
}