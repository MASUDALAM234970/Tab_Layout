package com.error41.tab_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout=findViewById(R.id.tabsLayout123);
        TabItem tabchats=findViewById(R.id.tabchats);
        TabItem tabStatus=findViewById(R.id.tabStatus);
        TabItem tabCals=findViewById(R.id.tabCalls);
        ViewPager viewPager=findViewById(R.id.viewpager123);



               MyPagerAdapter pagerAdapter= new MyPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

               viewPager.setAdapter(pagerAdapter);


               // It is used to join Tablelayout with

               tabLayout.setupWithViewPager(viewPager);

    }
}