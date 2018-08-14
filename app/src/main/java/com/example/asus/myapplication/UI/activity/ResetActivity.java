package com.example.asus.myapplication.UI.activity;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.MimaBean;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;


public class ResetActivity extends BaseActivity<HomeModel, StarPresenter> implements HomeContract.View{

    private Toolbar toolbar;
    private EditText edit_mima;
    private EditText edit_qmima;
    private TextView tv_wancheng;

    @Override
    protected void initView() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        edit_mima = findViewById(R.id.edit_mima);
        edit_qmima = findViewById(R.id.edit_qmima);
        tv_wancheng = findViewById(R.id.tv_wancheng);
        tv_wancheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mima = edit_mima.getText().toString();
                String qmima = edit_qmima.getText().toString();
                if (mima.equals(qmima)&&qmima.equals(mima)) {
                    presenter.setMimaUrls("13931424057",mima);
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reset;
    }

    @Override
    public void getLoginData(Object bean) {
        MimaBean bean1 = (MimaBean) bean;
        if (bean1.getMessage().equals("成功")) {
            Toast.makeText(this, "更改成功", Toast.LENGTH_SHORT).show();
        }
        Log.e("ResetActivity", "bean1:" + bean1.getMessage());
    }

    @Override
    public void getRegisterData(Object bean) {

    }
}
