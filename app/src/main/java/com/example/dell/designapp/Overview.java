package com.example.dell.designapp;


import android.content.Intent;
import android.os.Bundle;
//import android.support.design.widget.TabLayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

import com.example.dell.designapp.adapter.ViewPagerAdapter;
import com.example.dell.designapp.fragment.AllowancesFragment;
import com.example.dell.designapp.fragment.BillsFragment;
import com.example.dell.designapp.fragment.ExpensesFragment;

public class Overview extends AppCompatActivity {

    Toolbar toolBar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager) findViewById(R.id.viewPager);

        setSupportActionBar(toolBar);
        setDataToViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

   private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BillsFragment(), "Bills");
        adapter.addFragment(new AllowancesFragment(), "Allowances");
       adapter.addFragment(new ExpensesFragment(), "Expenses");
        viewPager.setAdapter(adapter);
    }

    public void setgasbudget(View view) {
        Intent intent = new Intent(Overview.this, AllowancesSetBudget.class);
        startActivity(intent);
    }
}
