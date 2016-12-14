package com.example.administrator.test03;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText("button按钮被单击了！");
            }
        });
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(checkBox1.getText());
            }
        });
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(checkBox2.getText());
            }
        });
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(checkBox3.getText());
            }
        });
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(radioButton1.getText());
            }
        });
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(radioButton2.getText());
            }
        });

        final RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) findViewById(R.id.textView);
                textView1.setText(radioButton3.getText());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
