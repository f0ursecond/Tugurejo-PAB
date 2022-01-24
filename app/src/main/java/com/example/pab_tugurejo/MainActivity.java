package com.example.pab_tugurejo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout userId;
    private TextInputLayout pass;
    private TextInputEditText userEdt;
    private TextInputEditText passEdt;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userId = (TextInputLayout) findViewById(R.id.userId);
        pass = (TextInputLayout) findViewById(R.id.pass);
        userEdt = (TextInputEditText) findViewById(R.id.userEdt);
        passEdt = (TextInputEditText) findViewById(R.id.passEdt);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if (userEdt.getText().toString().equals("00450") && passEdt.getText().toString().equals("admin")){
               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
            }  else {
                //Toast.makeText(MainActivity.this,"User id & Password salah",Toast.LENGTH_LONG).show();
            }



           }
        });



    }

}