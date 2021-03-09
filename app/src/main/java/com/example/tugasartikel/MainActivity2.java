package com.example.tugasartikel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveHome(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);
    }

    public void moveBiodata(View view) {
        Intent b = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(b);
    }
}