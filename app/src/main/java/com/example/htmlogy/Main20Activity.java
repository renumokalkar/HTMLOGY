package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        final Button basic1 = (Button) findViewById(R.id.basic1);
        final Button forms1 = (Button) findViewById(R.id.forms1);
        final Button formatting1 = (Button) findViewById(R.id.formatting1);
        final Button links1 = (Button) findViewById(R.id.links1);
        final Button list1 = (Button) findViewById(R.id.list1);
        final Button table1 = (Button) findViewById(R.id.table1);


        basic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main21Activity.class);
                startActivity(i);
            }
        });

        forms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main22Activity.class);
                startActivity(i);
            }
        });

        formatting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main23Activity.class);
                startActivity(i);
            }
        });

        links1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main24Activity.class);
                startActivity(i);
            }
        });

        list1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main25Activity.class);
                startActivity(i);
            }
        });

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main20Activity.this, Main26Activity.class);
                startActivity(i);
            }
        });




    }
}

