package com.example.initalizing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Discription_Display extends AppCompatActivity {

    ImageView imageView;
    GifImageView gif;
    TextView name,dis,orign,stage,voice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discription__display);


        // imageView = findViewById(R.id.Charimg);
        name = findViewById(R.id.CharName);
        dis = findViewById(R.id.dics);
        orign = findViewById(R.id.Orign);
        stage = findViewById(R.id.CharStage);
        voice = findViewById(R.id.CharVoice);
        gif = findViewById(R.id.gif);


        Intent intent = getIntent();
        //imageView.setImageResource(intent.getExtras().getInt("Image"));
        gif.setBackgroundResource(intent.getExtras().getInt("Gif"));
        name.setText("Name: " + intent.getExtras().getString("Name"));
        stage.setText("Stage: "+intent.getExtras().getString("Stage"));
        voice.setText("Voice of: "+intent.getExtras().getString("Voice"));
        dis.setText(intent.getExtras().getString("Dis"));



    }


}