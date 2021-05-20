package com.example.dell.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_one);

    }
    public void continuee(View view) {
        Intent intent = new Intent(SignInOne.this, SignInTwo.class);
        startActivity(intent);
    }
}
