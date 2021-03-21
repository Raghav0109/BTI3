package com.example.bti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button CSE;
    Button ECE;
    Button ARTIFICIAL_INTELLIGENCE;
    Button CIVIL_ENGG;
    Button MECHANICAL_ENGG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CSE = findViewById(R.id.buttonlogin);
        ECE = findViewById(R.id.button2);
        ARTIFICIAL_INTELLIGENCE = findViewById(R.id.button3);
        CIVIL_ENGG = findViewById(R.id.button4);
        MECHANICAL_ENGG = findViewById(R.id.button5);
        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "loading", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this ,Signup.class);
                startActivity(intent);
            }



        });

        ECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "loading", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this ,ecesignin.class);
                startActivity(intent);
            }



        });
        ARTIFICIAL_INTELLIGENCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "loading", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this ,aisignin.class);
                startActivity(intent);
            }



        });
        CIVIL_ENGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "loading", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this ,civillogin.class);
                startActivity(intent);
            }



        });
        MECHANICAL_ENGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "loading", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this ,mechlogin.class);
                startActivity(intent);
            }



        });


    }



}