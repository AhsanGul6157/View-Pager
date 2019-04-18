package com.example.viewpager;

import android.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Switch;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int noOfTabs;


    public ViewPagerAdapter(FragmentManager fm, int noOfTabs ) {
        super(fm);
        this.noOfTabs = noOfTabs;

    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
               Tab1 tab1 = new Tab1();
               return tab1;

            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;


            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;

            case 4:
                Tab5 tab5 = new Tab5();
                return tab5;


            case 5:
                Tab6 tab6 = new Tab6();
                return tab6;

             default:
                return null;

//            return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
