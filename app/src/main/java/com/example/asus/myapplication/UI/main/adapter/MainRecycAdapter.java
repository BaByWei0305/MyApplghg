package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.beans.MainBean;

import java.util.List;

public class MainRecycAdapter extends BaseQuickAdapter<MainBean.DataBean.UsersBean, BaseViewHolder> {
    public MainRecycAdapter(int layoutResId, @Nullable List<MainBean.DataBean.UsersBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainBean.DataBean.UsersBean item) {
        Glide.with(mContext)
                .load(item.getPhoto())
                .into((ImageView) helper.getView(R.id.home_recommendmaster_item_img));//正常加载图片
        helper.setText(R.id.home_recommendmaster_item_name,item.getRealname());
        helper.setText(R.id.home_recommendmaster_item_intro,item.getNickname());
        switch (item.getUserType()){
            case 6:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_blue)
                        .into((ImageView) helper.getView(R.id.item_usertype_img));//正常加载图片
                break;
            case 4:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_red)
                        .into((ImageView) helper.getView(R.id.item_usertype_img));//正常加载图片
                break;
            case 3:
                Glide.with(mContext)
                        .load(R.mipmap.home_level_vip_yellow)
                        .into((ImageView) helper.getView(R.id.item_usertype_img));//正常加载图片
                break;
        }

    }
}
