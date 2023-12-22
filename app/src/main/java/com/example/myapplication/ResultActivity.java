package com.example.myapplication;// ResultActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textResult = findViewById(R.id.textResult);

        // Retrieve data from the intent and display it in the TextView
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("message");
            textResult.setText(message);
        }
    }
}
