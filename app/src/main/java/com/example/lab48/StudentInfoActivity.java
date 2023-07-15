package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentInfoActivity extends AppCompatActivity {
    private EditText etName, etRollno, etGender, etAddress;
    private Button btnSubmit, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info_activity);

        etName = findViewById(R.id.etName);
        etRollno = findViewById(R.id.etRollNo);
        etGender = findViewById(R.id.etGender);
        etAddress = findViewById(R.id.etAddress);
        btnSubmit = findViewById(R.id.btnSubmit2);
         btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =  etName.getText().toString();
                String rollno =  etRollno.getText().toString();
                String gender =  etGender.getText().toString();
                String address =  etAddress.getText().toString();


                Intent intent = new Intent(StudentInfoActivity.this, DisplayInfoActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("rollno",rollno);
                intent.putExtra("gender",gender);
                intent.putExtra("address",address);
                startActivity(intent);
            }
        });


    }
}