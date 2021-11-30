package com.example.countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Nepal,India,Pakistan,Afghan,Bangla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Countries");

        Nepal = findViewById(R.id.Nepal);
        India = findViewById(R.id.India);
        Pakistan = findViewById(R.id.Pakistan);
        Afghan = findViewById(R.id.Afghan);
        Bangla = findViewById(R.id.Bangla);



        Nepal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nepaldetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Loading details of Nepal", Toast.LENGTH_SHORT);
            }
        });

        India.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, indiadetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Loading details of India", Toast.LENGTH_SHORT);

            }
        });
        Pakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pakistandetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Loading details of Pakistan", Toast.LENGTH_SHORT);
            }
        });

        Afghan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,afghandetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Loading details of Afghanistan",Toast.LENGTH_SHORT);
            }
        });


        Bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bangladetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Loading details of Bangladesh",Toast.LENGTH_SHORT);
            }
        });
    }
}