package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Admin extends AppCompatActivity {
    Button go;
    final Random random = new Random();

    Handler handler;
    Handler handler1;
    Handler handler2;
    Handler handler3;
    Handler handler4;
    TextView text;
    TextView text4;
    TextView text1;
    TextView text2;
    TextView text3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        go=findViewById(R.id.button6);
        text=findViewById(R.id.textView50);
        text1=findViewById(R.id.textView51);
        text2=findViewById(R.id.textView52);
        text3=findViewById(R.id.textView53);
        text4=findViewById(R.id.textView54);
        handler = new Handler() {   // создание хэндлера и вывод сообщений от него на главный экран
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what==1) {
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь1          ");
                    text.invalidate();
                }if (msg.what==2){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь2          ");
                    text.invalidate();}
                if (msg.what==3){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь3          ");
                    text.invalidate();}
                if (msg.what==4){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь4          ");
                    text.invalidate();}
                if (msg.what==5){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь5          ");
                    text.invalidate();}
                if (msg.what==6){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь6          ");
                    text.invalidate();}
                if (msg.what==7){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь7          ");
                    text.invalidate();}
                if (msg.what==8){
                    text.setText(text.getText().toString()+"Взято:  Игровая мышь8          ");
                    text.invalidate();}
                if (msg.what==0){
                    text.setText(text.getText().toString()+"Идет на кассу...          ");
                    text.invalidate();}

            }
        };
        handler1 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what==1) {
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь1         ");
                    text1.invalidate();
                }if (msg.what==2){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь2         ");
                    text1.invalidate();}
                if (msg.what==3){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь3         ");
                    text1.invalidate();}
                if (msg.what==4){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь4         ");
                    text1.invalidate();}
                if (msg.what==5){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь5         ");
                    text1.invalidate();}
                if (msg.what==6){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь6         ");
                    text1.invalidate();}
                if (msg.what==7){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь7         ");
                    text1.invalidate();}
                if (msg.what==8){
                    text1.setText(text1.getText().toString()+"Взято:  Игровая мышь8         ");
                    text1.invalidate();}
                if (msg.what==0){
                    text1.setText(text1.getText().toString()+"Идет на кассу...          ");
                    text1.invalidate();}


            }
        };
        handler2 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what==1) {
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь1          ");
                    text2.invalidate();
                }if (msg.what==2){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь2          ");
                    text2.invalidate();}
                if (msg.what==3){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь3          ");
                    text2.invalidate();}
                if (msg.what==4){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь4          ");
                    text2.invalidate();}
                if (msg.what==5){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь5          ");
                    text2.invalidate();}
                if (msg.what==6){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь6          ");
                    text2.invalidate();}
                if (msg.what==7){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь7          ");
                    text2.invalidate();}
                if (msg.what==8){
                    text2.setText(text2.getText().toString()+"Взято:  Игровая мышь8          ");
                    text2.invalidate();}
                if (msg.what==0){
                    text2.setText(text2.getText().toString()+"Идет на кассу...          ");
                    text2.invalidate();}

            }
        };
        handler3 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what==1) {
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь1          ");
                    text3.invalidate();
                }if (msg.what==2){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь2          ");
                    text3.invalidate();}
                if (msg.what==3){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь3          ");
                    text3.invalidate();}
                if (msg.what==4){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь4          ");
                    text3.invalidate();}
                if (msg.what==5){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь5          ");
                    text3.invalidate();}
                if (msg.what==6){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь6          ");
                    text3.invalidate();}
                if (msg.what==7){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь7          ");
                    text3.invalidate();}
                if (msg.what==8){
                    text3.setText(text3.getText().toString()+"Взято:  Игровая мышь8          ");
                    text3.invalidate();}
                if (msg.what==0){
                    text3.setText(text3.getText().toString()+"Идет на кассу...          ");
                    text3.invalidate();}

            }
        };
        handler4 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what==1) {
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь1          ");
                    text4.invalidate();
                }if (msg.what==2){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь2          ");
                    text4.invalidate();}
                if (msg.what==3){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь3          ");
                    text4.invalidate();}
                if (msg.what==4){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь4          ");
                    text4.invalidate();}
                if (msg.what==5){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь5          ");
                    text4.invalidate();}
                if (msg.what==6){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь6          ");
                    text4.invalidate();}
                if (msg.what==7){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь7          ");
                    text4.invalidate();}
                if (msg.what==8){
                    text4.setText(text4.getText().toString()+"Взято:  Игровая мышь8          ");
                    text4.invalidate();}
                if (msg.what==0){
                    text4.setText(text4.getText().toString()+"Идет на кассу...          ");
                    text4.invalidate();}

            }
        };


        Thread pokup1 = new Thread(new AnotherRunnable()); // Создание и вызов потоков
        pokup1.start();
        Thread pokup2 = new Thread(new AnotherRunnable1());
        pokup2.start();
        Thread pokup3 = new Thread(new AnotherRunnable2());
        pokup3.start();
        Thread pokup4 = new Thread(new AnotherRunnable3());
        pokup4.start();
        Thread pokup5 = new Thread(new AnotherRunnable4());
        pokup5.start();


 go.setOnClickListener(new View.OnClickListener() {

        @Override
         public void onClick(View view) {
           Intent buyer = new Intent(Admin.this,StartMenu.class);
         startActivity(buyer);
        }
        });
    }

    class AnotherRunnable implements Runnable {
        private int x = random.nextInt(10) + 1; // Cоздание х циклов в потоке
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;

                try {
                    Thread.sleep(p); //Приостанавливает поток на рандом секунд секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
              if (i<x-1&&x>1)  handler.sendEmptyMessage(k);  // отправка сообщения хендлеру
                else handler.sendEmptyMessage(0);
            }
        }
    }
    class AnotherRunnable1 implements Runnable {
        private int x = random.nextInt(10) + 1;
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;

                try {
                    Thread.sleep(p);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<x-1&&x>1) handler1.sendEmptyMessage(k);  // отправка сообщения хендлеру
                else handler1.sendEmptyMessage(0);
            }
        }
    }
    class AnotherRunnable2 implements Runnable {
        private int x = random.nextInt(10) + 1;
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;

                try {
                    Thread.sleep(p);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<x-1&&x>1) handler2.sendEmptyMessage(k);  // отправка сообщения хендлеру
                else handler2.sendEmptyMessage(0);
            }
        }
    }
    class AnotherRunnable3 implements Runnable {
        private int x = random.nextInt(10) + 1;
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;
                try {
                    Thread.sleep(p);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<x-1&&x>1)   handler3.sendEmptyMessage(k);  // отправка сообщения хендлеру
                else handler3.sendEmptyMessage(0);
            }
        }
    }
    class AnotherRunnable4 implements Runnable {
        private int x = random.nextInt(10) + 1;
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;
                try {
                    Thread.sleep(p);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<x-1&&x>1) handler4.sendEmptyMessage(k);  // отправка сообщения хендлеру
                else handler4.sendEmptyMessage(0);
            }
        }
    }
}
