package com.sefakabatas.catbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.sefakabatas.catbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //binding
    private ActivityMainBinding binding;
    //Cat Array
    ArrayList<Cat> catArrayList;
    //Cat Adaptor
    CatAdaptor catAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding inflate
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        //binding add view
        View view = binding.getRoot();
        setContentView(view);

        //Initialization
        catArrayList = new ArrayList<>();
        //layoutmanager
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Initialization
        catAdaptor = new CatAdaptor(catArrayList);
        binding.recyclerView.setAdapter(catAdaptor);




        //call metod
        getData();




    }
    private void getData(){
        try {
            SQLiteDatabase database = this.openOrCreateDatabase("Cats",MODE_PRIVATE,null);
            Cursor cursor = database.rawQuery("SELECT * FROM cats", null);
            int nameIndex = cursor.getColumnIndex("catname");
            int idIndex = cursor.getColumnIndex("id");
            //while start
            while(cursor.moveToNext()){
                String name = cursor.getString(nameIndex);
                int id = cursor.getInt(idIndex);
                Cat cat = new Cat(name, id);
                catArrayList.add(cat);

            }//while finish
            //update
            catAdaptor.notifyDataSetChanged();
            //cursor close
            cursor.close();
         //try finish
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    //Menu Create Main
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();

        //create
        menuInflater.inflate(R.menu.art_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //OnClick Menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.add_art){
            //path
            Intent intent = new Intent(this, ArtActivity.class);
            intent.putExtra("info","new");

            //start
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
}