package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] data = {
                    "Deepak","Rahul","Shubham","Nitin","Pritesh","Alok","Nidhi","Madhu","Jyoti","Prince","Amit"
     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter(MainActivity.this, data);


        list =  findViewById(R.id.lv);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "You Clicked at " + data[+i], Toast.LENGTH_SHORT).show();

            }
        });



    }
}