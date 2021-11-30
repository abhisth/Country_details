package com.example.countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.countrydetails.MainActivity;

public class pakistandetails extends AppCompatActivity {

    TextView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakistandetails);
        getSupportActionBar().setTitle("Pakistan");


        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pakistandetails.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(pakistandetails.this,"Returning Home",Toast.LENGTH_SHORT).show();
            }
        });

    }
}