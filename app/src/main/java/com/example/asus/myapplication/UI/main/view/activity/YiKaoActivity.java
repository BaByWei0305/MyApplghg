package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class YiKaoActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar toolbar_2;
    private ImageView mImg1_14;
    private Button mBut1_1;


    protected void initView() {
        toolbar_2 = (Toolbar) findViewById(R.id.toolbar_2);
        mImg1_14 = (ImageView) findViewById(R.id.mImg1_14);
        mBut1_1 = (Button) findViewById(R.id.mBut1_1);

        mBut1_1.setOnClickListener(this);

        initData();
    }

    private void initData() {

        toolbar_2.setTitle("");
        setSupportActionBar(toolbar_2);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar_2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected int getLayoutId() {
        return R.layout.yikaoactivity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mBut1_1:

                break;
        }
    }
}
