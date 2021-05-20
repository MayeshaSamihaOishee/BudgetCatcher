package com.example.dell.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AutoSave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_save);
    }

    public void onceaweek(View view) {
       // Intent intent = new Intent(AutoSave.this, Analysis.class);
      //  startActivity(intent);
    }
}
