package com.example.shop;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Buyerbasket extends AppCompatActivity {
    private TextView name1;
    private TextView name2;
    private TextView name3;
    private TextView name4;
    private TextView name5;
    private TextView name6;
    private TextView name7;
    private TextView name8;


    private TextView amount1;
    private TextView amount2;
    private TextView amount3;
    private TextView amount4;
    private TextView amount5;
    private TextView amount6;
    private TextView amount7;
    private TextView amount8;

    private int price1 = getIntent().getIntExtra("price1", 0);
    private int price2 = getIntent().getIntExtra("price2", 0);
    private int price3 = getIntent().getIntExtra("price3", 0);
    private int price4 = getIntent().getIntExtra("price4", 0);
    private int price5 = getIntent().getIntExtra("price5", 0);
    private int price6 = getIntent().getIntExtra("price6", 0);
    private int price7 = getIntent().getIntExtra("price7", 0);
    private int price8 = getIntent().getIntExtra("price8", 0);
    ;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyerbasket);
        name1 = (TextView)findViewById(R.id.textView28);
        name2 = (TextView)findViewById(R.id.textView29);
        name3 = (TextView)findViewById(R.id.textView30);
        name4 = (TextView)findViewById(R.id.textView31);
        name5 = (TextView)findViewById(R.id.textView32);
        name6 = (TextView)findViewById(R.id.textView33);
        name7 = (TextView)findViewById(R.id.textView34);

       amount1 = (TextView)findViewById(R.id.textView35);
       amount2 = (TextView)findViewById(R.id.textView36);
       amount3 = (TextView)findViewById(R.id.textView37);
       amount4 = (TextView)findViewById(R.id.textView38);
       amount5 = (TextView)findViewById(R.id.textView39);
       amount6 = (TextView)findViewById(R.id.textView40);
       amount7 = (TextView)findViewById(R.id.textView41);



    }
}