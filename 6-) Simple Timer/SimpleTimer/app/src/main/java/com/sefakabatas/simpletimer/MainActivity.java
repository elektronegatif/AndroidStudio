package com.sefakabatas.simpletimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView; // create textview
    Runnable runnable; // create runnable
    Handler handler; // create handler
    int number=0; // variable
    Button button; // variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2); //assignment
        button = findViewById(R.id.button4); //start button
    }

    public void start(View view){
        handler = new Handler(); //object
        runnable = new Runnable() { //runnable metod
            @Override
            public void run() {
                textView.setText("Time: " + number); // write to number
                number++; //number = number + 1
                textView.setText("Time: " + number); //modified value write
                handler.postDelayed(runnable, 1000); // 1 sec

            }
        };
        handler.post(runnable); //Post
        button.setEnabled(false); //start button enable false

    }


    public void stop(View view){
        button.setEnabled(true); //start button enable
        number = 0;
        handler.removeCallbacks(runnable); //remove runnable
        textView.setText("Time: " + number); //write to number
    }
}