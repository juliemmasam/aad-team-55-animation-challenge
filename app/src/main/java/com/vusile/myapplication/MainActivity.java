package com.vusile.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vusile.myapplication.animals.AnimalsActivity;
import com.vusile.myapplication.lakes.LakesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAnimalActivity(View view) {
        Intent i = new Intent(this, AnimalsActivity.class);
        startActivity(i);
    }

    public void startLakesActivity(View view) {
        Intent i = new Intent(this, LakesActivity.class);
        startActivity(i);
    }
}
