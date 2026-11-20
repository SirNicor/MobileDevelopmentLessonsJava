package com.example.bogachlaboratory11;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.MainGifView);
        imageView.setBackgroundResource(R.drawable.animation);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
        Button start = findViewById(R.id.MainPlayButton);
        Button stop = findViewById(R.id.MainStopButton);
        start.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){animationDrawable.start();}
        });
        stop.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){animationDrawable.stop();}
        });
    }
}