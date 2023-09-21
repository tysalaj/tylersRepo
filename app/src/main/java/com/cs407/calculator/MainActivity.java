package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextField);

        String numberOne = myTextField.getText().toString();
        String numberTwo= secondTextField.getText().toString();
        int intNum1 = Integer.parseInt(numberOne);
        int intNum2 = Integer.parseInt(numberTwo);

        int add = intNum1 + intNum2;

        goToActivity(String.valueOf(add));
    }
    public void clickMinus(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextField);

        String numberThree = myTextField.getText().toString();
        String numberFour= secondTextField.getText().toString();

        int intNum3 = Integer.parseInt(numberThree);
        int intNum4 = Integer.parseInt(numberFour);

        int minus = intNum3- intNum4;

        goToActivity(String.valueOf(minus));
    }

    public void clickMultiply(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextField);

        String numberThree = myTextField.getText().toString();
        String numberFour= secondTextField.getText().toString();

        int intNum3 = Integer.parseInt(numberThree);
        int intNum4 = Integer.parseInt(numberFour);

        int multiply = intNum3*intNum4;

        goToActivity(String.valueOf(multiply));
    }

    public void clickDivide(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextField);

        String numberThree = myTextField.getText().toString();
        String numberFour= secondTextField.getText().toString();

        int intNum3 = Integer.parseInt(numberThree);
        int intNum4 = Integer.parseInt(numberFour);


        if(intNum4 !=0){
            int divide = intNum3/intNum4;
            goToActivity(String.valueOf(divide));
        }else{
            Toast.makeText(MainActivity.this,"Can not divide by zero, try again", Toast.LENGTH_LONG).show();
        }

    }



    public void goToActivity(String num1){
        Intent intent= new Intent(this, activityCalculator.class);
        intent.putExtra("numberOne", num1);
        startActivity(intent);
    }
}