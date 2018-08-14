package com.example.asus.myapplication.UI.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.CodeBean;
import com.example.asus.myapplication.bean.MyCountDownTimer;
import com.example.asus.myapplication.bean.RegisterBean;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;


public class RegisterActivity extends BaseActivity<HomeModel, StarPresenter> implements View.OnClickListener , HomeContract.View {

    private ImageView image_fanhui;
    private TextView text_qianzhui;
    private EditText sr_phone;
    private EditText sr_yanzheng;
    private TextView yanzheng;
    private Button ton_zhuce;
    private String message;

    @Override
    protected void initView() {
        image_fanhui = findViewById(R.id.image_fanhui);
        text_qianzhui = findViewById(R.id.text_qianzhui);
        sr_phone = findViewById(R.id.sr_phone);
        sr_yanzheng = findViewById(R.id.sr_yanzheng);
        yanzheng = findViewById(R.id.yanzheng);
        ton_zhuce = findViewById(R.id.ton_zhuce);
        image_fanhui.setOnClickListener(this);
        yanzheng.setOnClickListener(this);
        ton_zhuce.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.image_fanhui :
                finish();
                break;
            case R.id.yanzheng :
                inityanzheng();
                break;
            case R.id.ton_zhuce :
                inzhuce();
                break;

        }
    }

    private void inzhuce() {
        String stringyanzheng = sr_yanzheng.getText().toString();
        String stringphone = sr_phone.getText().toString();
        if (stringphone.length() != 0&&stringyanzheng.length()!=0) {
            presenter.setRegisterUrls(stringphone,stringyanzheng);

        }
    }

    private void inityanzheng() {
        String stringphone = sr_phone.getText().toString();
        if (stringphone.length()!=0) {
            Log.e("stringphone", stringphone);
            presenter.setCodeUrls("000","+86",stringphone);
            final MyCountDownTimer myCountDownTimer = new MyCountDownTimer(60000,1000,yanzheng);
            myCountDownTimer.start();
        }
        else
        {
            Toast.makeText(this, "不能为空", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void getLoginData(Object bean) {
        CodeBean bean1 = (CodeBean) bean;
        String message = bean1.getMessage();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.e("RegisterActivity", "bean1:" + message);
    }

    @Override
    public void getRegisterData(Object bean) {
        RegisterBean bean1 = (RegisterBean) bean;
        message = bean1.getMessage();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.e("RegisterActivity", "RegisterBean:" + message);
        if (bean1.getMessage().equals("成功")) {
            Intent intent = new Intent(RegisterActivity.this,CompletionActivity.class);
            intent.putExtra("phone",sr_phone.getText().toString());
            startActivity(intent);
        }
    }
}
