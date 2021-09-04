package com.sefakabatas.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dalert(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this); //create builder

        alert.setTitle("Ok"); // alert title
        alert.setMessage("Are you Ok? ");
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() { //yes = position
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show(); // don't forget show
            }
        });
        alert.setNegativeButton("no", new DialogInterface.OnClickListener() { //no = negative
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Not Save", Toast.LENGTH_SHORT).show(); // don't forget show

            }
        });

        alert.show(); //don't forget show
    }

}