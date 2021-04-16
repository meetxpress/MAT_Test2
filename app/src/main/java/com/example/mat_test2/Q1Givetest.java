package com.example.mat_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Q1Givetest extends AppCompatActivity {
    EditText subAnd;
    Button btnSubmitTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_givetest);

        subAnd = findViewById(R.id.subAns);
        btnSubmitTest = findViewById(R.id.btnSubmitTest);

        btnSubmitTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar currentTime = Calendar.getInstance();
                int mm = currentTime.get(Calendar.MINUTE);
                int min = getIntent().getIntExtra("submin", R.id.substart);
                if (mm == min) {
                    subAnd.setEnabled(false);
                    btnSubmitTest.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Time is Up", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(getApplicationContext(), Q1.class));
                    Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}