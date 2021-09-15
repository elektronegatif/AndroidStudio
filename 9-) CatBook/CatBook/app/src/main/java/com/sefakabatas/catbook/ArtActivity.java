package com.sefakabatas.catbook;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telecom.Call;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.sefakabatas.catbook.databinding.ActivityArtBinding;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ArtActivity extends AppCompatActivity {
    //binding
    private ActivityArtBinding binding;

    //ActivityResultLauncher
    ActivityResultLauncher<Intent> activityResultLauncher;
    ActivityResultLauncher<String> permissionLauncher;

    //Bitmat
    Bitmap selectedImage;

    //Sqlite

    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflate binding
        binding = ActivityArtBinding.inflate(getLayoutInflater());
        //binding view
        View view = binding.getRoot();
        setContentView(view);
        //database
        database = this.openOrCreateDatabase("Cats", MODE_PRIVATE,null);

        //call registerLauncher
        registerLauncher();

        Intent intent = getIntent();
        String info = intent.getStringExtra("info");
        if(info.equals("new")){
            //new cat
            binding.nameText.setText("");
            binding.familyText.setText("");
            binding.yearText.setText("");
            binding.button.setVisibility(View.VISIBLE);
            binding.imageView.setImageResource(R.drawable.selectimage);

        }
        else{
            int catId = intent.getIntExtra("catId",0);
            binding.button.setVisibility(View.INVISIBLE);

            try {
                // ? = catId
                Cursor cursor = database.rawQuery("SELECT * FROM cats WHERE id = ?",new String[]{String.valueOf(catId)});
                int catNameIndex = cursor.getColumnIndex("catname");
                int familyIndex = cursor.getColumnIndex("catfamilyName");
                int year = cursor.getColumnIndex("year");
                int imageIndex = cursor.getColumnIndex("image");

                while(cursor.moveToNext()){
                    binding.nameText.setText(cursor.getString(catNameIndex));
                    binding.familyText.setText(cursor.getString(familyIndex));
                    binding.yearText.setText(cursor.getString(year));

                    byte[] bytes = cursor.getBlob(imageIndex);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                    binding.imageView.setImageBitmap(bitmap);
                }
                cursor.close();



            }catch (Exception ex){
                ex.printStackTrace();
            }
        }


    }

    //Save button
    public void save(View view) {
       //data call
        String name = binding.nameText.getText().toString();
        String familyName = binding.familyText.getText().toString();
        String year = binding.yearText.getText().toString();

        Bitmap smallImage = makeSmalledImage(selectedImage, 300);

        //Convert
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        smallImage.compress(Bitmap.CompressFormat.PNG,50,outputStream);
        byte[] byteArray = outputStream.toByteArray();

        //Sqlite
        try {

            //table
            database.execSQL("CREATE TABLE IF NOT EXISTS cats (id INTEGER PRIMARY KEY, catname VARCHAR, catfamilyName VARCHAR, year VARCHAR, image BLOB)");

            String sqlString = "INSERT INTO cats (catname, catfamilyName, year, image) VALUES(?, ?, ?, ?)";

            //add
            SQLiteStatement sqLiteStatement = database.compileStatement(sqlString);
            sqLiteStatement.bindString(1,name);
            sqLiteStatement.bindString(2,familyName);
            sqLiteStatement.bindString(3,year);
            sqLiteStatement.bindBlob(4,byteArray);
            sqLiteStatement.execute();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        //return Main Activity
        Intent intent = new Intent(ArtActivity.this, MainActivity.class);
        //all close activity
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
    public Bitmap makeSmalledImage(Bitmap image, int maxSize){
        //image width
        int width = image.getWidth();
        //image height
        int height = image.getHeight();

        float bitMapRatio =(float) width / height;

        if(bitMapRatio > 1){
            //landscape image
            width = maxSize;
            height = (int) (width / bitMapRatio);
        }
        else{
            //portrait image
            height = maxSize;
            width = (int) (height * bitMapRatio);
        }

        return image.createScaledBitmap(image,width,height,true);
    }

    //Select Image
    public void selectImage(View view) {

        //Permission
        //and 18 >
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            //2021 >
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                Snackbar.make(view, "Permission needed for gallery", Snackbar.LENGTH_INDEFINITE).setAction("Give Permission", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //request permission
                        permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);

                    }
                }).show();
            } else {
                //request permission
                permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);

            }

        } else {
            //gallery
            Intent intentToGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            activityResultLauncher.launch(intentToGallery);
        }

    }

    private void registerLauncher() {

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == RESULT_OK){
                    Intent intentFromResult = result.getData();
                    if (intentFromResult != null){
                        Uri imageData = intentFromResult.getData();
                        //binding.imageView.setImageURI(imageData);
                        try {
                            if (Build.VERSION.SDK_INT >= 28) {
                                ImageDecoder.Source source = ImageDecoder.createSource(ArtActivity.this.getContentResolver(), imageData);
                                selectedImage = ImageDecoder.decodeBitmap(source);
                                binding.imageView.setImageBitmap(selectedImage);
                            }
                            else{
                                selectedImage = MediaStore.Images.Media.getBitmap(ArtActivity.this.getContentResolver(), imageData);
                                binding.imageView.setImageBitmap(selectedImage);

                            }

                        }catch (Exception ex){
                            ex.printStackTrace();
                        }

                    }
                }
            }
        });
        permissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {

            @Override
            public void onActivityResult(Boolean result) {
                if (result) {
                    //permission granted
                    Intent intentToGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    activityResultLauncher.launch(intentToGallery);

                } else {
                    //permission denied
                    Toast.makeText(ArtActivity.this, "Permission needed", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}