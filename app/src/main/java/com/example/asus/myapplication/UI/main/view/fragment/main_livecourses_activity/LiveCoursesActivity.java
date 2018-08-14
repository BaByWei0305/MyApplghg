package com.example.asus.myapplication.UI.main.view.fragment.main_livecourses_activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.LiveCoursesBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.fragment.activity.mMains_Details_Activity;
import com.makeramen.roundedimageview.RoundedImageView;

public class LiveCoursesActivity extends mBaseActivity<MainModel, MainPresenter> implements MainContract.View{

    private ImageView main_livecourses_img;
    private RoundedImageView masterdetail_teacherimg;
    private TextView main_livcourses_time;
    private TextView main_livecourses_price;
    private TextView masterdetail_teachername;
    private TextView masterdetail_teacherintro;
    private WebView webview;

    @Override
    protected void initView() {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        Intent intent = getIntent();
        int id1 = intent.getIntExtra("id", 1);
        Log.e("Main_liveCourses_Activi", "id1:--------" + id1);
        presenter.setLiveCoursesUrl(String.valueOf(id),String.valueOf(id1),token);
        main_livecourses_img = findViewById(R.id.main_livecourses_img);
        masterdetail_teacherimg = findViewById(R.id.masterdetail_teacherimg);
        main_livcourses_time = findViewById(R.id.main_livcourses_time);
        main_livecourses_price = findViewById(R.id.main_livecourses_price);
        masterdetail_teachername = findViewById(R.id.masterdetail_teachername);
        masterdetail_teacherintro = findViewById(R.id.masterdetail_teacherintro);
        webview = findViewById(R.id.webview);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_live_courses_;

    }

    @Override
    public void getMainData(Object bean) {
        LiveCoursesBean bean1 = (LiveCoursesBean) bean;
        Log.e("Main_liveCourses_Activi", "bean1课程推荐:" + bean1.getMessage());
        LiveCoursesBean.DataBean data = bean1.getData();
        initData(data);
    }

    private void initData(final LiveCoursesBean.DataBean data) {
        Glide.with(this).load(data.getCoverImg()).into(main_livecourses_img);
        Glide.with(this).load(data.getPhoto()).into(masterdetail_teacherimg);
        String timeData = TimeShift.getTimeData(data.getStartDate());
        main_livcourses_time.setText(timeData);
        main_livecourses_price.setText(data.getPrice()+"");
        masterdetail_teachername.setText(data.getNickname());
        masterdetail_teacherintro.setText(data.getRealname());

        webview.loadDataWithBaseURL(null,data.getContent(),"text/html","UTF-8",null);
        masterdetail_teacherimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiveCoursesActivity.this,mMains_Details_Activity.class);
                intent.putExtra("teacherId",data.getTeacherId());
                LiveCoursesActivity.this.startActivity(intent);
            }
        });
    }
}
