package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        TextView name, phone, email;
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);

        Intent receiver=getIntent();
        String n=receiver.getStringExtra("name");
        String ph=receiver.getStringExtra("phone");
        String em=receiver.getStringExtra("email");

        name.setText(n);
        phone.setText(ph);
        email.setText(em);
    }
}