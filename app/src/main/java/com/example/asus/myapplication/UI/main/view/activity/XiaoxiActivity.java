package com.example.asus.myapplication.UI.main.view.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class XiaoxiActivity extends BaseActivity {


    private Toolbar mTool_5;

    @Override
    protected void initView() {

        mTool_5 = (Toolbar) findViewById(R.id.mTool_5);

        initData();
    }

    private void initData() {

        mTool_5.setTitle("");
        setSupportActionBar(mTool_5);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mTool_5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.xiaoxiactivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}
