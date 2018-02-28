package com.creativeapps.calci;

/**
 *  Created By Ashim. This is a basic calculator to do basic arithmetic operations*
 *
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSub, btnMult, btnDiv, btnReM;
    TextView tvResult;
    EditText etNUM1, etNUM2;
    private int val1, val2, resultInt;
    private double a, b, resultDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding views
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMult = findViewById(R.id.buttonMult);
        btnDiv = findViewById(R.id.buttonDiv);
        btnReM = findViewById(R.id.buttonRe);

        etNUM1 = findViewById(R.id.editTextNu1);
        etNUM2 = findViewById(R.id.editTextNu2);

        tvResult = findViewById(R.id.textViewRes);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mult();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div();
            }
        });

        btnReM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReM();
            }
        });


    }

    /*Methods for arithmetic operations*/

    private void Add() {
        //Firstly check if editText are not empty, if they are empty then do nothing.
        if (etNUM1.getText().toString().length() > 0 && etNUM2.getText().toString().length() > 0) {
            //Now check if editTexts contains any decimal values
            if (etNUM1.getText().toString().contains(".") && etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString()); // Assigned editText value to a(Decimal)
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a + b;
                tvResult.setText(String.valueOf(resultDouble));  // Show the result in TextView
            } else if (etNUM1.getText().toString().contains(".") || etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a + b;
                tvResult.setText(String.valueOf(resultDouble));
            } else {
                val1 = Integer.parseInt(etNUM1.getText().toString()); // Assigned value to val1 (Integer )
                val2 = Integer.parseInt(etNUM2.getText().toString());
                resultInt = val1 + val2;
                tvResult.setText(String.valueOf(resultInt));
            }
        }
    }

    private void Sub() {
        if (etNUM1.getText().toString().length() > 0 && etNUM2.getText().toString().length() > 0) {
            if (etNUM1.getText().toString().contains(".") && etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a - b;
                tvResult.setText(String.valueOf(resultDouble));
            } else if (etNUM1.getText().toString().contains(".") || etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a - b;
                tvResult.setText(String.valueOf(resultDouble));
            } else {
                val1 = Integer.parseInt(etNUM1.getText().toString());
                val2 = Integer.parseInt(etNUM2.getText().toString());
                resultInt = val1 - val2;
                tvResult.setText(String.valueOf(resultInt));
            }
        }
    }


    private void Mult() {
        if (etNUM1.getText().toString().length() > 0 && etNUM2.getText().toString().length() > 0) {
            if (etNUM1.getText().toString().contains(".") && etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a * b;
                tvResult.setText(String.valueOf(resultDouble));
            } else if (etNUM1.getText().toString().contains(".") || etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a * b;
                tvResult.setText(String.valueOf(resultDouble));
            } else {
                val1 = Integer.parseInt(etNUM1.getText().toString());
                val2 = Integer.parseInt(etNUM2.getText().toString());
                resultInt = val1 * val2;
                tvResult.setText(String.valueOf(resultInt));
            }
        }
    }

    private void Div() {
        if (etNUM1.getText().toString().length() > 0 && etNUM2.getText().toString().length() > 0) {
            if (etNUM1.getText().toString().contains(".") && etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a / b;
                tvResult.setText(String.valueOf(resultDouble));
            } else if (etNUM1.getText().toString().contains(".") || etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a / b;
                tvResult.setText(String.valueOf(resultDouble));
            } else {
                val1 = Integer.parseInt(etNUM1.getText().toString());
                val2 = Integer.parseInt(etNUM2.getText().toString());
                resultInt = val1 / val2;
                tvResult.setText(String.valueOf(resultInt));
            }
        }
    }

    private void ReM() {
        if (etNUM1.getText().toString().length() > 0 && etNUM2.getText().toString().length() > 0) {
            if (etNUM1.getText().toString().contains(".") && etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a % b;
                tvResult.setText(String.valueOf(resultDouble));
            } else if (etNUM1.getText().toString().contains(".") || etNUM2.getText().toString().contains(".")) {
                a = Double.parseDouble(etNUM1.getText().toString());
                b = Double.parseDouble(etNUM2.getText().toString());
                resultDouble = a % b;
                tvResult.setText(String.valueOf(resultDouble));
            } else {
                val1 = Integer.parseInt(etNUM1.getText().toString());
                val2 = Integer.parseInt(etNUM2.getText().toString());
                resultInt = val1 % val2;
                tvResult.setText(String.valueOf(resultInt));
            }
        }
    }


}
