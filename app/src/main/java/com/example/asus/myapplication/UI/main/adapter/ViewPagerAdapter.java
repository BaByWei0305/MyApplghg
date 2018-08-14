package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter{
    private List<String> string_tab;
    private List<Fragment> fragmentList;
    public ViewPagerAdapter(FragmentManager fm, List<String> string_tab, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
        this.string_tab=string_tab;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return string_tab.get(position);

    }
}
