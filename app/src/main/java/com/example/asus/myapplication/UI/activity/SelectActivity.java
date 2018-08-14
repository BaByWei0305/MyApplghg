package com.example.asus.myapplication.UI.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.ItlBean;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;
import com.example.asus.myapplication.UI.main.MainPageActivity;


public class SelectActivity extends BaseActivity<HomeModel, StarPresenter> implements View.OnClickListener ,HomeContract.View{

    private LinearLayout layout_a;
    private LinearLayout layout_b;
    private ImageView img_jinru;
    private ImageView img_fanhui;
    private ImageView img;
    private EditText edit_yaoma;
    private TextView text_add;

    @Override
    protected void initView() {
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        Log.e("SelectActivity", id+"");
        presenter.setItlUrls(id);
        layout_a = findViewById(R.id.layout_a);
        layout_b = findViewById(R.id.layout_b);
        img_jinru = findViewById(R.id.img_jinru);
        img_fanhui = findViewById(R.id.img_fanhui);
        img = findViewById(R.id.img);
        text_add = findViewById(R.id.text_add);
        edit_yaoma = findViewById(R.id.edit_yaoma);
        img_jinru.setOnClickListener(this);
        img_fanhui.setOnClickListener(this);
        img.setOnClickListener(this);
        text_add.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_select;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_jinru :
                layout_a.setVisibility(View.GONE);
                layout_b.setVisibility(View.VISIBLE);
                break;
            case R.id.img_fanhui :
                layout_a.setVisibility(View.VISIBLE);
                layout_b.setVisibility(View.GONE);
                break;
            case R.id.img :
                Intent intent = new Intent(this,MainPageActivity.class);
                startActivity(intent);
                break;
            case R.id.text_add :
                initadd();
                break;
        }
    }

    private void initadd() {
        String yaoqingma = edit_yaoma.getText().toString();
        presenter.setItlUrls(Integer.parseInt(yaoqingma));
    }

    @Override
    public void getLoginData(Object bean) {
        ItlBean bean1 = (ItlBean) bean;
        if (bean1 != null) {
            Glide.with(this)
                    .load(bean1.getData().get(0).getOrgCover())
                    .into(img);//正常加载图片
            Log.e("SelectActivity", "bean1:" + bean1.getData().get(0).getOrganizationName());
        }


    }

    @Override
    public void getRegisterData(Object bean) {

    }
}
