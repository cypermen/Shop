package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Authorization extends AppCompatActivity {
    Button back;
    Button admin;
    Intent backIntenntion;
    Intent adminIntention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        back = (Button) findViewById(R.id.buttonexit1);
        admin = (Button) findViewById(R.id.buttongoadmin);
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
                adminIntention = new Intent(Authorization.this, Admin.class);
                startActivity(adminIntention);
            }
        });
    }


}
