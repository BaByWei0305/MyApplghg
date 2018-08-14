package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.asus.myapplication.UI.main.beans.ListingBean;

import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter{
    private List<ListingBean> tab_name;
    private List<Fragment> fragments;
    public PagerAdapter(FragmentManager fm, List<ListingBean> tab_name, List<Fragment> fragments) {
        super(fm);
        this.tab_name=tab_name;
        this.fragments=fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab_name.get(position).getTab_name();
    }
}
