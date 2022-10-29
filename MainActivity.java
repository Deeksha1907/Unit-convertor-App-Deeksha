package com.unitconverter.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

TextView output;
EditText Enternum;
Button milimeter;
Button centimeter;
Button kilometer;
Button miles;
    @RequiresApi(api = Build.VERSION_CODES.S)
    @SuppressLint({"WrongViewCast", "MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.View);
        Enternum = findViewById(R.id.editTextNumberDecimal);
        milimeter = findViewById(R.id.button4);
        centimeter = findViewById(R.id.button3);
        kilometer = findViewById(R.id.button2);
        miles = findViewById(R.id.button);

        milimeter.setOnClickListener(view -> {
            String num = Enternum.getText().toString();
            float number = Float.parseFloat(num);
            float milimeter =(number*1000);
            output.setText("Value in milimeters:" + milimeter);
        });
        centimeter.setOnClickListener(view -> {
            String num = Enternum.getText().toString();
            float number = Float.parseFloat(num);
            float centimeter =(number*100);
            output.setText("Value in centimeters:" + centimeter);
        });
        kilometer.setOnClickListener(view -> {
            String num = Enternum.getText().toString();
            float number = Float.parseFloat(num);
            double kilometer =(number / 1000);
            output.setText("Value in kilometers:" + kilometer);
        });
        miles.setOnClickListener(view -> {
            String num = Enternum.getText().toString();
            float number = Float.parseFloat(num);
            double miles =(number/1.609);
            output.setText("Value in miles:" + miles);
        });

    }
}