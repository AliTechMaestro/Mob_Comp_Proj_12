package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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





    }
}