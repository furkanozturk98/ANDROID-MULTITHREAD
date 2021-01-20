package com.example.multithreading;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout left;
    LinearLayout right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        left = findViewById(R.id.left);
        right = findViewById(R.id.right);


        LeftLight leftLight = new LeftLight();
        RightLight rightLight = new RightLight();

        leftLight.start();
        rightLight.start();


    }

    class LeftLight extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                left.setBackgroundColor(Color.parseColor("#3370EE"));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                left.setBackgroundColor(Color.BLACK);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                left.setBackgroundColor(Color.parseColor("#3370EE"));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                left.setBackgroundColor(Color.BLACK);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class RightLight extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                right.setBackgroundColor(Color.BLACK);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                right.setBackgroundColor(Color.RED);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                right.setBackgroundColor(Color.BLACK);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                right.setBackgroundColor(Color.RED);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}