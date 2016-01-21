package com.fblife.zhaohengyi.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button but_0;
    Button but_1;
    Button but_2;
    Button but_3;
    Button but_4;
    Button but_5;
    Button but_6;
    Button but_7;
    Button but_8;
    Button but_9;




///
    Button but_add;//加
    Button but_subtract;//减
    Button but_multiply;//乘
    Button but_divide;//除
    Button but_comma;//点
    Button but_clear;
    Button but_delete;
    Button equal_sign;
    EditText number_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_0 =(Button) findViewById(R.id.but_0);
        but_1 =(Button) findViewById(R.id.but_1);
        but_2 =(Button) findViewById(R.id.but_2);
        but_3 =(Button) findViewById(R.id.but_3);
        but_4 =(Button) findViewById(R.id.but_4);
        but_5 =(Button) findViewById(R.id.but_5);
        but_6 =(Button) findViewById(R.id.but_6);
        but_7 =(Button) findViewById(R.id.but_7);
        but_8 =(Button) findViewById(R.id.but_8);
        but_9 =(Button) findViewById(R.id.but_9);
        but_add = (Button) findViewById(R.id.but_add);
        but_subtract = (Button) findViewById(R.id.but_subtract);
        but_multiply = (Button) findViewById(R.id.but_multiply);
        but_divide = (Button) findViewById(R.id.but_divide);
        but_clear = (Button) findViewById(R.id.but_clear);
        but_delete = (Button) findViewById(R.id.but_delete);
        number_output = (EditText) findViewById(R.id.number_output);


        but_0.setOnClickListener(this);
        but_1.setOnClickListener(this);
        but_2.setOnClickListener(this);
        but_3.setOnClickListener(this);
        but_4.setOnClickListener(this);
        but_5.setOnClickListener(this);
        but_6.setOnClickListener(this);
        but_7.setOnClickListener(this);
        but_8.setOnClickListener(this);
        but_9.setOnClickListener(this);

        but_add.setOnClickListener(this);
        but_subtract.setOnClickListener(this);
        but_multiply.setOnClickListener(this);
        but_divide.setOnClickListener(this);

        but_clear.setOnClickListener(this);
        but_delete.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

    }
}
