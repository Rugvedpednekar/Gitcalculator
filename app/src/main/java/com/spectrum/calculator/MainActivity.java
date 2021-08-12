package com.spectrum.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText Number1 ,Number2;
    Button Add,Subtract, Divide, Multiply;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result= (TextView)findViewById(R.id.Result);

        Number1= (EditText)findViewById(R.id.Number1);
        Number2= (EditText)findViewById(R.id.Number2);

        Add= (Button) findViewById(R.id.Add);
        Subtract= (Button)findViewById(R.id.Subtract);
        Divide= (Button)findViewById(R.id.Divide);
        Multiply= (Button)findViewById(R.id.Multiply);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num = num1 + num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num = num1 - num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num = num1 * num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(Number1.getText().toString());
                num2=Integer.parseInt(Number2.getText().toString());
                result_num = num1 / num2;
                Result.setText(String.valueOf(result_num));
            }
        });

    }
}