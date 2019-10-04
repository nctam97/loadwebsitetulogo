package com.example.loadwebsitetulogo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> list = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(R.drawable.h1);
        list.add(R.drawable.h2);
        list.add(R.drawable.h3);
        list.add(R.drawable.h4);
        list.add(R.drawable.h5);
        list.add(R.drawable.h6);
        list.add(R.drawable.h7);
        list.add(R.drawable.h8);
        list.add(R.drawable.h9);
        list.add(R.drawable.h10);
        final GridView gv =(GridView)findViewById(R.id.gridView1);
        MyAdapter adapter=new MyAdapter(list,MainActivity.this);
        gv.setAdapter(adapter);
    }
}

