package com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity;

import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.adapter.LiaoTianAdapter;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.ZuoPinBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.fragment.activity.mMains_Details_Activity;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Main_Liaotian_Activity extends mBaseActivity<MainModel, MainPresenter> implements MainContract.View, View.OnClickListener {

    private NestedScrollView main_liaotian_scrollview;
    private RelativeLayout main_liaotian_layout;
    private RelativeLayout main_liaotian_mlayout;
    private TextView wok_detail_aty_input_btn;
    private RoundedImageView works_studentimg;
    private RoundedImageView works_teacherimg;
    private TextView works_studentname;
    private ImageView works_audioimg;
    private TextView works_listitem_from;
    private TextView home_masterwork_listitem_time;
    private TextView home_masterwork_listitem_content;
    private TextView home_masterwork_listitem_worktype;
    private TextView works_teachername;
    private ImageView home_masterwork_listitem_teacherlevel;
    private TextView works_teacherintro;
    private RoundedImageView main_liaotian_img;
    private TextView home_masterwork_listview_item_peep_price11;
    private RecyclerView main_liaotian_recyclerview;

    @Override
    protected void initView() {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        Intent intent = getIntent();
        int id1 = intent.getIntExtra("id", 0);
        presenter.setZuoPinUrl(String.valueOf(id),String.valueOf(id1),token);
        main_liaotian_scrollview = findViewById(R.id.main_liaotian_scrollview);
        main_liaotian_layout = findViewById(R.id.main_liaotian_layout);
        main_liaotian_mlayout = findViewById(R.id.main_liaotian_mlayout);
        wok_detail_aty_input_btn = findViewById(R.id.wok_detail_aty_input_btn);
        works_studentimg = findViewById(R.id.works_studentimg);
        works_teacherimg = findViewById(R.id.works_teacherimg);
        works_audioimg = findViewById(R.id.works_audioimg);
        works_studentname = findViewById(R.id.works_studentname);
        works_listitem_from = findViewById(R.id.works_listitem_from);
        home_masterwork_listitem_time = findViewById(R.id.home_masterwork_listitem_time);
        home_masterwork_listitem_content = findViewById(R.id.home_masterwork_listitem_content);
        home_masterwork_listitem_worktype = findViewById(R.id.home_masterwork_listitem_worktype);
        works_teachername = findViewById(R.id.works_teachername);
        home_masterwork_listitem_teacherlevel = findViewById(R.id.home_masterwork_listitem_teacherlevel);
        works_teacherintro = findViewById(R.id.works_teacherintro);
        main_liaotian_img = findViewById(R.id.main_liaotian_img);
        home_masterwork_listview_item_peep_price11 = findViewById(R.id.home_masterwork_listview_item_peep_price);
        main_liaotian_recyclerview = findViewById(R.id.main_liaotian_recyclerview);
        main_liaotian_scrollview.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                main_liaotian_mlayout.setVisibility(View.GONE);
                main_liaotian_layout.setVisibility(View.VISIBLE);
            }
        });
        wok_detail_aty_input_btn.setOnClickListener(this);
        works_audioimg.setOnClickListener(this);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main__liaotian_;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.wok_detail_aty_input_btn :
                main_liaotian_mlayout.setVisibility(View.VISIBLE);
                main_liaotian_layout.setVisibility(View.GONE);
                break;
        }
    }

    @Override
    public void getMainData(Object bean) {
        ZuoPinBean bean1 = (ZuoPinBean) bean;
        Log.e("Main_Liaotian_Activity", "bean1:---" + bean1.getMessage());
        ZuoPinBean.DataBean.HomewokBean homewok = bean1.getData().getHomewok();
        List<ZuoPinBean.DataBean.RewardUserListBean> rewardUserList = bean1.getData().getRewardUserList();
        List<ZuoPinBean.DataBean.CommentsBean.ListBean> list = bean1.getData().getComments().getList();
        inithomewok(homewok);
        initrewardUserList(rewardUserList);
        initList(list);

    }

    private void initList(List<ZuoPinBean.DataBean.CommentsBean.ListBean> list) {
        LiaoTianAdapter main_liaoTian_adapter = new LiaoTianAdapter(R.layout.main_liaotian_item,list);
        main_liaotian_recyclerview.setAdapter(main_liaoTian_adapter);
        main_liaotian_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
    }

    private void initrewardUserList(final List<ZuoPinBean.DataBean.RewardUserListBean> rewardUserList) {
        Glide.with(this).load(rewardUserList.get(0).getUserPhoto()).into(main_liaotian_img);

    }

    private void inithomewok(final ZuoPinBean.DataBean.HomewokBean homewok) {
        Glide.with(this).load(homewok.getPhoto()).into(works_studentimg);
        Glide.with(this).load(homewok.getTPhoto()).into(works_teacherimg);
        Glide.with(this).load(homewok.getCoverImg()).into(works_audioimg);
        works_studentname.setText(homewok.getNickname());
        works_listitem_from.setText(homewok.getSource());
        String timeStr = TimeShift.getTimeStr(homewok.getCreateDate());
        home_masterwork_listitem_time.setText(timeStr);
        home_masterwork_listitem_content.setText(homewok.getContent());
        home_masterwork_listitem_worktype.setText(homewok.getAnswerWorksType());
        works_teachername.setText(homewok.getTRealname());
        Glide.with(this).load(R.mipmap.home_level_vip_blue).into(home_masterwork_listitem_teacherlevel);
        works_teacherintro.setText(homewok.getTIntro());
        home_masterwork_listview_item_peep_price11.setText(homewok.getPeepPrice()+"元观摩");
        works_audioimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Liaotian_Activity.this,ShiPingActivity.class);
                intent.putExtra("path",homewok.getAnswerPath());
                startActivity(intent);
            }
        });
        works_teacherimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Liaotian_Activity.this,mMains_Details_Activity.class);
                intent.putExtra("teacherId",homewok.getTUserId());
                Main_Liaotian_Activity.this.startActivity(intent);
            }
        });
    }
}
