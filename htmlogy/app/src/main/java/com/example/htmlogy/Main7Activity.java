package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.htmlogy.R;

public class Main7Activity extends AppCompatActivity {
    ListView itemList;
    String[] BasicItem={"<!DOCTYPE>","<HTML>","<HEAD>","<TITLE>","<BODY>","<H1>TO<H6>","<BR>","<HR>","<B>","<U>","<I>"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        itemList=(ListView)findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,BasicItem);

        itemList.setAdapter(adapter);

        final Button example= (Button) findViewById(R.id.example);
        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main7Activity.this, Main8Activity.class );
                startActivity(i);

            }
        });

    }
}
