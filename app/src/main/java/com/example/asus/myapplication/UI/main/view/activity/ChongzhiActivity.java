package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class ChongzhiActivity extends BaseActivity {

    private TextView zd;
    private Toolbar tool_xin;


    protected void initView() {
        zd = (TextView) findViewById(R.id.zd);
        tool_xin = (Toolbar) findViewById(R.id.tool_xin);

        initData();
    }

    private void initData() {

        tool_xin.setTitle("");
        setSupportActionBar(tool_xin);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tool_xin.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected int getLayoutId() {
        return R.layout.chongzhiactivity;
    }
}
