package com.example.kalkultest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_NUMBER2 = "com.example.kalkultest.example.EXTRA_NUMBER2";




    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int number = intent.getIntExtra (MainActivity.EXTRA_NUMBER,0);
        TextView TextSum = (TextView)findViewById(R.id.sumText);
        TextSum.setText(""+ number);

        Button buttonA2 = (Button)findViewById(R.id.buttonActivity2);
        buttonA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void openActivity3(){
        TextView numberAct2 = (TextView) findViewById(R.id.sumText);
        int numAct2 = Integer.parseInt(numberAct2.getText().toString());
        numberAct2.setText(Integer.toString(numAct2));

        Intent i2 = new Intent(this, Main3Activity.class);
        i2.putExtra(EXTRA_NUMBER2, numAct2);
        startActivity(i2);
    }
}
