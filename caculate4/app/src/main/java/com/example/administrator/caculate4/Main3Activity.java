package com.example.administrator.caculate4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    EditText e;
    EditText e1;
    double num1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b=(Button)findViewById(R.id.doit);
        Button b1=(Button)findViewById(R.id.return2);
        TextView t1=(TextView)findViewById(R.id.tview);
        TextView t=(TextView)findViewById(R.id.tview0);
        e=(EditText)findViewById(R.id.etext0);
        e1=(EditText)findViewById(R.id.etext);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        t.setOnClickListener(this);
        t1.setOnClickListener(this);
        e.setOnClickListener(this);
        e1.setOnClickListener(this);


    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.doit:
                String ee = e.getText().toString();

                if (ee.equals(null)) {
                    return;
                }
                num1=Double.valueOf(ee);
                num1*=0.9144;
                e1.setText(String.valueOf(num1));

            case R.id.return2:
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
                break;
            default:break;
        }
    }
}
