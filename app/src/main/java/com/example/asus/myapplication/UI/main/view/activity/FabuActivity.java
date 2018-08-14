package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class FabuActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar mTool_3;
    private TextView tv1_6;
    private ImageView mImg1_14;
    private TextView mTv1_1;
    private Button mBut1_1;

    protected void initView() {
        mTool_3 = (Toolbar) findViewById(R.id.mTool_3);
        tv1_6 = (TextView) findViewById(R.id.tv1_6);
        mImg1_14 = (ImageView) findViewById(R.id.mImg1_14);
        mTv1_1 = (TextView) findViewById(R.id.mTv1_1);
        mBut1_1 = (Button) findViewById(R.id.mBut1_1);

        mBut1_1.setOnClickListener(this);

        initData();
    }

    private void initData() {

        mTool_3.setTitle("");
        setSupportActionBar(mTool_3);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mTool_3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fabuactivity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mBut1_1:

                break;
        }
    }
}
