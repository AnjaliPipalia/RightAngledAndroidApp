package com.example.arp226.rightangledandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateHypotenuos(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.etSide1);
        EditText e2 = (EditText)findViewById(R.id.etSide2);
        TextView t1 = (TextView)findViewById(R.id.tvResult);
        double side1 = Double.parseDouble(e1.getText().toString());
        double side2 = Double.parseDouble(e2.getText().toString());
        double sum = Math.sqrt((side1*side1) + (side2*side2));
        t1.setText(Double.toString(sum));
    }
}
