package com.example.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        // Thread pokup1 = new Thread(new AnotherRunnable());
        // pokup1.start();
// на случай включения потоков в это активити
        //back.setOnClickListener(new View.OnClickListener() {
        // @Override

        //  public void onClick(View v) { // доделка.
        //    Intent buyer = new Intent(Admin.this,Admbuy.class);
        //  startActivity(buyer);
        //}
        //});
    }

   /* class AnotherRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000); //Приостанавливает поток на 1 секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }*/
}
