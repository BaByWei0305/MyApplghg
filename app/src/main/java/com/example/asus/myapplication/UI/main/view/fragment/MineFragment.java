package com.example.asus.myapplication.UI.main.view.fragment;


import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.UserBean;
import com.example.asus.myapplication.UI.main.base.mBaseFragment;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.activity.ZuopingActivity;
import com.example.asus.myapplication.UI.main.view.activity.Main12Activity;
import com.example.asus.myapplication.UI.main.view.activity.TieziActivity;
import com.example.asus.myapplication.UI.main.view.activity.Main14Activity;
import com.example.asus.myapplication.UI.main.view.activity.DianjiActivity;
import com.example.asus.myapplication.UI.main.view.activity.GuanzhuActivity;
import com.example.asus.myapplication.UI.main.view.activity.FengsiActivity;
import com.example.asus.myapplication.UI.main.view.activity.ChongzhiActivity;
import com.example.asus.myapplication.UI.main.view.activity.ShezhiActivity;
import com.example.asus.myapplication.UI.main.view.activity.TixingActivity;
import com.example.asus.myapplication.UI.main.view.activity.Xingqu1Activity;
import com.example.asus.myapplication.UI.main.view.activity.XingxiActivity;
import com.example.asus.myapplication.UI.main.view.activity.RenzhengActivity;
import com.makeramen.roundedimageview.RoundedImageView;

public class MineFragment extends mBaseFragment<MainModel, MainPresenter> implements MainContract.View, View.OnClickListener {

    private String mParam1;
    private String mParam2;
    private RoundedImageView user_img;
    private TextView user_pianhao;
    private TextView user_name;
    private TextView user_jigou;
    private TextView user_fensi;
    private TextView user_guanzhu;
    private TextView user_hua;
    private TextView user_jindou;
    private ImageView mImg1_3;
    private ImageView mImg1_2;
    private TextView tv_1;
    private TextView tv_2;
    private TextView shenhe;
    private ImageView zuo;
    private TextView cang;
    private ImageView wo;
    private ImageView yi;
    private TextView guanzhu;
    private TextView fensi;
    private TextView chongzhi;


    @Override
    protected void initView(View inflate) {
        Integer id = (Integer) SPUtil.getInstance().get("id", 0);
        String token = (String) SPUtil.getInstance().get("token", "");
        presenter.setUserUrl(String.valueOf(id), token);
        user_img = inflate.findViewById(R.id.user_img);
        user_pianhao = inflate.findViewById(R.id.user_pianhao);
        user_name = inflate.findViewById(R.id.user_name);
        user_jigou = inflate.findViewById(R.id.user_jigou);
        user_fensi = inflate.findViewById(R.id.user_fensi);
        user_guanzhu = inflate.findViewById(R.id.user_guanzhu);
        user_hua = inflate.findViewById(R.id.user_hua);
        user_jindou = inflate.findViewById(R.id.user_jindou);
        mImg1_3 = inflate.findViewById(R.id.mImg1_3);
        mImg1_2 = inflate.findViewById(R.id.mImg1_2);
        tv_1 = inflate.findViewById(R.id.tv_1);
        tv_2 = inflate.findViewById(R.id.tv_2);
        shenhe = inflate.findViewById(R.id.shenhe);
        zuo = inflate.findViewById(R.id.zuo);
        wo = inflate.findViewById(R.id.wo);
        yi = inflate.findViewById(R.id.yi);
        cang = inflate.findViewById(R.id.cang);
        guanzhu = inflate.findViewById(R.id.guanzhu);
        fensi = inflate.findViewById(R.id.fensi);
        chongzhi = inflate.findViewById(R.id.chongzhi);

        mImg1_2.setOnClickListener(this);
        mImg1_3.setOnClickListener(this);
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        shenhe.setOnClickListener(this);
        wo.setOnClickListener(this);
        zuo.setOnClickListener(this);
        yi.setOnClickListener(this);
        cang.setOnClickListener(this);
        fensi.setOnClickListener(this);
        guanzhu.setOnClickListener(this);

        user_img.setOnClickListener(this);

        chongzhi.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void getMainData(Object bean) {
        UserBean bean1 = (UserBean) bean;
        Log.e("MineFragment", "bean1:我的详情" + bean1.getMessage());
        UserBean.DataBean data = bean1.getData();
        initData(data);
    }

    private void initData(UserBean.DataBean data) {
//        Glide.with(this).load(data.getPhoto()).into(user_img);
        user_pianhao.setText(data.getMajors());
        user_name.setText(data.getNickname());
        user_jigou.setText(data.getOrgName());
        user_fensi.setText(data.getFansCount() + "");
        user_guanzhu.setText(data.getFavoriteCount() + "");
        user_hua.setText(data.getFlowerCount() + "");
        user_jindou.setText(data.getBeanAmount() + "");

    }

    @Override
    public void onClick(View v) {

        mImg1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ShezhiActivity.class);
                startActivity(intent);
            }
        });
        mImg1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), TixingActivity.class);
                startActivity(intent);
            }
        });
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Xingqu1Activity.class);
                startActivity(intent);
            }
        });
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), XingxiActivity.class);
                startActivity(intent);
            }
        });
        shenhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RenzhengActivity.class);
                startActivity(intent);
            }
        });
        zuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ZuopingActivity.class);
                startActivity(intent);
            }
        });
        cang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Main12Activity.class);
                startActivity(intent);
            }
        });
        wo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), TieziActivity.class);
                startActivity(intent);
            }
        });
        yi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Main14Activity.class);
                startActivity(intent);
            }
        });
        user_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DianjiActivity.class);
                startActivity(intent);
            }
        });
        guanzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), GuanzhuActivity.class);
                startActivity(intent);
            }
        });
        fensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), FengsiActivity.class);
                startActivity(intent);
            }
        });
        chongzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ChongzhiActivity.class);
                startActivity(intent);

            }
        });
    }

}
