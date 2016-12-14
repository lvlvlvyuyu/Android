package com.example.administrator.test_04;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME = "name";
    private final static String CLASS = "Class";
    private final static String ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String[] name = {"张三", "李四", "赵六"};
        String[] Class = {"软工1", "计科2", "网工3"};
        String[] id = {"2014011333", "2014011356", "2014011357"};

        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(NAME, name[i]);
            item.put(CLASS, Class[i]);
            item.put(ID, id[i]);
            items.add(item);
        }
        SimpleAdapter adapter
                = new SimpleAdapter(this,
                items,
                R.layout.item,

                new String[]{NAME,
                        CLASS,
                        ID},
                new int[]{R.id.txtname, R.id.txtClass, R.id.txtid});
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }






}
