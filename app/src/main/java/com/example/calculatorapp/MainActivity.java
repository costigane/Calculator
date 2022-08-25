package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreenSelector(View view) {
        Intent intent = new Intent(this, PageSwitchActivity.class);
        startActivity(intent);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.input1);
        EditText number2ET = findViewById(R.id.input2);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.input1);
        EditText number2ET = findViewById(R.id.input2);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int difference = num1 - num2;

        numberSumTV.setText("" + difference);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.input1);
        EditText number2ET = findViewById(R.id.input2);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;

        numberSumTV.setText("" + product);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.input1);
        EditText number2ET = findViewById(R.id.input2);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int quotient = num1 / num2;

        numberSumTV.setText("" + quotient);
    }
}