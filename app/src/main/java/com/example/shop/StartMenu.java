package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartMenu extends AppCompatActivity {
    Button buyer;
    Button admin;
    Intent buyerIntention;
    Intent adminIntention;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmenu);
        buyer = (Button) findViewById(R.id.start);
        admin = (Button) findViewById(R.id.admin);
        buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyerIntention = new Intent(StartMenu.this, BuyerMenu.class);
                startActivity(buyerIntention);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminIntention = new Intent(StartMenu.this, Authorization.class);
                startActivity(adminIntention);
            }
        });
    }
}