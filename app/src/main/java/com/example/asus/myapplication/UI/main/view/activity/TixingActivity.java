package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class TixingActivity extends BaseActivity {

    private Toolbar too;
    private TextView dingdan;
    private TextView zan;
    private TextView pinglun;
    private TextView zuoye1;
    private TextView tuandui;
    private TextView guanzhu;


    protected void initView() {
        too = (Toolbar) findViewById(R.id.too);
        dingdan = (TextView) findViewById(R.id.dingdan);
        zan = (TextView) findViewById(R.id.zan);
        pinglun = (TextView) findViewById(R.id.pinglun);
        zuoye1 = (TextView) findViewById(R.id.zuoye1);
        tuandui = (TextView) findViewById(R.id.tuandui);
        guanzhu = (TextView) findViewById(R.id.guanzhu);

        initData();
    }

    private void initData() {

        too.setTitle("");
        setSupportActionBar(too);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        too.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.tixingactivity;
    }
}
