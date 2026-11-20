package com.example.bogachlaboratory12;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.MainImageView);
        Button buttonRotateCenter = findViewById(R.id.MainButtonRotateCenter);
        Button buttonRotateCorner = findViewById(R.id.MainButtonRotateCorner);
        final Animation animationRotateCenter = AnimationUtils.loadAnimation(this, R.anim.rotate_center);
        final Animation animationRotateCorner = AnimationUtils.loadAnimation(this, R.anim.rotate_corner);
        buttonRotateCenter.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){imageView.startAnimation(animationRotateCenter);}
        });
        buttonRotateCorner.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){imageView.startAnimation(animationRotateCorner);}
        });
    }
}