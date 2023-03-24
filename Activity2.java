package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button kembali;
    Button aktifiti3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        aktifiti3=findViewById(R.id.aktifiti3);
        aktifiti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity3.class));
            }
        });

        kembali=findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();
            }
        });

    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "aktifiti di lihat", Toast.LENGTH_LONG).show();
        super.onPause();
    }
}