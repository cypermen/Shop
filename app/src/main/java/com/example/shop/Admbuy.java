package com.example.shop;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class Admbuy extends AppCompatActivity {
    ScrollView scr;
    final Random random = new Random();
    private int x = random.nextInt(10) + 1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admbuy);
        Thread pokup1 = new Thread(new AnotherRunnable());
        pokup1.start();

    }

    class AnotherRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < x; i++) {
                int k = random.nextInt(8) + 1;
                if (k == 1) {
                    TextView tv = new TextView(getApplicationContext());
                    tv.setText("Gaming mouse");
                    scr.addView(tv);
                }
            }
            try {
                Thread.sleep(4000); //Приостанавливает поток на 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
