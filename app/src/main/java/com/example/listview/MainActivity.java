package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText task;
    Button btn;

    ArrayList<String> friendList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        friendList.add("Rauf");
        friendList.add("Faisal");
        friendList.add("Ali");
        friendList.add("Saad");
        friendList.add("Abdul Rab");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,friendList);
        listView =  findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        task = findViewById(R.id.inputText);
        btn = findViewById(R.id.addBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                friendList.add(task.getText().toString());
                task.setText("");
                arrayAdapter.notifyDataSetChanged();
            }
        });








    }
}