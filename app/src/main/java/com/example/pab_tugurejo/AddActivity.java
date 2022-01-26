package com.example.pab_tugurejo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class AddActivity extends AppCompatActivity {

    TextInputEditText nama_input, rt_input, rw_input;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        nama_input = findViewById(R.id.nama_input);
        rt_input = findViewById(R.id.rt_input);
        rw_input = findViewById(R.id.rw_input);
        addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}