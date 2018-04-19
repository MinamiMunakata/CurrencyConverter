package com.example.minami.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void convertToJPN(View view) {
        EditText input = (EditText) findViewById(R.id.inputText);
        try {
            Double cadAsDouble = Double.parseDouble(input.getText().toString());
            Double jpn = cadAsDouble * 85.1791;
            DecimalFormat dec = new DecimalFormat("#.00 YEN");
            String text = dec.format(jpn);
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "input any number before press a button.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
