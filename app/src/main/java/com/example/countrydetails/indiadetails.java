package com.example.countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class indiadetails extends AppCompatActivity {
TextView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiadetails);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(indiadetails.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(indiadetails.this,"Returning Home",Toast.LENGTH_SHORT);
            }
        });

    }
}