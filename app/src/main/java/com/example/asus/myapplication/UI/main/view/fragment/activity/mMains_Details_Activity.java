package com.example.asus.myapplication.UI.main.view.fragment.activity;

import android.content.Intent;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.TeacherBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;


public class mMains_Details_Activity extends mBaseActivity<MainModel,MainPresenter> implements MainContract.View{

    private ImageView mains_details_img;
    private ImageView masterdetail_teacherimg;
    private TextView masterdetail_logtime;
    private TextView masterdetail_teachername;
    private TextView masterdetail_teacherintro;
    private TextView mains_details_kecheng;
    private TextView mains_details_fensi;
    private WebView mains_details_webview;
    public static int id;
    private ImageView masterdetail_teachertype;

    @Override
    protected void initView() {
        Intent intent = getIntent();
        int teacherId = intent.getIntExtra("teacherId", 0);
        id=teacherId;
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        presenter.setTeacherUrl(String.valueOf(id),String.valueOf(teacherId),token);
        mains_details_img = findViewById(R.id.mains_details_img);
        masterdetail_teacherimg = findViewById(R.id.masterdetail_teacherimg);
        masterdetail_logtime = findViewById(R.id.masterdetail_logtime);
        masterdetail_teachername = findViewById(R.id.masterdetail_teachername);
        masterdetail_teacherintro = findViewById(R.id.masterdetail_teacherintro);
        mains_details_kecheng = findViewById(R.id.mains_details_kecheng);
        mains_details_fensi = findViewById(R.id.mains_details_fensi);
        mains_details_webview = findViewById(R.id.mains_details_webview);
        masterdetail_teachertype = findViewById(R.id.masterdetail_teachertype);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_m_mains__details_;
    }

    @Override
    public void getMainData(Object bean) {
        TeacherBean bean1 = (TeacherBean) bean;
        Log.e("mMains_Details_Activity", "bean1:" + bean1.getMessage());
        initData(bean1);
    }

    private void initData(TeacherBean bean1) {
        Glide.with(this).load(bean1.getData().getUser().getImages()).into(mains_details_img);
        Glide.with(this).load(bean1.getData().getUser().getPhoto()).into(masterdetail_teacherimg);
        masterdetail_logtime.setText(bean1.getData().getUser().getSkilled());
        masterdetail_teachername.setText(bean1.getData().getUser().getNickname());
        masterdetail_teacherintro.setText(bean1.getData().getUser().getRealname());
        mains_details_kecheng.setText(bean1.getData().getLiveCount()+"");
        mains_details_fensi.setText(bean1.getData().getFansCount()+"");
        WebSettings settings = mains_details_webview.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(true);
        mains_details_webview.loadUrl("http://share.univstar.com/view/teacher.html?teacherId="+id);

        mains_details_webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                mains_details_webview.loadUrl("http://share.univstar.com/view/teacher.html?teacherId="+id);

                return true;
            }
        });

        switch (bean1.getData().getUser().getUserType())
        {
            case 2:
                Glide.with(this)
                        .load(R.mipmap.daren)
                        .into(masterdetail_teachertype);
                break;
            case 3:
                Glide.with(this)
                        .load(R.mipmap.home_level_vip_yellow)
                        .into(masterdetail_teachertype);
                break;
            case 4:
                Glide.with(this)
                        .load(R.mipmap.home_level_vip_red)
                        .into(masterdetail_teachertype);
                break;
            case 6:
                Glide.with(this)
                        .load(R.mipmap.home_level_vip_blue)
                        .into(masterdetail_teachertype);
                break;
        }

    }
}
