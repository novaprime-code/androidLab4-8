package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayInfoActivity extends AppCompatActivity {
    private TextView tvName, tvRollNo, tvAddress, tvGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info_activity);
        tvName = findViewById(R.id.tvName);
        tvRollNo = findViewById(R.id.tvRollno);
        tvGender = findViewById(R.id.tvGender);
        tvAddress = findViewById(R.id.tvAddress);
        Intent intent = getIntent();

        if(intent != null){
            String name = intent.getStringExtra("name");
            String rollno = intent.getStringExtra("rollno");
            String gender = intent.getStringExtra("gender");
            String address = intent.getStringExtra("address");
            tvName.setText( name);
            tvRollNo.setText(rollno);
            tvGender.setText( gender);
            tvAddress.setText(address);
        }


        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayInfoActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}