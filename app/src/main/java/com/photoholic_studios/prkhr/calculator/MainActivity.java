package com.photoholic_studios.prkhr.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double value1, value2, result, count=0;
    boolean addition=false, subtraction=false, division=false, multiplication=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView exp,exp1;
        exp = findViewById(R.id.exp);
        exp1 = findViewById(R.id.exp1);

        final Button zero, one, two, three, four, five, six, seven, eight, nine, divide, multiply, add, subtract, eqls, decimal, clear;
        zero = findViewById(R.id.button15);
        one = findViewById(R.id.button10);
        two = findViewById(R.id.button11);
        three = findViewById(R.id.button12);
        four = findViewById(R.id.button7);
        five = findViewById(R.id.button6);
        six = findViewById(R.id.button8);
        seven = findViewById(R.id.button);
        eight = findViewById(R.id.button2);
        nine = findViewById(R.id.button3);
        divide = findViewById(R.id.button5);
        multiply = findViewById(R.id.button9);
        add = findViewById(R.id.button17);
        subtract = findViewById(R.id.button13);
        eqls = findViewById(R.id.button16);
        decimal = findViewById(R.id.button14);
        clear = findViewById(R.id.clear);



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"0");
                exp.setText(exp.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"1");
                exp.setText(exp.getText()+"1");
            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"2");
                exp.setText(exp.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"3");
                exp.setText(exp.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"4");
                exp.setText(exp.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"5");
                exp.setText(exp.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"6");
                exp.setText(exp.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"7");
                exp.setText(exp.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"8");
                exp.setText(exp.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Double.parseDouble(exp.getText()+"9");
                exp.setText(exp.getText()+"9");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==0) {
                    count++;
                    value1 = Double.parseDouble(exp.getText() + ".0");
                    exp.setText(exp.getText() + ".");
                }
                else count++;
            }
        });


        /*
        #for 1+2
        1. value1=1
        2. value2 = value1 = 1
        addition = true
        3. value1=2
        equals is pressed and result is
        4. value2 = value2 + value1 = 1 + 2 = 3(as addition==true)

        #for 1+2+3
        1. value1=1
        2. value2=1
        addition = true
        3. value1=2
        now if add is pressed
        4. value2 = value2 + value1 = 1 + 2 = 3(as addition==true)
        addition = true
        user enters again
        5. value1=3
        equals is pressed and result is
        6. value2 = value2 + value1 = 3 + 3 = 6(as addition==true)

        #for 1+2*3
        1. value1=1
        2. value2=1(addition==true)
        3. value1=2
        now if multiplication is pressed
        4. value2 = value2 + value1 = 1 + 2 = 3(as addition==true)
        multiplication = true
        addition = false
        user enters again
        5. value1=3
        equals is pressed and result is
        6. value2 = value2 * value1 = 3 * 3 = 9(as multiplication==true)
        */


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exp1.append("("+exp.getText()+")+");
                exp.setText(null);

                if(addition) {
                    value2 = value2 + value1;
                }
                else if(subtraction)
                {
                    value2 = value2 - value1;
                    subtraction = false;
                }
                else if(division)
                {
                    value2 = value2/value1;
                    division = false;
                }
                else if(multiplication)
                {
                    value2 = value2*value1;
                    multiplication = false;
                }
                else
                {
                    value2 = value1;
                }
                addition = true;
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp1.append("("+exp.getText()+")-");
                exp.setText(null);

                if(addition)
                {
                    value2 = value2 + value1;
                    addition = false;
                }
                else if(subtraction)
                {
                    value2 = value2 - value1;
                }
                else if(division)
                {
                    value2 = value2/value1;
                    division = false;
                }
                else if(multiplication)
                {
                    value2 = value2*value1;
                    multiplication = false;
                }
                else value2 = value1;
                subtraction = true;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp1.append("("+exp.getText()+")/");
                exp.setText(null);

                if(addition)
                {
                    value2 = value2 + value1;
                    addition = false;
                }
                else if(subtraction)
                {
                    value2 = value2 - value1;
                    subtraction = false;
                }
                else if(division)
                {
                    value2 = value2/value1;
                }
                else if(multiplication)
                {
                    value2 = value2*value1;
                    multiplication = false;
                }
                else value2 = value1;
                division = true;
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp1.append("("+exp.getText()+")*");
                exp.setText(null);

                if(addition)
                {
                    value2 = value2 + value1;
                    addition = false;
                }
                else if(subtraction)
                {
                    value2 = value2 - value1;
                    subtraction = false;
                }
                else if(division)
                {
                    value2 = value2/value1;
                    division = false;
                }
                else if(multiplication)
                {
                    value2 = value2*value1;
                }
                else value2 = value1;
                multiplication = true;
            }
        });



        eqls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp1.append("("+exp.getText()+")=");

                if(addition)
                {
                    result = value2 + value1;
                }
                else if(subtraction)
                {
                    result = value2 - value1;
                }
                else if(division)
                {
                    result = value2/value1;
                }
                else if(multiplication)
                {
                    result = value2*value1;
                }
                else exp.setText(value1+"");
                exp.setText(result+"");
            }
        });




        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exp.setText(null);
                exp1.setText(null);
                addition = false;
                subtraction = false;
                division = false;
                multiplication = false;
                count=0;

            }
        });
    }
}

