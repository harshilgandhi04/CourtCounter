package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,bdel,bclr;
    EditText et;
    TextView tt;
    int val1,val2;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.one_button);
        b2=(Button) findViewById(R.id.two_button);
        b3=(Button) findViewById(R.id.three_button);
        b4=(Button) findViewById(R.id.four_button);
        b5=(Button) findViewById(R.id.five_button);
        b6=(Button) findViewById(R.id.six_button);
        b7=(Button) findViewById(R.id.seven_button);
        b8=(Button) findViewById(R.id.eight_button);
        b9=(Button) findViewById(R.id.nine_button);
        b0=(Button) findViewById(R.id.zero_button);
        bdot=(Button) findViewById(R.id.dot_button);
        badd=(Button) findViewById(R.id.plus_button);
        bsub=(Button) findViewById(R.id.minus_button);
        bmul=(Button) findViewById(R.id.mul_button);
        bdiv=(Button) findViewById(R.id.div_button);
        beq=(Button) findViewById(R.id.equal_button);
        bdel=(Button) findViewById(R.id.del_button);
        bclr=(Button) findViewById(R.id.clr_button);
        et=(EditText) findViewById(R.id.output_view);
        tt=(TextView) findViewById(R.id.finaloutput_view);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                //et.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Integer.parseInt(et.getText()+"");
                if (add==true) {
                    et.setText(val1+val2+"");
                    add=false;
                    et.setText(null);
                }
                if (sub==true) {
                    et.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true) {
                    et.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true) {
                    et.setText(val1/val2+"");
                    div=false;
                }
            }

        });


    }

}

