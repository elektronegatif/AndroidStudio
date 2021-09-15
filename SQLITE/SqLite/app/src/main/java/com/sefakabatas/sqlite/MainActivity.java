package com.sefakabatas.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //try
        try {

            //database
            SQLiteDatabase database = this.openOrCreateDatabase("Language",MODE_PRIVATE,null);

            //table
            database.execSQL("CREATE TABLE IF NOT EXISTS code(id INTEGER PRIMARY KEY, name VARCHAR, level INTEGER)");

            //Add
            database.execSQL("INSERT INTO code(name, level) VALUES ('Java', 9)");
            database.execSQL("INSERT INTO code(name, level) VALUES ('C#', 8)");

            //UPDATE

            database.execSQL("UPDATE code SET level = 10 WHERE name='Java'");
            database.execSQL("UPDATE code SET name = 'C' WHERE id= 2");

            //DELETE

            database.execSQL("DELETE FROM code WHERE id = 2");


            //Cursor
            Cursor cursor = database.rawQuery("SELECT * FROM code",null);

            //first letter J
            //Cursor cursor = database.rawQuery("SELECT * FROM code WHERE name LIKE 'J%' ",null);

            //end letter #
            //Cursor cursor = database.rawQuery("SELECT * FROM code WHERE name LIKE '%#' ",null);

            //Filter Where

            // Cursor cursor = database.rawQuery("SELECT * FROM code WHERE id=2",null);
            // Cursor cursor = database.rawQuery("SELECT * FROM code WHERE level > 5",null);
            // Cursor cursor = database.rawQuery("SELECT * FROM code WHERE name = 'Java'",null);

            //intIndex
            int nameIndex = cursor.getColumnIndex("name");

            //LevelIndex
            int levelIndex = cursor.getColumnIndex("level");

            //ID index
            int idIndex = cursor.getColumnIndex("id");

            //LOOP cursor move to next
            while(cursor.moveToNext()){
                //write
                System.out.println("Id: "  + cursor.getInt(idIndex) +
                        " Name: " + cursor.getString(nameIndex) + " Level: " + cursor.getInt(levelIndex));
            }

            //close
            cursor.close();

        }//try end

        //catch
        catch (Exception ex){
            System.out.println("Error: " + ex);
        }

    }
}