package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class aboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Intent receiver=getIntent();
        TextView about_us_text=findViewById(R.id.about_us_txt);

        String desc=receiver.getStringExtra("description");

        about_us_text.setText(desc);


    }
}