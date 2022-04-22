package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Name =(TextView) findViewById(R.id.Name);
        TextView Age =(TextView) findViewById(R.id.Age);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.SignUp);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Name.getText().toString().equals("nicholaus") && Age.getText().toString().equals("21")){
                    //correct
                    Toast.makeText(MainActivity.this,"Register SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Register FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}