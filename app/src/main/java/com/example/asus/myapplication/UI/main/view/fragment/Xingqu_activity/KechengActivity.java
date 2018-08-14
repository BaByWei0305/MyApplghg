package com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.adapter.WorksViewPagerAdapter;
import com.example.asus.myapplication.UI.main.view.fragment.mains_fragment.FuyongFragment;

import java.util.ArrayList;
import java.util.List;


public class KechengActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager viewpager;
    private List<Fragment> fragments;
    private List<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__kecheng__tuijian_);
        initView();
        initData();
    }

    private void initData() {
        fragments=new ArrayList<>();
        fragments.add(new FuyongFragment());
        fragments.add(new FuyongFragment());

        title=new ArrayList<>();
        title.add("视频");
        title.add("直播");

        WorksViewPagerAdapter adapter = new WorksViewPagerAdapter(getSupportFragmentManager(), title, fragments);
        viewpager.setAdapter(adapter);
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        tab.setupWithViewPager(viewpager);
    }
}
