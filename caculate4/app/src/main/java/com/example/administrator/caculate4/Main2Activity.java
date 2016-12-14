package com.example.administrator.caculate4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    boolean isequ=false;
    double num1=0;
    double num2=0;
    double result=0;
    int op=0;
    TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1=(Button)findViewById(R.id.button1);
        Button b0=(Button)findViewById(R.id.button0);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        Button b6=(Button)findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.button7);
        Button b8=(Button)findViewById(R.id.button8);
        Button b9=(Button)findViewById(R.id.button9);
        Button badd=(Button)findViewById(R.id.buttonadd);
        Button bJ=(Button)findViewById(R.id.buttonJ);
        Button bcheng=(Button)findViewById(R.id.buttoncheng);
        Button bchu=(Button)findViewById(R.id.buttongang);
        Button bce=(Button)findViewById(R.id.buttonCE);
        Button bdian=(Button)findViewById(R.id.buttondian);
        Button bdeng=(Button)findViewById(R.id.buttondeng);
        Button bsuper=(Button)findViewById(R.id.super1);
        e1=(TextView)findViewById(R.id.editText);
        Button bback=(Button)findViewById(R.id.buttonCback);
        Button bsin=(Button)findViewById(R.id.bsin);
        Button bcos=(Button)findViewById(R.id.bcos);
        Button btan=(Button)findViewById(R.id.btan);
        Button b=(Button)findViewById(R.id.supermi) ;

        bsin.setOnClickListener(this);
        bcos.setOnClickListener(this);
        btan.setOnClickListener(this);
        bback.setOnClickListener(this);
        bsuper.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        badd.setOnClickListener(this);
        bJ.setOnClickListener(this);
        bcheng.setOnClickListener(this);
        bchu.setOnClickListener(this);
        bce.setOnClickListener(this);
        bdian.setOnClickListener(this);
        bdeng.setOnClickListener(this);
        b.setOnClickListener(this);

    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonCback:
                String myStr=e1.getText().toString();
                try {
                    e1.setText(myStr.substring(0, myStr.length()-1));
                } catch (Exception e) {
                    e1.setText("");
                }//有问题
            case R.id.button0:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString = e1.getText().toString();
                myString += "0";
                e1.setText(myString);
                break;


            case R.id.button1:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString1 = e1.getText().toString();
                myString1 += "1";
                e1.setText(myString1);
                break;


            case R.id.button2:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString2 = e1.getText().toString();
                myString2 += "2";
                e1.setText(myString2);
                break;


            case R.id.button3:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString3 = e1.getText().toString();
                myString3 += "3";
                e1.setText(myString3);
                break;


            case R.id.button4:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString4 = e1.getText().toString();
                myString4 += "4";
                e1.setText(myString4);
                break;


            case R.id.button5:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString5 = e1.getText().toString();
                myString5 += "5";
                e1.setText(myString5);
                break;


            case R.id.button6:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString6 = e1.getText().toString();
                myString6 += "6";
                e1.setText(myString6);
                break;


            case R.id.button7:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString7 = e1.getText().toString();
                myString7 += "7";
                e1.setText(myString7);
                break;


            case R.id.button8:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString8 = e1.getText().toString();
                myString8 += "8";
                e1.setText(myString8);
                break;


            case R.id.button9:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myString9 = e1.getText().toString();
                myString9 += "9";
                e1.setText(myString9);
                break;





            case R.id.buttonCE:
                e1.setText(null);
                break;


            case R.id.buttonadd:
                String myStringadd=e1.getText().toString();
                if (myStringadd.equals(null)) {
                    return;
                }

                num1=Double.valueOf(myStringadd);
                e1.setText(null);
                op=1;
                isequ=false;
                break;


            case R.id.buttonJ:
                String myStringJ = e1.getText().toString();
                if (myStringJ.equals(null)) {
                    return;
                }

                num1=Double.valueOf(myStringJ);
                e1.setText(null);
                op=2;
                isequ=false;
                break;


            case R.id.buttoncheng:
                String myStringcheng = e1.getText().toString();
                if (myStringcheng.equals(null)) {
                    return;
                }

                num1=Double.valueOf(myStringcheng);
                e1.setText(null);
                op=3;
                isequ=false;
                break;


            case R.id.buttongang:
                String myStringgang = e1.getText().toString();
                if (myStringgang.equals(null)) {
                    return;
                }

                num1=Double.valueOf(myStringgang);
                e1.setText(null);
                op=4;
                isequ=false;
                break;

            case R.id.buttondeng:
                String myStringdeng = e1.getText().toString();
                if (myStringdeng.equals(null)) {
                    return;
                }

                num2=Double.valueOf(myStringdeng);
                e1.setText(null);
                switch (op) {
                    case  0:
                        result=num2;
                        break;
                    case  1:
                        result=num1+num2;
                        break;
                    case  2:
                        result=num1-num2;
                        break;
                    case  3:
                        result=num1*num2;
                        break;
                    case  4:
                        result=num1/num2;
                        break;
                    default:
                        result=0;
                        break;
                }
                e1.setText(String.valueOf(result));
                isequ=true;
                break;
           case R.id.buttondian:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
               String myStringdian = e1.getText().toString();
                myStringdian += ".";
                e1.setText(myStringdian);
                break;
            /* String s2=".";
            int i=s2.length();
            for (int t=0;t<myStringdian.length()-1;t++){
                if(myStringdian.regionMatches(0,s2,0,i)==true)break;
                else  myStringdian += ".";
            }*/

            case R.id.super1:
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.supermi:
                Intent intent1=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent1);
                break;
            case R.id.bsin:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myStringsin = e1.getText().toString();
                //sin= (int) Double.parseDouble(myStringsin);
                double sin=Math.sin(Double.valueOf(myStringsin).doubleValue()*Math.PI/180);
                e1.setText(String.valueOf(sin));
                break;
            case R.id.bcos:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myStringcos = e1.getText().toString();
                //sin= (int) Double.parseDouble(myStringsin);
                double cos=Math.cos(Double.valueOf(myStringcos).doubleValue()*Math.PI/180);
                e1.setText(String.valueOf(cos));
                break;
            case R.id.btan:
                if (isequ) {
                    e1.setText(null);
                    isequ = false;
                }
                String myStringtan = e1.getText().toString();
                //sin= (int) Double.parseDouble(myStringsin);
                double tan=Math.tan(Double.valueOf(myStringtan).doubleValue()*Math.PI/180);
                e1.setText(String.valueOf(tan));
                break;
            default:break;


        }

    }
}
