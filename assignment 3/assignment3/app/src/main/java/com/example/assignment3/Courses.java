package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Intent receiver=getIntent();
        String[] courses_list;
        courses_list = receiver.getStringArrayExtra("courses");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, courses_list);

        ListView course_list = (ListView) findViewById(R.id.course_list);
        course_list.setAdapter(adapter);
    }
}