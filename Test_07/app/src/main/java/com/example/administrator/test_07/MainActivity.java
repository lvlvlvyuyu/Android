package com.example.administrator.test_07;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button = (Button) findViewById(R.id.buttonTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Get the layout inflater
                //LayoutInflater inflater = getLayoutInflater();

                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);

                final View DialogView = inflater.inflate(R.layout.login_dialog, null);

                builder.setView(inflater.inflate(R.layout.login_dialog, null))
                        .setTitle("Login")
                        // Add action buttons
                        .setView(DialogView)
                        .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                            @Override

                            public void onClick(DialogInterface dialog, int id) {
                                // login

                                EditText userid =(EditText) DialogView.findViewById(R.id.editTextUserId);
                                EditText password =(EditText) DialogView.findViewById(R.id.editTextPwd);
                                String strId = userid.getText().toString().trim();
                                String strPassword = password.getText().toString().trim();


                              /*boolean isEquals1 = strId.equals("abc");
                                boolean isEquals2 = strPassword.equals("123");
                                Log.v("strId的值", strId);
                                Log.v("strPassword的值", strPassword);
                                Log.v("isEquals1的值", new Boolean(isEquals1).toString());
                                Log.v("isEquals2的值", new Boolean(isEquals2).toString());
*/


                                if(strId.equals("abc") && strPassword.equals("123")) {
                                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();

                                }
                                else {
                                    Toast.makeText(MainActivity.this, "请输入正确密码", Toast.LENGTH_LONG).show();

                                }






                            }
                        });

                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //cancel
                        Toast.makeText(MainActivity.this,"取消登录", Toast.LENGTH_LONG).show();
                    }



                });
                builder.show();
            }



        });


        Button inf = (Button) findViewById(R.id.button2);
        inf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("显示相关信息")//显示的消息内容
                        .setTitle("提示对话框");//对话框标题

                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "已确认", Toast.LENGTH_LONG).show();

                    }
                });

                builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "已忽略", Toast.LENGTH_LONG).show();

                    }

                });
                builder.show();
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
