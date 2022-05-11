package com.example.tp4ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerXml , spinnerCodeJava;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerXml = findViewById(R.id.spinnerXml);
        spinnerCodeJava = findViewById(R.id.spinnerCodeJava);
        textView = findViewById(R.id.textView);

        String [] colors = {"Rouge" , "Jaune" , "Vert"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,colors);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCodeJava.setAdapter(arrayAdapter);

        spinnerXml.setOnItemSelectedListener(this);
        spinnerCodeJava.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        switch (text) {
            case "Rouge":
                textView.setTextColor(Color.RED);
                break;
            case "Jaune":
                textView.setTextColor(Color.YELLOW);
                break;
            case "Vert":
                textView.setTextColor(Color.GREEN);
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}