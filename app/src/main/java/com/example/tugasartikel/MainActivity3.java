package com.example.tugasartikel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveArtikel(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(a);
    }

    public void moveHome(View view) {
        Intent b = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(b);
    }
}