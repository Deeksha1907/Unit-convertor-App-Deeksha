package com.unitconverter.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2,sp3;
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
        sp3 = findViewById(R.id.spinner);
        ed1 = findViewById(R.id.editTextNumberDecimal);
        bt1 = findViewById(R.id.button);
        output = findViewById(R.id.View);


        String[] head={"CURRENCY","LENGTH","TIME","WEIGHT","TEMPERATURE"};
        ArrayAdapter<String> ad2 = new ArrayAdapter<>( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,head);
        sp3.setAdapter(ad2);
        
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
               if(position==0){
                   String[] from = {"USD", "INR", "YEN"};
                   ArrayAdapter ad = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,from);
                   sp1.setAdapter(ad);

                   String[] to = {"USD", "INR", "YEN"};
                   ArrayAdapter ad1 = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,to);
                   sp2.setAdapter(ad1);
               }
               if (position==1){
                   String[] from={"KM","METER","CM"};
                   ArrayAdapter ad = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,from);
                   sp1.setAdapter(ad);

                   String[] to={"KM","METER","CM"};
                   ArrayAdapter ad1 = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,to);
                   sp2.setAdapter(ad1);
               }
               if (position==2){
                   String[] from={"HRS","MIN","SEC"};
                   ArrayAdapter ad = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,from);
                   sp1.setAdapter(ad);

                   String[] to={"HRS","MIN","SEC"};
                   ArrayAdapter ad1 = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,to);
                   sp2.setAdapter(ad1);
               }
               if (position==3){
                   String[] from={"KG","GRAM","CG"};
                   ArrayAdapter ad = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,from);
                   sp1.setAdapter(ad);

                   String[] to={"KG","GRAM","CG"};
                   ArrayAdapter ad1 = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,to);
                   sp2.setAdapter(ad1);
               }
               if (position==4){
                   String[] from={"°C","K","°F"};
                   ArrayAdapter ad = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,from);
                   sp1.setAdapter(ad);

                   String[] to={"°C","K","°F"};
                   ArrayAdapter ad1 = new ArrayAdapter<>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,to);
                   sp2.setAdapter(ad1);
               }
               }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
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
                else if (sp1.getSelectedItem().toString().equals("KM") && sp2.getSelectedItem().toString().equals("METER")) {
                    tot = amount *1000;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("KM") && sp2.getSelectedItem().toString().equals("KM")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("KM") && sp2.getSelectedItem().toString().equals("CM")) {
                    tot = amount *100000;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("METER") && sp2.getSelectedItem().toString().equals("METER")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("METER") && sp2.getSelectedItem().toString().equals("KM")) {
                    tot = amount *0.001;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("METER") && sp2.getSelectedItem().toString().equals("CM")) {
                    tot = amount *100;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CM") && sp2.getSelectedItem().toString().equals("METER")) {
                    tot = amount *.01;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CM") && sp2.getSelectedItem().toString().equals("CM")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CM") && sp2.getSelectedItem().toString().equals("KM")) {
                    tot = amount *0.00001;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CM") && sp2.getSelectedItem().toString().equals("METER")) {
                    tot = amount *0.01;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("HRS") && sp2.getSelectedItem().toString().equals("MIN")) {
                    tot = amount *60;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("HRS") && sp2.getSelectedItem().toString().equals("SEC")) {
                    tot = amount *3600;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("HRS") && sp2.getSelectedItem().toString().equals("HRS")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("MIN") && sp2.getSelectedItem().toString().equals("HRS")) {
                    tot = amount/60;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("MIN") && sp2.getSelectedItem().toString().equals("MIN")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("MIN") && sp2.getSelectedItem().toString().equals("SEC")) {
                    tot = amount*60;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("SEC") && sp2.getSelectedItem().toString().equals("HRS")) {
                    tot = amount/3600;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("SEC") && sp2.getSelectedItem().toString().equals("MIN")) {
                    tot = amount/60;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("SEC") && sp2.getSelectedItem().toString().equals("SEC")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("KG") && sp2.getSelectedItem().toString().equals("GRAM")) {
                    tot = amount*1000;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("KG") && sp2.getSelectedItem().toString().equals("KG")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("KG") && sp2.getSelectedItem().toString().equals("CG")) {
                    tot = amount*100000;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("GRAM") && sp2.getSelectedItem().toString().equals("GRAM")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("GRAM") && sp2.getSelectedItem().toString().equals("CG")) {
                    tot = amount*100;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("GRAM") && sp2.getSelectedItem().toString().equals("KG")) {
                    tot = amount*0.001;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CG") && sp2.getSelectedItem().toString().equals("CG")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CG") && sp2.getSelectedItem().toString().equals("GRAM")) {
                    tot = amount*0.01;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("CG") && sp2.getSelectedItem().toString().equals("KG")) {
                    tot = amount*0.00001;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°C") && sp2.getSelectedItem().toString().equals("°C")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°C") && sp2.getSelectedItem().toString().equals("K")) {
                    tot = amount+273.15;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°C") && sp2.getSelectedItem().toString().equals("°F")) {
                    tot =( (amount* (9/5)) + 32);
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("K") && sp2.getSelectedItem().toString().equals("K")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("K") && sp2.getSelectedItem().toString().equals("°C")) {
                    tot = amount-273.15;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("K") && sp2.getSelectedItem().toString().equals("°F")) {
                    tot =(((amount-273.15)*(9/5))+32);
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°F") && sp2.getSelectedItem().toString().equals("k")) {
                    tot = (((amount-32)*(5/9))+273.15);
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°F") && sp2.getSelectedItem().toString().equals("°F")) {
                    tot = amount;
                    output.setText("Value:" + tot);
                }
                else if (sp1.getSelectedItem().toString().equals("°F") && sp2.getSelectedItem().toString().equals("°C")) {
                    tot = ((amount-32)*(5/9));
                    output.setText("Value:" + tot);
                }

            }

        });


    }
}