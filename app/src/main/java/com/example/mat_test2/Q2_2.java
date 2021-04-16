package com.example.mat_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Q2_2 extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);

        tv1.setText("Student ID: " + getIntent().getStringExtra("stdId"));
        tv2.setText("Student Name: " + getIntent().getStringExtra("stdName"));
        tv3.setText("Student Branch: " + getIntent().getStringExtra("stdBranch"));
        tv4.setText("Student Phone No: " + getIntent().getStringExtra("stdPhNo"));
        tv5.setText("Student DOB: " + getIntent().getStringExtra("stdDOB"));
    }
}