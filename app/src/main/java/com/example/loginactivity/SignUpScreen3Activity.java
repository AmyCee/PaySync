package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUpScreen3Activity extends AppCompatActivity {


    ImageButton imageButton00;
    RadioButton rb;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen3);

        //target element
        imageButton00 = findViewById(R.id.imageButton00);
        rg = (RadioGroup) findViewById(R.id.radioGroup00);

        imageButton00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(SignUpScreen3Activity.this, WelcomeScreen3Activity.class);
                startActivity(b);
                finish();

            }
        });

    }

public void rbclick(View v)
{
    int radiobuttonid = rg.getCheckedRadioButtonId();
    rb =  (RadioButton) findViewById(radiobuttonid);

   // Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();
}
}