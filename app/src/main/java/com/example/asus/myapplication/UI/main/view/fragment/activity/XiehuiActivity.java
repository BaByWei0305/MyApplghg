package com.example.asus.myapplication.UI.main.view.fragment.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;


import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.adapter.PagerAdapter;
import com.example.asus.myapplication.UI.main.beans.ListingBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.view.fragment.mains_fragment.mMains_Fragment;

import java.util.ArrayList;
import java.util.List;

public class XiehuiActivity extends mBaseActivity {

    private TabLayout mains_tablayout;
    private ViewPager mains_viewpager;
    private List<ListingBean> tab_name=new ArrayList<>();
    private List<Fragment> fragments=new ArrayList<>();


    @Override
    protected void initView() {
        mains_tablayout = findViewById(R.id.mains_tablayout);
        mains_viewpager = findViewById(R.id.mains_viewpager);
        tab_name.add(new ListingBean("顾问","4"));
        tab_name.add(new ListingBean("名师","3"));
        tab_name.add(new ListingBean("导师","6"));
        tab_name.add(new ListingBean("达人","2"));
        for (int i = 0; i < tab_name.size(); i++) {
            fragments.add(mMains_Fragment.newInstance(tab_name.get(i).getTab_id(),""));
        }
        PagerAdapter mains_pager_adapter = new PagerAdapter(getSupportFragmentManager(),tab_name,fragments);
        mains_viewpager.setAdapter(mains_pager_adapter);
        mains_tablayout.setupWithViewPager(mains_viewpager);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mains;
    }
}
