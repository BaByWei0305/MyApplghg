package com.example.asus.myapplication.UI.main;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.view.fragment.ArtFragment;
import com.example.asus.myapplication.UI.main.view.fragment.MainFragment;
import com.example.asus.myapplication.UI.main.view.fragment.MineFragment;
import com.example.asus.myapplication.UI.main.view.fragment.ScheduleFragment;
import com.example.asus.myapplication.UI.main.view.fragment.WorksFragment;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainPageActivity extends mBaseActivity {

    public static BottomTabBar mBottomTabBar;

    @Override
    protected void initView() {
        mBottomTabBar = findViewById(R.id.bottom_tab_bar);
        //底部导航栏
        mBottomTabBar.init(getSupportFragmentManager())
                /*.setImgSize(35, 35)*/
                .setFontSize(10)
                /*.setChangeColor(Color.RED, Color.GRAY)*/
                .addTabItem("首页", R.mipmap.fristming, R.mipmap.fristhui, MainFragment.class) //前面第一个是点击后的图片，第二个是点击前的图片
                .addTabItem("日程表", R.mipmap.secondming, R.mipmap.secondlesson, ScheduleFragment.class)
                .addTabItem("交作品", R.mipmap.stujiaozuoye,R.mipmap.stujiaozuoye, WorksFragment.class)
                .addTabItem("艺术圈", R.mipmap.yishulianmeng, R.mipmap.yishuquan, ArtFragment.class)
                .addTabItem("我的", R.mipmap.wodelianmeng, R.mipmap.wodelianui, MineFragment.class)
                .isShowDivider(false);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_page;
    }
}
