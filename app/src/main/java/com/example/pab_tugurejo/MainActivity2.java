package com.example.pab_tugurejo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    private EditText search_bar;
    private FloatingActionButton tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ListView list = (ListView) findViewById(R.id.ListView);
        SearchView searchView = (SearchView) findViewById(R.id.search_bar);
//        tombol = (FloatingActionButton) findViewById(R.id.tombol);

//        tombol.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity2.this, AddActivity.class);
//                startActivity(intent);
//            }
//        });




        HashMap<String, String> nameAddresses = new HashMap<>();

        nameAddresses.put("Budi Haryanto", "RT 5/RW 2");
        nameAddresses.put("Sri Mulyani", "RT 3/RW 2");
        nameAddresses.put("Rosniati Harefa", "RT 5/RW 1");
        nameAddresses.put("Sugiyono", "RT 5/RW 2");
        nameAddresses.put("Sukarman", "RT 2/RW 2");



        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});


        Iterator it = nameAddresses.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
        }

        list.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                adapter.getFilter().filter(newText);
                return false;
            }
        });



    }

}