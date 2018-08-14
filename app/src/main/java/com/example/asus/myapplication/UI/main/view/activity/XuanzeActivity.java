package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class XuanzeActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar mTool;
    private Button mBut1;
    private Button mBut2;


    protected void initView() {
        mTool = (Toolbar) findViewById(R.id.mTool);
        mBut1 = (Button) findViewById(R.id.mBut1);
        mBut2 = (Button) findViewById(R.id.mBut2);

        mBut1.setOnClickListener(this);
        mBut2.setOnClickListener(this);

        initData();
    }

    private void initData() {

        mTool.setTitle("");
        setSupportActionBar(mTool);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mTool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.xuanzeactivity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mBut1:

                break;
            case R.id.mBut2:

                break;
        }
    }
}