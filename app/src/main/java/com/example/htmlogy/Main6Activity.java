package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final Button basic = (Button) findViewById(R.id.basic);
        final Button forms = (Button) findViewById(R.id.forms);
        final Button formatting = (Button) findViewById(R.id.formatting);
        final Button links = (Button) findViewById(R.id.links);
        final Button list = (Button) findViewById(R.id.list);
        final Button table = (Button) findViewById(R.id.table);


        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(i);
            }
        });

        forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main9Activity.class);
                startActivity(i);
            }
        });

        formatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main11Activity.class);
                startActivity(i);
            }
        });

        links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main13Activity.class);
                startActivity(i);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main15Activity.class);
                startActivity(i);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main17Activity.class);
                startActivity(i);
            }
        });




    }
}

