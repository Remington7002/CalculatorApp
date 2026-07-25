package com.Calculatorapplication.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int Firstnumber;
    String operator;
    boolean newnumber;

    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        int[] numbers=new int[]{};

        Button b1=findViewById(R.id.Btn1);
        Button b2=findViewById(R.id.btn2);
        Button b3=findViewById(R.id.btn3);
        Button b4=findViewById(R.id.btn4);
        Button b5=findViewById(R.id.btn5);
        Button b6=findViewById(R.id.btn6);
        Button b7=findViewById(R.id.btn7);
        Button b8=findViewById(R.id.btn8);
        Button b9=findViewById(R.id.btn9);
        Button Clear=findViewById(R.id.Clear);



        Button Addtion=findViewById(R.id.btn_Add);
        Button Subtract=findViewById(R.id.btnminus);
        Button Multiply=findViewById(R.id.btnmultiply);
        Button Divide=findViewById(R.id.btndivide);
        Button Equals=findViewById(R.id.btn_Equals);
        EditText Screen=findViewById(R.id.MainText);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.append(""+9);
            }
        });
        Addtion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=Screen.getText().toString();
                Screen.setText("");
//                int number=Integer.parseInt(n1);
//                result=number+result;
//                Screen.setText("");
                Firstnumber=Integer.parseInt(n1);
                result+=Firstnumber;



            }
        });
        Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result!=0) {
                    String es = Screen.getText().toString();
                    int enumber = Integer.parseInt(es);
                    result = enumber + result;
                    String res = new String();
                    res = Integer.toString(result);
                    Screen.setText(res);
                    result = 0;
                }
                else{
                    Screen.setText("");
                }
            }
        });
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=Screen.getText().toString();
                Screen.setText("");
                Firstnumber=Integer.parseInt(n1);
                result-=Firstnumber;
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText("");
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}