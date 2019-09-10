package com.example.asus.bmi_cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {

        EditText text1 = (EditText)findViewById(R.id.in_kg);
        EditText text2 = (EditText)findViewById(R.id.in_lb);
        EditText text3 = (EditText)findViewById(R.id.in_oz);

        double kg1,kg2nc,kg3nc = 0.0;

        kg1 = Double.parseDouble(text1.getText().toString());
        kg2nc = Double.parseDouble(text2.getText().toString());
        kg3nc = Double.parseDouble(text3.getText().toString());

        double kg2 = (kg2nc*0.453592);
        double kg3 = (kg3nc*0.0283495);

        double kg = (kg1 + kg2 + kg3);


        EditText text4 = (EditText)findViewById(R.id.in_m);
        EditText text5 = (EditText)findViewById(R.id.in_ft);
        EditText text6 = (EditText)findViewById(R.id.in_in);
        double m1,m2nc,m3nc;
         m1 = Double.parseDouble(text4.getText().toString());
         m2nc = Double.parseDouble(text5.getText().toString());m3nc = Double.parseDouble(text6.getText().toString());

        double m2 = (m2nc*0.3048);
        double m3 = (m3nc*0.0254);

        double m = (m1 + m2 + m3);

        double bmi = kg/(m*m);

        TextView tv = findViewById(R.id.bmix);
        tv.setText(" BMI is "+bmi);

        if(bmi>25){
            String txt = "Overweight";
        }

        else if(24.9>bmi && bmi>18.5 ){
            String txt = "Overweight";
        }

        else if(bmi<18.5){
            String txt = "Underweight";
        }
    }
}
