package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class ZuopingActivity extends BaseActivity {

    private Toolbar toolbar_3;

    protected void initView() {
        toolbar_3 = (Toolbar) findViewById(R.id.toolbar_3);

        initData();
    }

    private void initData() {

        toolbar_3.setTitle("");
        setSupportActionBar(toolbar_3);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar_3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.zuopingactivity;
    }
}
