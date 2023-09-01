package com.example.todo;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addTask;

    private ArrayList<String> items;

    private ListView list;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = findViewById(R.id.list);
        addTask = findViewById(R.id.addTask);
        Intent intent = getIntent();

        items = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        list.setAdapter(arrayAdapter);

        if (intent != null){
            String text = intent.getStringExtra("key");
            arrayAdapter.add(text);


        }

        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Todo.class));
            }
        });

    }
}