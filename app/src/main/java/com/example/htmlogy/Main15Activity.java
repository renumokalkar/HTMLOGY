package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.htmlogy.R;

public class Main15Activity extends AppCompatActivity {
    ListView itemList;
    String[] ListItem={"<UL>","<OL>","<LI>","<DL>","<DT>","<DD>"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        itemList=(ListView)findViewById(R.id.listview4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ListItem);
        itemList.setAdapter(adapter);

        final Button example= (Button) findViewById(R.id.example);
        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main15Activity.this, Main16Activity.class );
                startActivity(i);

            }
        });

    }
}
