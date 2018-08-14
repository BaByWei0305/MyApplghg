package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class WorksViewPagerAdapter extends FragmentPagerAdapter{
    private List<String> worksstring;
    private List<Fragment> fragments;
    public WorksViewPagerAdapter(FragmentManager fm, List<String> worksstring, List<Fragment> fragments) {
        super(fm);
        this.worksstring=worksstring;
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
        return worksstring.get(position);
    }
}
