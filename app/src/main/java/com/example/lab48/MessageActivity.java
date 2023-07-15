package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {
    private Button btnSend, btnBack;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_activity);
        etPassword = findViewById(R.id.etPassword);
        btnSend =findViewById(R.id.btnSend);
        btnBack =findViewById(R.id.btnBack);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password =  etPassword.getText().toString();
                if(password.equals("mypass123")){
                    Intent intent = new Intent(MessageActivity.this, DisplayMessageActivity.class);
                    intent.putExtra("message","Royal Family massacare, Nepali Parties, Nosy Neighbours");
                    startActivity(intent);
                }else{
                    Toast.makeText(MessageActivity.this, "Invalid Password.\n Try Again ! ", Toast.LENGTH_SHORT).show();
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