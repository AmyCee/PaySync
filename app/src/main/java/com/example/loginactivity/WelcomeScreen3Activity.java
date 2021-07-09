package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeScreen3Activity extends AppCompatActivity {

    TextView textView15, signup01;
    Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //target element
        signup01 = findViewById(R.id.signup01);
        buttonlogin = findViewById(R.id.buttonlogin);

        signup01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WelcomeScreen3Activity.this, SignUpScreen3Activity.class);
                startActivity(a);
                finish();

            }
        });


































    }
}