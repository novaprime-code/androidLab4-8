package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSimpleInterest, btnCalculator, btnStudentInfo, btnPhoneNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);

        btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleInterestActivity.class);
                startActivity(intent);
            }
        });

        btnCalculator = findViewById(R.id.btnCalculator);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        btnStudentInfo = findViewById(R.id.btnStudentInfo);
        btnStudentInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, StudentInfoActivity.class);
                startActivity(intent);
            }
        });

        btnPhoneNumber = findViewById(R.id.btnPhoneNumber);
        btnPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhoneNumberActivity.class);
                startActivity(intent);
            }
        });




    }
}