package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activityCalculator extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent= getIntent();
        String num = intent.getStringExtra("numberOne");
        textView.setText(num);


    }
}