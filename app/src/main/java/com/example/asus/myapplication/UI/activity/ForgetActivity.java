package com.example.asus.myapplication.UI.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.CodeBean;
import com.example.asus.myapplication.bean.MyCountDownTimer;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;


public class ForgetActivity extends BaseActivity<HomeModel, StarPresenter> implements HomeContract.View{

    private Toolbar toolbar;
    private EditText edit_mphone;
    private EditText edit_code;
    private TextView tv_next;
    private TextView tv_myan;
    private String stringmphone;

    @Override
    protected void initView() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        edit_mphone = findViewById(R.id.edit_mphone);
        edit_code = findViewById(R.id.edit_code);
        tv_myan = findViewById(R.id.tv_myan);
        tv_myan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_mphone.length()!=0) {
                    final MyCountDownTimer myCountDownTimer = new MyCountDownTimer(60000,1000,tv_myan);
                    myCountDownTimer.start();
                    stringmphone = edit_mphone.getText().toString();
                    String stringmcode = edit_code.getText().toString();
                    if (stringmphone.length() != 0) {
                        presenter.setCodeUrls("000","+86", stringmphone);

                    }else {
                        Toast.makeText(ForgetActivity.this, "手机号错误", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(ForgetActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                }

            }
        });
        tv_next = findViewById(R.id.tv_next);
        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setCellphoneUrls(stringmphone);
            }
        });
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget;
    }

    @Override
    public void getLoginData(Object bean) {
        CodeBean bean1 = (CodeBean) bean;
        Log.e("ForgetActivity", "bean1:" + bean1.getMessage());
        Toast.makeText(ForgetActivity.this, bean1.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getRegisterData(Object bean) {
        CodeBean bean1 = (CodeBean) bean;
        Log.e("ForgetActivity", "bean1:" + bean1.getMessage());
        if (bean1.getMessage().equals("此号码已被注册，请直接登录")) {
            Intent intent=new Intent(ForgetActivity.this,ResetActivity.class);
            startActivity(intent);
        }
        Toast.makeText(ForgetActivity.this, bean1.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
