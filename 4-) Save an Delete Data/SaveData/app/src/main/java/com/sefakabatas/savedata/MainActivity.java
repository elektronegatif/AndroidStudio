package com.sefakabatas.savedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number; //description
    TextView textView;//description
    EditText textView2;//description
    SharedPreferences sharedPreferences; //Data Save description
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = findViewById(R.id.editTextNumber); //assignment
        textView = findViewById(R.id.textView);//assignment
        textView2 = findViewById(R.id.editTextTextPersonName2);//assignment

        sharedPreferences = this.getSharedPreferences("com.sefakabatas.savedata", Context.MODE_PRIVATE); //Data save assignment

        int savedNumber=sharedPreferences.getInt("savedNumber", 0); //key + default value (String, Number, Boolean...)
        String savedName = sharedPreferences.getString("savedName","");
        if(savedNumber == 0 || savedName == ""){
            textView.setText("Your Data = ");

        }
        else{
            textView.setText("Saved Data = " + savedNumber + " " + savedName);
        }


    }
    public void submit(View view){

        if(number.getText().toString().matches("") || textView2.getText().toString().matches("")){ //number null
            textView.setText("PLEASE ENTER NUMBER OR ENTER NAME"); //textView = Please enter number.
        }
        else{ //not number null
            int result = Integer.parseInt(number.getText().toString()); //result = Number
            String name = textView2.getText().toString();
            textView.setText("Your Data = " + result + " " + name);//textView to write = Number
            sharedPreferences.edit().putInt("savedNumber",result).apply(); //key + number. Don't forget "apply"
                                    //putString, putBoolean.....
            sharedPreferences.edit().putString("savedName",name).apply();
        }
    }
    public void delete(View view){
        int savedNumber=sharedPreferences.getInt("savedNumber", 0); //key + default value (String, Number, Boolean...)
        String savedName = sharedPreferences.getString("savedName","");
        if(savedNumber != 0 || !(savedName.matches(""))){ //number != null
            sharedPreferences.edit().remove("savedNumber").apply(); //key + number. Don't forget "apply"
            //putString, putBoolean.....
            sharedPreferences.edit().remove("savedName").apply();
            textView.setText("Your Data Delete ");
        }
    }
}