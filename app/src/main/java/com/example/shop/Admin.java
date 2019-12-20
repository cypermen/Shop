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
        go = findViewById(R.id.button6);
        text = findViewById(R.id.textView50);
        text1 = findViewById(R.id.textView51);
        text2 = findViewById(R.id.textView52);
        text3 = findViewById(R.id.textView53);
        text4 = findViewById(R.id.textView54);
        handler = new Handler() {   // создание хэндлера и вывод сообщений от него на главный экран
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    text.setText(text.getText().toString() + "Взято: Монитор Acer Nitro VG271Pbmiipx              \n");
                    text.invalidate();
                }
                if (msg.what == 2) {
                    text.setText(text.getText().toString() + "Взято:  Монитор LG 25UM58                             \n");
                    text.invalidate();
                }
                if (msg.what == 3) {
                    text.setText(text.getText().toString() + "Взято:  Мышь Razer Basilisk Black USB                 \n");
                    text.invalidate();
                }
                if (msg.what == 4) {
                    text.setText(text.getText().toString() + "Взято:  Мышь A4Tech Bloody V7                        \n");
                    text.invalidate();
                }
                if (msg.what == 5) {
                    text.setText(text.getText().toString() + "Взято:  Компьютерная гарнитура Razer Kraken          \n");
                    text.invalidate();
                }
                if (msg.what == 6) {
                    text.setText(text.getText().toString() + "Взято:  Компьютерная гарнитура HyperX Cloud Stinger    \n");
                    text.invalidate();
                }
                if (msg.what == 7) {
                    text.setText(text.getText().toString() + "Взято:  Клавиатура Steelseries Apex 7 Red Switch      \n");
                    text.invalidate();
                }
                if (msg.what == 8) {
                    text.setText(text.getText().toString() + "Взято:  Клавиатура HyperX Alloy Elite                  \n");
                    text.invalidate();
                }
                if (msg.what == 0) {
                    text.setText(text.getText().toString() + "Встал в очередь перед кассой  \n");
                    text.invalidate();
                }
                if (msg.what == 99) {
                    text.setText(text.getText().toString() + "Оплатил, ушел \n");
                    text.invalidate();
                }
                if (msg.what == 100) {
                    text.setText(text.getText().toString() + "Собирается на кассу  \n");
                    text.invalidate();
                }
            }
        };
        handler1 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    text1.setText(text1.getText().toString() + "Взято: Монитор Acer Nitro VG271Pbmiipx \n");
                    text1.invalidate();
                }
                if (msg.what == 2) {
                    text1.setText(text1.getText().toString() + "Взято:  Монитор LG 25UM58             \n");
                    text1.invalidate();
                }
                if (msg.what == 3) {
                    text1.setText(text1.getText().toString() + "Взято:  Мышь Razer Basilisk Black USB \n");
                    text1.invalidate();
                }
                if (msg.what == 4) {
                    text1.setText(text1.getText().toString() + "Взято:  Мышь A4Tech Bloody V7         \n");
                    text1.invalidate();
                }
                if (msg.what == 5) {
                    text1.setText(text1.getText().toString() + "Взято:  Компьютерная гарнитура Razer Kraken \n");
                    text1.invalidate();
                }
                if (msg.what == 6) {
                    text1.setText(text1.getText().toString() + "Взято:  Компьютерная гарнитура HyperX Cloud Stinger \n");
                    text1.invalidate();
                }
                if (msg.what == 7) {
                    text1.setText(text1.getText().toString() + "Взято:  Клавиатура Steelseries Apex 7 Red Switch \n");
                    text1.invalidate();
                }
                if (msg.what == 8) {
                    text1.setText(text1.getText().toString() + "Взято:  Клавиатура HyperX Alloy Elite          \n");
                    text1.invalidate();
                }
                if (msg.what == 0) {
                    text1.setText(text1.getText().toString() + "Встал в очередь перед кассой\n");
                    text1.invalidate();
                }
                if (msg.what == 99) {
                    text1.setText(text1.getText().toString() + "Оплатил, ушел\n");
                    text1.invalidate();
                }
                if (msg.what == 100) {
                    text1.setText(text1.getText().toString() + "Собирается на кассу  \n");
                    text1.invalidate();
                }


            }
        };
        handler2 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    text2.setText(text2.getText().toString() + "Взято: Монитор Acer Nitro VG271Pbmiipx \n");
                    text2.invalidate();
                }
                if (msg.what == 2) {
                    text2.setText(text2.getText().toString() + "Взято:  Монитор LG 25UM58             \n");
                    text2.invalidate();
                }
                if (msg.what == 3) {
                    text2.setText(text2.getText().toString() + "Взято:  Мышь Razer Basilisk Black USB \n");
                    text2.invalidate();
                }
                if (msg.what == 4) {
                    text2.setText(text2.getText().toString() + "Взято:  Мышь A4Tech Bloody V7         \n");
                    text2.invalidate();
                }
                if (msg.what == 5) {
                    text2.setText(text2.getText().toString() + "Взято:  Компьютерная гарнитура Razer Kraken \n");
                    text2.invalidate();
                }
                if (msg.what == 6) {
                    text2.setText(text2.getText().toString() + "Взято:  Компьютерная гарнитура HyperX Cloud Stinger \n");
                    text2.invalidate();
                }
                if (msg.what == 7) {
                    text2.setText(text2.getText().toString() + "Взято:  Клавиатура Steelseries Apex 7 Red Switch \n");
                    text2.invalidate();
                }
                if (msg.what == 8) {
                    text2.setText(text2.getText().toString() + "Взято:  Клавиатура HyperX Alloy Elite          \n");
                    text2.invalidate();
                }
                if (msg.what == 0) {
                    text2.setText(text2.getText().toString() + "Встал в очередь перед кассой  \n");
                    text2.invalidate();
                }
                if (msg.what == 99) {
                    text2.setText(text2.getText().toString() + "Оплатил, ушел \n   ");
                    text2.invalidate();
                }
                if (msg.what == 100) {
                    text2.setText(text2.getText().toString() + "Собирается на кассу  \n");
                    text2.invalidate();
                }
            }
        };
        handler3 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    text3.setText(text3.getText().toString() + "Взято: Монитор Acer Nitro VG271Pbmiipx \n");
                    text3.invalidate();
                }
                if (msg.what == 2) {
                    text3.setText(text3.getText().toString() + "Взято:  Монитор LG 25UM58             \n");
                    text3.invalidate();
                }
                if (msg.what == 3) {
                    text3.setText(text3.getText().toString() + "Взято:  Мышь Razer Basilisk Black USB \n");
                    text3.invalidate();
                }
                if (msg.what == 4) {
                    text3.setText(text3.getText().toString() + "Взято:  Мышь A4Tech Bloody V7         \n");
                    text3.invalidate();
                }
                if (msg.what == 5) {
                    text3.setText(text3.getText().toString() + "Взято:  Компьютерная гарнитура Razer Kraken \n");
                    text3.invalidate();
                }
                if (msg.what == 6) {
                    text3.setText(text3.getText().toString() + "Взято:  Компьютерная гарнитура HyperX Cloud Stinger \n");
                    text3.invalidate();
                }
                if (msg.what == 7) {
                    text3.setText(text3.getText().toString() + "Взято:  Клавиатура Steelseries Apex 7 Red Switch \n");
                    text3.invalidate();
                }
                if (msg.what == 8) {
                    text3.setText(text3.getText().toString() + "Взято:  Клавиатура HyperX Alloy Elite          \n");
                    text3.invalidate();
                }
                if (msg.what == 0) {
                    text3.setText(text3.getText().toString() + "Встал в очередь перед кассой   \n");
                    text3.invalidate();
                }
                if (msg.what == 99) {
                    text3.setText(text3.getText().toString() + "Оплатил, ушел \n  ");
                    text3.invalidate();
                }
                if (msg.what == 100) {
                    text3.setText(text3.getText().toString() + "Собирается на кассу  \n");
                    text3.invalidate();
                }

            }
        };
        handler4 = new Handler() {   // создание хэндлера
            @Override
            public void handleMessage(android.os.Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    text4.setText(text4.getText().toString() + "Взято: Монитор Acer Nitro VG271Pbmiipx \n");
                    text4.invalidate();
                }
                if (msg.what == 2) {
                    text4.setText(text4.getText().toString() + "Взято:  Монитор LG 25UM58             \n");
                    text4.invalidate();
                }
                if (msg.what == 3) {
                    text4.setText(text4.getText().toString() + "Взято:  Мышь Razer Basilisk Black USB \n");
                    text4.invalidate();
                }
                if (msg.what == 4) {
                    text4.setText(text4.getText().toString() + "Взято:  Мышь A4Tech Bloody V7         \n");
                    text4.invalidate();
                }
                if (msg.what == 5) {
                    text4.setText(text4.getText().toString() + "Взято:  Компьютерная гарнитура Razer Kraken \n");
                    text4.invalidate();
                }
                if (msg.what == 6) {
                    text4.setText(text4.getText().toString() + "Взято:  Компьютерная гарнитура HyperX Cloud Stinger \n");
                    text4.invalidate();
                }
                if (msg.what == 7) {
                    text4.setText(text4.getText().toString() + "Взято:  Клавиатура Steelseries Apex 7 Red Switch \n");
                    text4.invalidate();
                }
                if (msg.what == 8) {
                    text4.setText(text4.getText().toString() + "Взято:  Клавиатура HyperX Alloy Elite          \n");
                    text4.invalidate();
                }
                if (msg.what == 0) {
                    text4.setText(text4.getText().toString() + "Встал в очередь перед кассой        \n");
                    text4.invalidate();
                }
                if (msg.what == 99) {
                    text4.setText(text4.getText().toString() + "Оплатил, ушел     \n \n ");
                    text4.invalidate();
                }
                if (msg.what == 100) {
                    text4.setText(text4.getText().toString() + "Собирается на кассу\n");
                    text4.invalidate();
                }

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
                Intent buyer = new Intent(Admin.this, StartMenu.class);
                startActivity(buyer);
            }
        });
    }


    class AnotherRunnable implements Runnable {
        private int x = random.nextInt(10) + 3; // Cоздание х циклов в потоке


        @Override
        public void run() {
            for (int i = 0; i < x+1; i++) {
                int k = random.nextInt(8) + 1;
                int min = 2000;
                int max = 8000;
                int diff = max - min;
                int p = random.nextInt(diff + 1);
                p += min;

                try {
                    Thread.sleep(p); //Приостанавливает поток на рандом секунд
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i < x - 2 && x > 1)
                {handler.sendEmptyMessage(k);  // отправка сообщения хендлеру
                    if (i==x-3) handler.sendEmptyMessage(100);}
                if (i==x-2)handler.sendEmptyMessage(0);
                synchronized (this) {
                    if (i==x-1) handler.sendEmptyMessage(99);
                }
            }
        }
    }

    class AnotherRunnable1 implements Runnable {
        private int x = random.nextInt(10) + 3;

        @Override
        public void run() {
            for (int i = 0; i < x+1; i++) {
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
                if (i < x - 2 && x > 1)
                {handler1.sendEmptyMessage(k);  // отправка сообщения хендлеру

                    if (i==x-3) handler1.sendEmptyMessage(100);}
                if (i==x-2)handler1.sendEmptyMessage(0);
                synchronized (this) {
                    if (i==x-1) handler1.sendEmptyMessage(99);
                }
            }
        }
    }

    class AnotherRunnable2 implements Runnable {
        private int x = random.nextInt(10) + 3;

        @Override
        public void run() {
            for (int i = 0; i < x+1; i++) {
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
                if (i < x - 2 && x > 1)
                {handler2.sendEmptyMessage(k);  // отправка сообщения хендлеру
                    if (i==x-3) handler2.sendEmptyMessage(100);}
                if (i==x-2)handler2.sendEmptyMessage(0);
                synchronized (this) {
                    if (i==x-1) handler2.sendEmptyMessage(99);
                }
            }
        }
    }

    class AnotherRunnable3 implements Runnable {
        private int x = random.nextInt(10) + 3;

        @Override
        public void run() {
            for (int i = 0; i < x+1; i++) {
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
                if (i < x - 2 && x > 1)
                {handler3.sendEmptyMessage(k);  // отправка сообщения хендлеру
                    if (i==x-3) handler3.sendEmptyMessage(100);}
                if (i==x-2)handler3.sendEmptyMessage(0);
                synchronized (this) {
                    if (i==x-1) handler3.sendEmptyMessage(99);
                }
            }
        }
    }

    class AnotherRunnable4 implements Runnable {
        private int x = random.nextInt(10) + 3;

        @Override
        public void run() {
            for (int i = 0; i < x+1; i++) {
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

                if (i < x - 2 && x > 1){
                handler4.sendEmptyMessage(k);   // отправка сообщения хендлеру

                 if (i==x-3) handler4.sendEmptyMessage(100);}
                if (i==x-2)handler4.sendEmptyMessage(0);
                    synchronized (this) {
                        if (i==x-1) handler4.sendEmptyMessage(99);

                    }

            }
        }
    }
}
