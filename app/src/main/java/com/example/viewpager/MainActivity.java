package com.example.viewpager;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener,Tab4.OnFragmentInteractionListener,Tab5.OnFragmentInteractionListener,Tab6.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      TabLayout tabLayout = findViewById(R.id.tablayout);
      tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.addTab(tabLayout.newTab().setText("FoodPandaApp"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        //now setting the pager view
        final ViewPager viewPager = findViewById(R.id.pager);
    final ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
    viewPager.setAdapter(adapter);
    viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
