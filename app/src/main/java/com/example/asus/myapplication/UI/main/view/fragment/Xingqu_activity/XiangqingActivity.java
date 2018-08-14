package com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity;

import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.OfflineBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;


public class XiangqingActivity extends mBaseActivity<MainModel, MainPresenter> implements MainContract.View{

    private ImageView main_xiangqing_img;
    private TextView xiangqing_address;
    private TextView xiangqing_time;
    private TextView xiangqing_price;
    private WebView xiangqing_webview;

    @Override
    protected void initView() {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        Intent intent = getIntent();
        int id1 = intent.getIntExtra("id", 0);
        Log.e("Main_xiaingqing_Activit", "id1:" + id1);
        presenter.setOfflineUrl(String.valueOf(id),String.valueOf(id1),token);
        main_xiangqing_img = findViewById(R.id.main_xiangqing_img);
        xiangqing_address = findViewById(R.id.xiangqing_address);
        xiangqing_time = findViewById(R.id.xiangqing_time);
        xiangqing_price = findViewById(R.id.xiangqing_price);
        xiangqing_webview = findViewById(R.id.xiangqing_webview);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_xiaingqing_;
    }

    @Override
    public void getMainData(Object bean) {
        OfflineBean bean1 = (OfflineBean) bean;
        Log.e("Main_xiaingqing_Activit", "bean:详情" + bean1.getMessage());
        OfflineBean.DataBean data = bean1.getData();
        initData(data);
    }

    private void initData(OfflineBean.DataBean data) {
        Glide.with(this).load(data.getCoverImg()).into(main_xiangqing_img);
        xiangqing_address.setText(data.getAddress());
        String timeData = TimeShift.getTimeData(data.getStartDate());
        xiangqing_time.setText(timeData);
        xiangqing_price.setText(data.getPrice()+"");
        xiangqing_webview.loadDataWithBaseURL(null,data.getCourseContent(),"text/html","UTF-8",null);

    }
}
