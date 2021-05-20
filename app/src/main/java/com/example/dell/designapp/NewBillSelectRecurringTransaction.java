package com.example.dell.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewBillSelectRecurringTransaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bill_select_recurring_transaction);
    }

    public void selecttransaction(View view) {
        Intent intent = new Intent(NewBillSelectRecurringTransaction.this, CategoryTransactions.class);
        startActivity(intent);
    }
}
