package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homebtn, coursebtn, aboutbtn;
        homebtn=findViewById(R.id.homebtn);
        coursebtn=findViewById(R.id.coursebtn);
        aboutbtn=findViewById(R.id.aboutbtn);

        Intent home, courses, about_us;
        home=new Intent(MainActivity.this, Home.class);
        home.putExtra("name", "Yash Chauhan");
        home.putExtra("phone", "8879191988");
        home.putExtra("email", "yashc1988@gmail.com");

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(home);
            }
        });


        String[] course_names = {"Data Science", "Data Analysis", "Data Engineering", "Business Analysis", "Machine Learning"};
        courses=new Intent(MainActivity.this, Courses.class);
        courses.putExtra("courses", course_names);

        coursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(courses);
            }
        });

        about_us=new Intent(MainActivity.this, aboutUs.class);
        String description="We are a group of data enthusiast who love working with data and spreading our knowledge to those curious.\nWe offer extensive courses throughout the data industry and aim for the best for our students";
        about_us.putExtra("description", description);

        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(about_us);
            }
        });
    }
}