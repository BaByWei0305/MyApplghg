package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.yishu_xiangqing;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.adapter.CommentsAdapter;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.base.BaseArtActivity;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.model.ArtModel;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.presenter.ArtPresenter;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;


public class Art_Xiangqing_Activity extends BaseArtActivity<ArtModel,ArtPresenter> implements ArtContract.View{

    private RoundedImageView works_studentimg;
    private TextView art_xiangqing_name;
    private TextView art_xiangqing_time;
    private TextView art_title;
    private ImageView art_caverimg;
    private WebView art_webview;
    private LinearLayout arrt_layout;
    private LinearLayout arrt_mlayout;
    private RecyclerView art_recyclerview;

    @Override
    protected void initView() {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        Intent intent = getIntent();
        int did = intent.getIntExtra("id", 0);
        Log.e("Art_Xiangqing_Activity", "did:" + did);
        presenter.setArtXaingqingUrl(String.valueOf(id),String.valueOf(did),token);
        works_studentimg = findViewById(R.id.works_studentimg);
        art_xiangqing_name = findViewById(R.id.art_xiangqing_name);
        art_xiangqing_time = findViewById(R.id.art_xiangqing_time);
        art_title = findViewById(R.id.art_title);
        art_caverimg = findViewById(R.id.art_caverimg);
        art_webview = findViewById(R.id.art_webview);
        arrt_layout = findViewById(R.id.arrt_layout);
        arrt_mlayout = findViewById(R.id.arrt_mlayout);
        art_recyclerview = findViewById(R.id.art_recyclerview);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_art__xiangqing_;
    }

    @Override
    public void getArtData(Object bean) {
        ArtXaingqingBean bean1 = (ArtXaingqingBean) bean;
        Log.e("Art_Xiangqing_Activity", "bean1:艺术圈详情" + bean1.getMessage());
        ArtXaingqingBean.DataBean.ArtcircleBean artcircle = bean1.getData().getArtcircle();
        List<ArtXaingqingBean.DataBean.CommentsBean.ListBean> list = bean1.getData().getComments().getList();
        initartcircle(artcircle);
        initList(list);
    }

    private void initList(List<ArtXaingqingBean.DataBean.CommentsBean.ListBean> list) {
        if(list.size()==0){
            arrt_layout.setVisibility(View.VISIBLE);
            arrt_mlayout.setVisibility(View.GONE);
        }
        else {
            arrt_layout.setVisibility(View.GONE);
            arrt_mlayout.setVisibility(View.VISIBLE);
            CommentsAdapter art_comments_adapter = new CommentsAdapter(R.layout.art_comments_item,list);
            art_recyclerview.setAdapter(art_comments_adapter);
            art_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        }
    }

    private void initartcircle(ArtXaingqingBean.DataBean.ArtcircleBean artcircle) {
        Glide.with(this).load(artcircle.getPhoto()).into(works_studentimg);
        art_xiangqing_name.setText(artcircle.getNickname());
        String chatHintTime = TimeShift.getChatHintTime(artcircle.getCreateDate());
        art_xiangqing_time.setText(chatHintTime);
        art_title.setText(artcircle.getTitle());
        Glide.with(this).load(artcircle.getCoverImg()).into(art_caverimg);
        art_webview.loadDataWithBaseURL(null,artcircle.getContent(),"text/html","GBK",null);
    }

    @Override
    public void getmArtData(Object bean) {

    }
}
