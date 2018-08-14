package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class GuanzhuActivity extends BaseActivity {


    private Toolbar t;
    private Button bt_ed_dialog_off;

    @Override
    protected void initView() {

        t = (Toolbar) findViewById(R.id.t);

        initData();
    }

    private void initData() {

        t.setTitle("");
        setSupportActionBar(t);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        t.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.guanzhuactivity;
    }
}
