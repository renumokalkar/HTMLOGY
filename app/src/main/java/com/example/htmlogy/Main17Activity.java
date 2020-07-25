package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.htmlogy.R;

public class Main17Activity extends AppCompatActivity {
    ListView itemList;
    String[] TableItem={"<TABLE>","<TD>","<CAPTION>","<TH>","<TR>"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        itemList=(ListView)findViewById(R.id.listview5);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,TableItem);
        itemList.setAdapter(adapter);

        final Button example= (Button) findViewById(R.id.example);
        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main17Activity.this, Main18Activity.class );
                startActivity(i);

            }
        });

    }
}
