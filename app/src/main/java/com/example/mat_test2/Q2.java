package com.example.mat_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2 extends AppCompatActivity {

    EditText stdId, stdName, stdBranch, stdPhNo;
    DatePicker stdDOB;
    Button btnSubmitQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        stdId = findViewById(R.id.stdId);
        stdName = findViewById(R.id.stdName);
        stdPhNo = findViewById(R.id.stdPhNo);
        stdBranch = findViewById(R.id.stdBranch);
        stdDOB = findViewById(R.id.stdDOB);
        btnSubmitQ2 = findViewById(R.id.btnSubmitQ2);

        btnSubmitQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = stdDOB.getDayOfMonth();
                int month = stdDOB.getMonth() + 1;
                int year = stdDOB.getYear();
                Date d = new Date(year, month, day);
                Log.d("dob", d.toString());

                Intent intent = new Intent(getBaseContext(), Q2_2.class);
                intent.putExtra("stdId", String.valueOf(stdId.getText()));
                intent.putExtra("stdName", stdName.getText().toString());
                intent.putExtra("stdBranch", stdBranch.getText().toString());
                intent.putExtra("stdPhNo", String.valueOf(stdPhNo.getText()));
                intent.putExtra("stdDOB", d.toString());
                startActivity(intent);
            }
        });
    }
}