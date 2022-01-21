package com.example.pab_tugurejo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ListView list = (ListView) findViewById(R.id.ListView);

        HashMap<String, String> nameAddresses = new HashMap<>();
        nameAddresses.put("Budi Haryanto", "RT 5/RW 2");
        nameAddresses.put("Sri Mulyani", "RT 3/RW 2");
        nameAddresses.put("Rosniati Harefa", "RT 5/RW 1");
        nameAddresses.put("Sugiyono", "RT 5/RW 2");
        nameAddresses.put("Sukarman", "RT 2/RW 2");
        nameAddresses.put("Shroud", "RT 1/RW 2");
        nameAddresses.put("Didick", "RT 5/RW 2");
        nameAddresses.put("Adi", "RT 3/RW 2");
        nameAddresses.put("Bagong", "RT 5/RW 1");
        nameAddresses.put("Rian", "RT 5/RW 2");
        nameAddresses.put("Bambang", "RT 2/RW 2");
        nameAddresses.put("Tenz", "RT 1/RW 2");
        nameAddresses.put("Hanto", "RT 5/RW 2");
        nameAddresses.put("jul", "RT 3/RW 2");
        nameAddresses.put("Rosniati ", "RT 5/RW 1");
        nameAddresses.put("Umar", "RT 5/RW 2");
        nameAddresses.put("BIN", "RT 2/RW 2");
        nameAddresses.put("eeyore", "RT 1/RW 2");
        nameAddresses.put("David", "RT 5/RW 2");
        nameAddresses.put("Rizky", "RT 3/RW 2");
        nameAddresses.put("Bayu", "RT 5/RW 1");
        nameAddresses.put("Emi Fukada", "RT 5/RW 2");
        nameAddresses.put("Mia Khalifa", "RT 2/RW 2");
        nameAddresses.put("Lana Rhoades", "RT 1/RW 2");


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


    }
}