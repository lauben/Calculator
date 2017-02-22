package com.example.user.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //declare variables as instances

    EditText num1Input;
    EditText num2Input;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1Input=(EditText)findViewById(R.id.oneInput);
        num2Input=(EditText)findViewById(R.id.twoInput);
        addBtn=(Button)findViewById(R.id.addbutton);



    }

    public void addNumbers(View view){
        String value1=num1Input.getText().toString();
        String value2=num2Input.getText().toString();
        int one=Integer.parseInt(value1);
        int two=Integer.parseInt(value2);

        int answer=one+two;
      Toast.makeText(getApplicationContext(),String.valueOf(answer),Toast.LENGTH_SHORT).show();
       // answerfield.setText(answer);

    }





}
