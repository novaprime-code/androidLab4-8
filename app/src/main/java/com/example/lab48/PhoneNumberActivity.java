package com.example.lab48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PhoneNumberActivity extends AppCompatActivity {
    private EditText etPhone;
    private Button btnSave, btnCall, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_number_activity);

        etPhone = findViewById(R.id.etPhone);
        btnSave = findViewById(R.id.btnSave);
        btnCall = findViewById(R.id.btnCall);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber =  etPhone.getText().toString();
                if(!phoneNumber.isEmpty()){
                    Intent saveIntent =  new Intent(Intent.ACTION_INSERT);
                    saveIntent.setType(ContactsContract.Contacts.CONTENT_TYPE);
                    saveIntent.putExtra(ContactsContract.Intents.Insert.PHONE, phoneNumber);
                    startActivity(saveIntent);
                }else {
                    Toast.makeText(PhoneNumberActivity.this, "Please enter a phone number", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber =  etPhone.getText().toString();
                if(!phoneNumber.isEmpty()){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:" + phoneNumber));
                    startActivity(callIntent);
                }else{
                    Toast.makeText(PhoneNumberActivity.this,"Please enter a phone number", Toast.LENGTH_SHORT).show();

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