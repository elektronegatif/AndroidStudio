package com.sefakabatas.calculator_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text= findViewById(R.id.number1Text);
        number2Text= findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

    }
    public void sum(View view){

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number");
        }else {
            float number1 = Float.parseFloat(number1Text.getText().toString());
            float number2 = Float.parseFloat(number2Text.getText().toString());
            float result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }
    public void dedact(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number");
        }else {
            float number1 = Float.parseFloat(number1Text.getText().toString());
            float number2 = Float.parseFloat(number2Text.getText().toString());
            float result = number1 - number2;
            resultText.setText("Result: " + result);
        }

    }
    public void multiply(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number");
        }else {
            float number1 = Float.parseFloat(number1Text.getText().toString());
            float number2 = Float.parseFloat(number2Text.getText().toString());
            float result = number1 * number2;
            resultText.setText("Result: " + result);
        }

    }
    public void divide(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number");
        }else {
            float number1 = Float.parseFloat(number1Text.getText().toString());
            float number2 = Float.parseFloat(number2Text.getText().toString());
            float result = number1 / number2;
            resultText.setText("Result: " + result);
        }

    }

}