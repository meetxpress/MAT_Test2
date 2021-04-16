package com.example.mat_test2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Date;

public class Q1 extends AppCompatActivity {

    TextView tvQ1;
    EditText subtitle, subname;
    DatePicker subdate;
    TimePicker subtime;
    Button btncreatetest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        subtitle = findViewById(R.id.subtitle);
        subname = findViewById(R.id.subname);
        subdate = findViewById(R.id.subdate);
        subtime = findViewById(R.id.substart);
        btncreatetest = findViewById(R.id.btncreattest);
        tvQ1 = findViewById(R.id.tvQ1);

        btncreatetest.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                int hr = subtime.getHour();
                int min = subtime.getMinute();

                tvQ1.setText("Test Title: " + subtitle.getText().toString() + "\n Test Name:" + subname.getText().toString());
                Toast.makeText(getApplicationContext(), "Your test will start now.", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getBaseContext(), Q1Givetest.class);
                        intent.putExtra("subhr", hr);
                        intent.putExtra("submin", min);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
    }
}