package com.example.asus.myapplication.UI.main.view.activity;


import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.makeramen.roundedimageview.RoundedImageView;

public class DianjiActivity extends BaseActivity implements View.OnClickListener {

    private RoundedImageView user_img;
    private TextView bianji;
    private RoundedImageView fanhui;

    protected void initView() {
        user_img = (RoundedImageView) findViewById(R.id.user_img);
        bianji = (TextView) findViewById(R.id.bianji);
        fanhui = (RoundedImageView) findViewById(R.id.fanhui);

        bianji.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dianjiactivity;
    }

    @Override
    public void onClick(View v) {

        bianji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DianjiActivity.this, WodeActivity.class);
                startActivity(intent);
            }
        });
    }

}
