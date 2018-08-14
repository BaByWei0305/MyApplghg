package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class RenzhengActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar toolbar_1;
    private ImageView img_chuan;
    private Button but;

    protected void initView() {
        toolbar_1 = (Toolbar) findViewById(R.id.toolbar_1);
        img_chuan = (ImageView) findViewById(R.id.img_chuan);
        but = (Button) findViewById(R.id.but);

        but.setOnClickListener(this);

        initData();
    }

    private void initData() {

        toolbar_1.setTitle("");
        setSupportActionBar(toolbar_1);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar_1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {

        return R.layout.renzhengactivity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:

                break;
        }
    }
}
