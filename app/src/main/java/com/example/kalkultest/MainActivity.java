package com.example.kalkultest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.example.kalkultest.example.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2 = "com.example.kalkultest.example.EXTRA_NUMBE2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.sumButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

        }
    });
    }

    public void openActivity2() {
        EditText element1 = (EditText) findViewById(R.id.el1);
        EditText element2 = (EditText) findViewById(R.id.el2);
        TextView summaText = (TextView) findViewById(R.id.sumText);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int summa = num1 + num2;
        summaText.setText(Integer.toString(summa));

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra(EXTRA_NUMBER, summa);
        startActivity(i);
    }

}
