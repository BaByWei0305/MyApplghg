package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class FengsiActivity extends BaseActivity {

    private Toolbar tool;

    protected void initView() {

        tool = (Toolbar) findViewById(R.id.tool);

        initData();
    }

    private void initData() {

        tool.setTitle("");
        setSupportActionBar(tool);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fengsiactivity;
    }
}
