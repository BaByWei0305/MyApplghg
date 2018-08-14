package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class TieziActivity extends BaseActivity {

    private Toolbar toolbar_4;



    protected void initView() {
        toolbar_4 = (Toolbar) findViewById(R.id.toolbar_4);

        initData();
    }

    private void initData() {

        toolbar_4.setTitle("");
        setSupportActionBar(toolbar_4);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar_4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.tieziactivity;
    }
}
