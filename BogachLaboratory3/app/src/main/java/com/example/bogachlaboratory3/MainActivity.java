package com.example.bogachlaboratory3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView TextViewCounter;
    Button ButtonCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextViewCounter = findViewById(R.id.textView2);
        ButtonCounter = findViewById(R.id.button);
        TextViewCounter.setText("0");
        ButtonCounter.setOnClickListener(OnButtonCounterClick);
    }


    View.OnClickListener OnButtonCounterClick = new View.OnClickListener(){
        int counter = 0;
        @Override
        public void onClick(View v)
        {
            TextViewCounter.setText(String.valueOf(++counter));
        }
    };
}