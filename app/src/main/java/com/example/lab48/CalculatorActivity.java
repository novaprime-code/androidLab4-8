package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    private EditText etNum1, etNum2;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnGoBack;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        etNum1 = findViewById(R.id.etNumber1);
        etNum2 = findViewById(R.id.etNumber2);
        btnAdd =findViewById(R.id.btnAdd);
        btnSubtract =findViewById(R.id.btnSubtract);
        btnMultiply =findViewById(R.id.btnMultiply);
        btnDivide =findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult(Operation.ADD);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult(Operation.SUB);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult(Operation.MUL);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult(Operation.DIV);
            }
        });

        btnGoBack = findViewById(R.id.btnBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private  void calculateResult(Operation op){
        String num1Text = etNum1.getText().toString().trim();
        double num1 = num1Text.isEmpty() ? 0 : Double.parseDouble(num1Text);

        String num2Text = etNum2.getText().toString().trim();
        double num2 = num2Text.isEmpty() ? 0 : Double.parseDouble(num2Text);

        double res = 0;

        switch (op){
            case ADD:
                res = num1 + num2;
                break;
            case SUB:
                res = num1 - num2;
                break;

            case MUL:
                res = num1 * num2;
                break;
            case DIV:
                if (num2 !=0){
                    res = num1 / num2;
                }else{
                    Toast.makeText(this,"Cannot divide by zero", Toast.LENGTH_SHORT).show();
                }
                break;

        }
        tvResult.setText("Result: " + res);


    }

    private enum Operation{
        ADD, SUB, MUL, DIV
    }


}