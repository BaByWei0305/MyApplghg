package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class Xingqu1Activity extends BaseActivity implements View.OnClickListener {

    private Toolbar toolBar1;
    private Button yinyue;
    private Button biao;
    private Button meishu;
    private Button wu;
    private Button baocun;

    protected void initView() {
        toolBar1 = (Toolbar) findViewById(R.id.toolBar1);
        yinyue = (Button) findViewById(R.id.yinyue);
        biao = (Button) findViewById(R.id.biao);
        meishu = (Button) findViewById(R.id.meishu);
        wu = (Button) findViewById(R.id.wu);
        baocun = (Button) findViewById(R.id.baocun);

        yinyue.setOnClickListener(this);
        biao.setOnClickListener(this);
        meishu.setOnClickListener(this);
        wu.setOnClickListener(this);
        baocun.setOnClickListener(this);

        initData();

    }

    @Override
    protected int getLayoutId() {
        return R.layout.xingqu1activity;
    }

    private void initData() {

        toolBar1.setTitle("");
        setSupportActionBar(toolBar1);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolBar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yinyue:

                break;
            case R.id.biao:

                break;
            case R.id.meishu:

                break;
            case R.id.wu:

                break;
            case R.id.baocun:

                break;
        }
    }
}
