package com.example.logbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button next, previous;
    private String[] imageList;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        imageList = getResources().getStringArray(R.array.images);
        loadImage();
    }
    private void loadImage(){
        Glide.with(MainActivity.this)
                .load(imageList[index])
                .centerCrop()
                .into(imageView);
    }
    public void nextImage(View view){
    index++;
    if(index >= imageList.length)
        index = 0 ;
        loadImage();

    }
    public void preImage(View view){
        index--;
        if(index <= -1)
            index = imageList.length -1 ;
        loadImage();

    }
    }

