package com.example.asus.myapplication.UI.main.view.fragment;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.adapter.WorksViewPagerAdapter;
import com.example.asus.myapplication.UI.main.base.mBaseFragment;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.activity.FabuActivity;
import com.example.asus.myapplication.UI.main.view.activity.XiaoxiActivity;
import com.example.asus.myapplication.UI.main.view.fragment.works_fragment.mWorksFragment;

import java.util.ArrayList;
import java.util.List;

public class WorksFragment extends mBaseFragment<MainModel, MainPresenter> implements View.OnClickListener {

    private String mParam1;
    private String mParam2;
    private ViewPager works_viewpager;
    private TabLayout works_tablayout;
    private List<String> worksstring = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();
    private ImageView img1;
    private ImageView img2;


    @Override
    protected void initView(View inflate) {
        works_viewpager = inflate.findViewById(R.id.works_viewpager);
        works_tablayout = inflate.findViewById(R.id.works_tablayout);
        img1 = inflate.findViewById(R.id.img1);
        img2 = inflate.findViewById(R.id.img2);
        worksstring.add("智能筛选");
        worksstring.add("偷听最多");
        worksstring.add("最新点评");
        for (int i = 0; i < worksstring.size(); i++) {
            fragments.add(mWorksFragment.newInstance(worksstring.get(i), i + ""));
        }
        WorksViewPagerAdapter works_viewPager_adapter = new WorksViewPagerAdapter(getChildFragmentManager(), worksstring, fragments);
        works_viewpager.setAdapter(works_viewPager_adapter);
        works_tablayout.setupWithViewPager(works_viewpager);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_works;
    }

    @Override
    public void onClick(View v) {

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), FabuActivity.class);
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), XiaoxiActivity.class);
                startActivity(intent);
            }
        });
    }
}
