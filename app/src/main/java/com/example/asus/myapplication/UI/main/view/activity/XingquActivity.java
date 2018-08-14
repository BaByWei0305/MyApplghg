package com.example.asus.myapplication.UI.main.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.UI.activity.LoginActivity;
import com.example.asus.myapplication.UI.main.adapter.MyAdapter;
import com.example.asus.myapplication.UI.main.adapter.Adapter1;
import com.example.asus.myapplication.UI.main.beans.AccessPreferences;

import java.util.List;

public class XingquActivity extends BaseActivity {

    private TextView tiao;
    private Toolbar tool4;
    private GridView grid;
    private GridView grid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xingquactivity);
        initView();

        initData();
    }

    private void initData() {

        tool4.setTitle("");
        setSupportActionBar(tool4);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tool4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(XingquActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
//        presenter.getAccess_preferences();
    }


    protected void initView() {
        tiao = (TextView) findViewById(R.id.tiao);
        tool4 = (Toolbar) findViewById(R.id.tool4);
        grid = (GridView) findViewById(R.id.grid);
        grid1 = (GridView) findViewById(R.id.grid1);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.xingquactivity;
    }
    public void setAccessPreferences(AccessPreferences accessPreferences) {

        List<AccessPreferences.DataBean.MajorsBean> majors = accessPreferences.getData().getMajors();
        List<AccessPreferences.DataBean.CollegesBean> colleges = accessPreferences.getData().getColleges();

        MyAdapter myAdapter = new MyAdapter(majors, this);
        grid.setAdapter(myAdapter);

        Adapter1 myAdapter_1 = new Adapter1(majors, this);
        grid.setAdapter(myAdapter_1);
    }
}
