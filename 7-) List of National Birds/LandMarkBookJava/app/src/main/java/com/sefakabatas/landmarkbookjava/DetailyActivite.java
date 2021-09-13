package com.sefakabatas.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sefakabatas.landmarkbookjava.databinding.ActivityDetailyActiviteBinding;

public class DetailyActivite extends AppCompatActivity {
    //View Binding
    private ActivityDetailyActiviteBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityDetail Initialization
        binding = ActivityDetailyActiviteBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        Intent intent = getIntent();
        setContentView(view);
        //Casting
       // LandMark selectedBirdMark = (LandMark) intent.getSerializableExtra("birdmark");
        Singleton singleton = Singleton.getInstance();
        LandMark selectedBirdMark = singleton.getSentBirdMark();
        binding.nameText.setText(selectedBirdMark.name);
        binding.countryText.setText(selectedBirdMark.country);
        binding.imageView.setImageResource(selectedBirdMark.image);
        binding.detailText.setText(selectedBirdMark.detail);





    }
}