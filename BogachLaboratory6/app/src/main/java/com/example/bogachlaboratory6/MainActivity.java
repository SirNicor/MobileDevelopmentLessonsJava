    package com.example.bogachlaboratory6;

    import androidx.appcompat.app.AppCompatActivity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    public class MainActivity extends AppCompatActivity {
        EditText firstNameText;
        EditText secondNameText;
        EditText groupText;
        EditText ageText;
        Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            firstNameText = findViewById(R.id.mainEditTextFirstName);
            secondNameText = findViewById(R.id.mainEditTextLastName);
            groupText = findViewById(R.id.mainEditTextStudyGroup);
            ageText = findViewById(R.id.mainEditTextAge);
            button = findViewById(R.id.mainButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String firstName = firstNameText.getText().toString();
                    String secondName = secondNameText.getText().toString();
                    String group = groupText.getText().toString();
                    int age = Integer.parseInt(ageText.getText().toString());
                    Student student1 = new Student(firstName, secondName, age, group);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(Student.class.getSimpleName(), student1);
                    startActivity(intent);
                }
            });
        }
    }