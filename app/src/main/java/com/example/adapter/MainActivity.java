package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//ListView listview;
SearchView searchview;
ArrayList<String> list;
ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.lv1);
        searchview = (SearchView) findViewById(R.id.searchView);
        ArrayList<String> list=new ArrayList<>();

        list.add("MAD");
        list.add("MAD");
        list.add("MAD");
        list.add("pp");
        list.add("MAD");
        list.add("MAD");
        list.add("pp");
        list.add("MAD");
        list.add("MAD");
        list.add("MAD");
        list.add("DS");
        list.add("pf");
        list.add("MAD");
        list.add("MAD");
        list.add("MAD");
        list.add("DS");
        list.add("PP");
        list.add("SDA");
        list.add("english");
        list.add("math");
        list.add("pf");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
        listview.setAdapter(adapter);

        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(list.contains(query))
                {
                    adapter.getFilter().filter(query);

                }
                else
                    Toast.makeText(MainActivity.this,"Data Not Found",Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(list.contains(newText))
                {
                    adapter.getFilter().filter(newText);

                }
                else
                    Toast.makeText(MainActivity.this,"Data Not Found",Toast.LENGTH_LONG).show();

                return false;
            }
        });
    }
}