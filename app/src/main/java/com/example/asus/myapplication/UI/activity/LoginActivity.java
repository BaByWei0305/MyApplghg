package com.example.asus.myapplication.UI.activity;

import android.Manifest;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.asus.myapplication.api.PermissionListener;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.LoginBean;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;
import com.example.asus.myapplication.util.SPUtil;

import java.util.List;

public class LoginActivity extends BaseActivity<HomeModel, StarPresenter> implements View.OnClickListener , HomeContract.View{

    private TextView tv_register;
    private TextView tv_close;
    private Button ton_login;
    private EditText edit_phone;
    private EditText edit_password;
    private TextView forget_password;

    @Override
    protected void initView() {
        tv_register = findViewById(R.id.tv_register);
        tv_close = findViewById(R.id.tv_close);
        ton_login = findViewById(R.id.ton_login);
        edit_phone = findViewById(R.id.edit_phone);
        edit_password = findViewById(R.id.edit_password);
        forget_password = findViewById(R.id.forget_password);
        tv_register.setOnClickListener(this);
        tv_close.setOnClickListener(this);
        ton_login.setOnClickListener(this);
        forget_password.setOnClickListener(this);

        requestRunTimePermission(new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE}, new PermissionListener() {
            @Override
            public void onGranted() {
            }

            @Override
            public void onGranted(List<String> grantedPermission) {
            }

            @Override
            public void onDenied(List<String> deniedPermission) {
            }
        });


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_register :
                Intent intent=new Intent(this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_close :
                finish();
                break;
            case R.id.ton_login :

                login();
                break;
            case R.id.forget_password :
                Intent intent1=new Intent(LoginActivity.this,ForgetActivity.class);
                startActivity(intent1);
                break;
        }
    }

    private void login() {
        String stringphone = edit_phone.getText().toString();
        String stringpassword = edit_password.getText().toString();
        if (stringpassword.length() !=0&&stringphone.length() !=0) {
            presenter.setLoginUrls(stringphone,stringpassword);
        }

    }
    @Override
    public void getLoginData(Object bean) {
        LoginBean bean1 = (LoginBean) bean;
        Log.e("LoginActivity", "bean1:" + bean1.getData().getToken());
        Log.e("LoginActivity", "bean:" + bean1.getData().getMobile()+"--id:"+bean1.getData().getId()+"bean1.getCode()"+bean1.getCode());
        if (bean1.getCode()==1) {
            Integer id = bean1.getData().getId();
            SPUtil.getInstance().put("id",id);
            Intent intent=new Intent(LoginActivity.this,SelectActivity.class);
            intent.putExtra("id",bean1.getData().getId());
            startActivity(intent);
        }
    }

    @Override
    public void getRegisterData(Object bean) {

    }
}
