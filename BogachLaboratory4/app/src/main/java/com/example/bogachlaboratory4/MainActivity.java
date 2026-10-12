package com.example.bogachlaboratory4;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Resources resources = getResources();
        String message = resources.getString(R.string.message);
        int backColor = resources.getColor(R.color.textViewBackColor);
        int fontColor = resources.getColor(R.color.textViewFontColor);

        TextView testView = findViewById(R.id.textView2);
        testView.setText(message);
        testView.setTextSize(32);
        testView.setBackgroundColor(backColor);
        testView.setTextColor(fontColor);


        TextView textView = new TextView(this);
        textView.setText("Test create text");
        textView.setBackgroundColor(backColor);
        textView.setTextColor(fontColor);
        textView.setId(View.generateViewId());

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topMargin = 200;
        layoutParams.leftMargin = 100;
        textView.setLayoutParams(layoutParams);
        ConstraintLayout rootLayout = findViewById(R.id.Main);
        rootLayout.addView(textView);
    }
}