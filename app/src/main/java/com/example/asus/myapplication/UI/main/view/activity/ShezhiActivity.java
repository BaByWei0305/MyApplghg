package com.example.asus.myapplication.UI.main.view.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;

public class ShezhiActivity extends BaseActivity {

    private Toolbar too;
    private ImageView id_Img5;
    private ImageView id_Img1_5;
    private ImageView id_Img1_4;
    private ImageView id_Img1_3;
    private ImageView id_Img_1_2;
    private ImageView id_Img1_1;

    protected void initView() {
        too = (Toolbar) findViewById(R.id.too);
        id_Img5 = (ImageView) findViewById(R.id.id_Img5);
        id_Img1_5 = (ImageView) findViewById(R.id.id_Img1_5);
        id_Img1_4 = (ImageView) findViewById(R.id.id_Img1_4);
        id_Img1_3 = (ImageView) findViewById(R.id.id_Img1_3);
        id_Img_1_2 = (ImageView) findViewById(R.id.id_Img_1_2);
        id_Img1_1 = (ImageView) findViewById(R.id.id_Img1_1);

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
        return R.layout.shezhiactivity;
    }
}
