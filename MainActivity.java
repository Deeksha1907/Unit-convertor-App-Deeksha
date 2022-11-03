package com.unitconverter.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button bt1;
    TextView output;

    @RequiresApi(api = Build.VERSION_CODES.S)
    @SuppressLint({"WrongViewCast", "MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        ed1 = findViewById(R.id.editTextNumberDecimal);
        bt1 = findViewById(R.id.button);
        output = findViewById(R.id.View);


        String[] from={"USD","INR","YEN"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(  this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to={"USD","INR","YEN"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<>( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tot;

                double amount = Double.parseDouble(ed1.getText().toString());

                if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("INR")) {
                    tot = amount * 82.78;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("YEN")) {
                    tot = amount * 147.82;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("USD")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("INR") && sp2.getSelectedItem().toString().equals("YEN")) {
                    tot = amount * 1.79;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("INR") && sp2.getSelectedItem().toString().equals("USD")) {
                    tot = amount * 0.012;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("INR") && sp2.getSelectedItem().toString().equals("INR")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("YEN") && sp2.getSelectedItem().toString().equals("USD")) {
                    tot = amount * 0.0068;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("YEN") && sp2.getSelectedItem().toString().equals("INR")) {
                    tot = amount * 0.56;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("YEN") && sp2.getSelectedItem().toString().equals("YEN")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
            }
        });


    }
}