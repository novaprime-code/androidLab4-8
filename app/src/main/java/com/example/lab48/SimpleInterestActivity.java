package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleInterestActivity extends AppCompatActivity {
    private EditText etPrincipal, etRate, etTime;
    private Button btnSubmit, btnBack;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_interest_activity);

        etPrincipal = findViewById(R.id.etPrincipal);
        etRate = findViewById(R.id.etRate);
        etTime = findViewById(R.id.etTime);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String principalText = etPrincipal.getText().toString().trim();
                    double principle = principalText.isEmpty() ? 0 : Double.parseDouble(principalText);

                    String rateText = etRate.getText().toString().trim();
                    double rate = rateText.isEmpty() ? 0 : Double.parseDouble(rateText);

                    String timeText = etTime.getText().toString().trim();
                    double time = timeText.isEmpty() ? 0 : Double.parseDouble(timeText);

                    double si = (principle * rate * time) / 100;
                    tvResult.setText("simple Interest: " + si);
                }catch(Exception e){
                    tvResult.setText("Error OCcured: " + e);
                }

            }
        });

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}