package com.example.mat_test2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.IndianCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button btnQ1, btnQ2, btnGiveTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQ1= findViewById(R.id.btnQ1);
        //btnGiveTest= findViewById(R.id.btnGiveTest);
        btnQ2= findViewById(R.id.btnQ2);

        btnQ1.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Q1.class));
        });

        /*btnGiveTest.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Q1Givetest.class));
        });*/

        btnQ2.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Q2.class));
        });
    }
}