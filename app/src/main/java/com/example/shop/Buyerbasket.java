package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Buyerbasket extends AppCompatActivity {

    private Button back;

    private Button deleteAll;

    private Button buy;

    private Button minus1;
    private Button minus2;
    private Button minus3;
    private Button minus4;
    private Button minus5;
    private Button minus6;
    private Button minus7;
    private Button minus8;

    private Intent backIntent;
    private Intent buyIntent;

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

    private TextView sum;

    private int amounts1  ;
    private int amounts2  ;
    private int amounts3  ;
    private int amounts4  ;
    private int amounts5  ;
    private int amounts6  ;
    private int amounts7  ;
    private int amounts8  ;

    private int price1;
    private int price2;
    private int price3;
    private int price4;
    private int price5;
    private int price6;
    private int price7;
    private int price8;

    private String names1 ;
    private String names2 ;
    private String names3 ;
    private String names4 ;
    private String names5 ;
    private String names6 ;
    private String names7 ;
    private String names8 ;

    private int sums;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyerbasket);
        name1  = (TextView)findViewById(R.id.textView28);
        name2  = (TextView)findViewById(R.id.textView29);
        name3  = (TextView)findViewById(R.id.textView30);
        name4  = (TextView)findViewById(R.id.textView31);
        name5  = (TextView)findViewById(R.id.textView32);
        name6  = (TextView)findViewById(R.id.textView33);
        name7  = (TextView)findViewById(R.id.textView34);
        name8  = (TextView)findViewById(R.id.textView18);

        amount1 = (TextView)findViewById(R.id.textView35);
        amount2 = (TextView)findViewById(R.id.textView36);
        amount3 = (TextView)findViewById(R.id.textView37);
        amount4 = (TextView)findViewById(R.id.textView38);
        amount5 = (TextView)findViewById(R.id.textView39);
        amount6 = (TextView)findViewById(R.id.textView40);
        amount7 = (TextView)findViewById(R.id.textView41);
        amount8 = (TextView)findViewById(R.id.textView49);

        sum     = (TextView)findViewById(R.id.textView43);

        back    = (Button)findViewById(R.id.button10);

        buy = (Button)findViewById(R.id.buttonbuy);

        deleteAll = (Button)findViewById(R.id.button11);

        minus1  = (Button)findViewById(R.id.button1);
        minus2  = (Button)findViewById(R.id.button2);
        minus3  = (Button)findViewById(R.id.button3);
        minus4  = (Button)findViewById(R.id.button4);
        minus5  = (Button)findViewById(R.id.button5);
        minus6  = (Button)findViewById(R.id.button6);
        minus7  = (Button)findViewById(R.id.button7);
        minus8  = (Button)findViewById(R.id.button8);


        names1 = getIntent().getStringExtra("names1");
        names2 = getIntent().getStringExtra("names2");
        names3 = getIntent().getStringExtra("names3");
        names4 = getIntent().getStringExtra("names4");
        names5 = getIntent().getStringExtra("names5");
        names6 = getIntent().getStringExtra("names6");
        names7 = getIntent().getStringExtra("names7");
        names8 = getIntent().getStringExtra("names8");

        amounts1  = getIntent().getIntExtra("amount1", 0);
        amounts2  = getIntent().getIntExtra("amount2", 0);
        amounts3  = getIntent().getIntExtra("amount3", 0);
        amounts4  = getIntent().getIntExtra("amount4", 0);
        amounts5  = getIntent().getIntExtra("amount5", 0);
        amounts6  = getIntent().getIntExtra("amount6", 0);
        amounts7  = getIntent().getIntExtra("amount7", 0);
        amounts8  = getIntent().getIntExtra("amount8", 0);

        price1    = getIntent().getIntExtra("price1", 0);
        price2    = getIntent().getIntExtra("price2", 0);
        price3    = getIntent().getIntExtra("price3", 0);
        price4    = getIntent().getIntExtra("price4", 0);
        price5    = getIntent().getIntExtra("price5", 0);
        price6    = getIntent().getIntExtra("price6", 0);
        price7    = getIntent().getIntExtra("price7", 0);
        price8    = getIntent().getIntExtra("price8", 0);

       amount1.setText(Integer.toString(amounts1));
       amount2.setText(Integer.toString(amounts2));
       amount3.setText(Integer.toString(amounts3));
       amount4.setText(Integer.toString(amounts4));
       amount5.setText(Integer.toString(amounts5));
       amount6.setText(Integer.toString(amounts6));
       amount7.setText(Integer.toString(amounts7));
       amount8.setText(Integer.toString(amounts8));

        name1.setText("Монитор Acer Nitro VG271Pbmiipx");
        name2.setText("Монитор LG 25UM58");
        name3.setText("Мышь Razer Basilisk Black USB");
        name4.setText("Мышь A4Tech Bloody V7");
        name5.setText("Гарнитура Razer Kraken");
        name6.setText("Гарнитура HyperX Cloud Stinger");
        name7.setText("Клавиатура Steelseries Apex 7 Red Switch");
        name8.setText("Клавиатура HyperX Alloy Elite");

        sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;

        sum.setText(Integer.toString(sums));

                back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backIntent = new Intent(Buyerbasket.this, BuyerMenu.class);

               backIntent.putExtra( "amount1", amounts1);
               backIntent.putExtra( "amount2", amounts2);
               backIntent.putExtra( "amount3", amounts3);
               backIntent.putExtra( "amount4", amounts4);
               backIntent.putExtra( "amount5", amounts5);
               backIntent.putExtra( "amount6", amounts6);
               backIntent.putExtra( "amount7", amounts7);
               backIntent.putExtra( "amount8", amounts8);

                startActivity(backIntent);
            }

        });


        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyIntent = new Intent(Buyerbasket.this, StartMenu.class);
                if(sums != 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Спасибо за покупку! Приходите ещё.", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 45, 640);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Приходите ещё.", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 45, 640);
                    toast.show();
                }
                startActivity(buyIntent);
            }

        });

        deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amounts1  = 0;
                amounts2  = 0;
                amounts3  = 0;
                amounts4  = 0;
                amounts5  = 0;
                amounts6  = 0;
                amounts7  = 0;
                amounts8  = 0;
                sums = 0;

                amount1.setText(Integer.toString(amounts1));
                amount2.setText(Integer.toString(amounts2));
                amount3.setText(Integer.toString(amounts3));
                amount4.setText(Integer.toString(amounts4));
                amount5.setText(Integer.toString(amounts5));
                amount6.setText(Integer.toString(amounts6));
                amount7.setText(Integer.toString(amounts7));
                amount8.setText(Integer.toString(amounts8));

                sum.setText("0");
            }

        });

        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts1 != 0)
                amounts1--;
                amount1.setText(Integer.toString(amounts1));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts2 != 0)
                    amounts2--;
                amount2.setText(Integer.toString(amounts2));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts3 != 0)
                    amounts3--;
                amount3.setText(Integer.toString(amounts3));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts4 != 0)
                    amounts4--;
                amount4.setText(Integer.toString(amounts4));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts5 != 0)
                    amounts5--;
                amount5.setText(Integer.toString(amounts5));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts6 != 0)
                    amounts6--;
                amount6.setText(Integer.toString(amounts6));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts7 != 0)
                    amounts7--;
                amount7.setText(Integer.toString(amounts7));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

        minus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amounts8 != 0)
                    amounts8--;
                amount8.setText(Integer.toString(amounts8));
                sums = price1 * amounts1 + price2 * amounts2 + price3 * amounts3 + price4 * amounts4 + price5 * amounts5 + price6 * amounts6+ price7 * amounts7+ price8 * amounts8;
                sum.setText(Integer.toString(sums));
            }

        });

    }
}