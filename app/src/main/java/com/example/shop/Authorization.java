package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Authorization extends AppCompatActivity {
    Button back;
    Button admin;
    Intent backIntenntion;
    Intent adminIntention;
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        back = (Button) findViewById(R.id.buttonexit1);
        admin = (Button) findViewById(R.id.buttongoadmin);
        login = findViewById(R.id.log);
        password = findViewById(R.id.pass);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backIntenntion = new Intent(Authorization.this, StartMenu.class);
                startActivity(backIntenntion);
            }
        });

            admin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (login.getText().toString().equals("admin@") && password.getText().toString().equals("admin")) {
                        adminIntention = new Intent(Authorization.this, Admin.class);
                        startActivity(adminIntention);
                    }
                }
            });
        }
    }


