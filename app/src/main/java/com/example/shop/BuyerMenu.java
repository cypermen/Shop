package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BuyerMenu extends AppCompatActivity {

    private Order order;
    private Button back;
    private Button basket;
    private Button product1;
    private Button product2;
    private Button product3;
    private Button product4;
    private Button product5;
    private Button product6;
    private Button product7;
    private Button product8;
    private Intent basketIntent;
    private Intent backIntent;
    private TextView name1;
    private TextView name2;
    private TextView name3;
    private TextView name4;
    private TextView name5;
    private TextView name6;
    private TextView name7;
    private TextView name8;
    private TextView price1;
    private TextView price2;
    private TextView price3;
    private TextView price4;
    private TextView price5;
    private TextView price6;
    private TextView price7;
    private TextView price8;
    private int savePrice1;
    private int savePrice2;
    private int savePrice3;
    private int savePrice4;
    private int savePrice5;
    private int savePrice6;
    private int savePrice7;
    private int savePrice8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyermenu);
        order = new Order();
        back = (Button)findViewById(R.id.back);
        basket =(Button)findViewById(R.id.buttonbasket);
        product1 =(Button)findViewById(R.id.buttonbusket1);
        product2 =(Button)findViewById(R.id.buttonbusket2);
        product3 =(Button)findViewById(R.id.buttonbusket3);
        product4 =(Button)findViewById(R.id.buttonbusket4);
        product5 =(Button)findViewById(R.id.buttonbusket5);
        product6 =(Button)findViewById(R.id.buttonbusket6);
        product7 =(Button)findViewById(R.id.buttonbusket);
        product8 =(Button)findViewById(R.id.buttonbusket8);
        name1 = (TextView) findViewById(R.id.textView2);
        name2 = (TextView) findViewById(R.id.textView3);
        name3 = (TextView) findViewById(R.id.textView4);
        name4 = (TextView) findViewById(R.id.textView5);
        name5 = (TextView) findViewById(R.id.textView6);
        name6 = (TextView) findViewById(R.id.textView7);
        name7 = (TextView) findViewById(R.id.textView8);
        name8 = (TextView) findViewById(R.id.textView9);

        price1 =(TextView)findViewById(R.id.textView19);
        price2 =(TextView)findViewById(R.id.textView20);
        price3 =(TextView)findViewById(R.id.textView21);
        price4 =(TextView)findViewById(R.id.textView22);
        price5 =(TextView)findViewById(R.id.textView24);
        price6 =(TextView)findViewById(R.id.textView25);
        price7 =(TextView)findViewById(R.id.textView26);
        price8 =(TextView)findViewById(R.id.textView27);

        savePrice1 = Integer.parseInt(price1.getText().toString());
        savePrice2 = Integer.parseInt(price2.getText().toString());
        savePrice3 = Integer.parseInt(price3.getText().toString());
        savePrice4 = Integer.parseInt(price4.getText().toString());
        savePrice5 = Integer.parseInt(price5.getText().toString());
        savePrice6 = Integer.parseInt(price6.getText().toString());
        savePrice7 = Integer.parseInt(price7.getText().toString());
        savePrice8 = Integer.parseInt(price8.getText().toString());


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backIntent = new Intent(BuyerMenu.this, StartMenu.class);
                startActivity(backIntent);
            }

        });


        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basketIntent = new Intent(BuyerMenu.this, Buyerbasket.class);
                basketIntent.putExtra(Order.class.getSimpleName(), order);
                startActivity(basketIntent);
            }

        });

        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name1.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name2.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name3.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name4.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name5.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name6.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name7.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });

        product8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order.addProdToOrder(name8.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), "Товар добавлен в корзину", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,45,640);
                toast.show();
            }

        });
    }
}
