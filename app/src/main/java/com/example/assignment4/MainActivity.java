package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button btnCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.tv0);
        btnCount = findViewById(R.id.btnCount);

    }

    public void countUp(View view) {
    mCount++;
    if(mShowCount != null){
        mShowCount.setText(Integer.toString(mCount));
    }
    }
}