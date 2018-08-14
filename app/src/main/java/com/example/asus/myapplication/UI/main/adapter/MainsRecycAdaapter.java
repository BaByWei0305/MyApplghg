package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.beans.MainsBean;


import java.util.List;

public class MainsRecycAdaapter extends BaseQuickAdapter<MainsBean.DataBean.ListBean,BaseViewHolder>{
    public MainsRecycAdaapter(int layoutResId, @Nullable List<MainsBean.DataBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainsBean.DataBean.ListBean item) {
        Glide.with(mContext)
                .load(item.getImages())
                .into((ImageView) helper.getView(R.id.mains_img));
        helper.setText(R.id.text_name,item.getNickname());
        switch (item.getUserType())
        {
            case 2:
                Glide.with(mContext)
                        .load(R.mipmap.daren)
                        .into((ImageView) helper.getView(R.id.tubiao));
                break;
            case 3:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_yellow)
                        .into((ImageView) helper.getView(R.id.tubiao));
                break;
            case 4:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_red)
                        .into((ImageView) helper.getView(R.id.tubiao));
                break;
            case 6:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_blue)
                        .into((ImageView) helper.getView(R.id.tubiao));
                break;
        }
        helper.setText(R.id.text_title,item.getIntro());
    }
}
