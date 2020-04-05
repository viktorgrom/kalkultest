package com.example.kalkultest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        int number3 = intent.getIntExtra (MainActivity.EXTRA_NUMBER2,0);
        TextView TextSumAct2 = (TextView)findViewById(R.id.TextA3);
        TextSumAct2.setText(""+ number3);
        
    }
}
