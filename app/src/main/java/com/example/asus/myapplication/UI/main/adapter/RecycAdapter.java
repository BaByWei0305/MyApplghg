package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.beans.MainBean;


import java.util.List;

public class RecycAdapter extends BaseQuickAdapter<MainBean.DataBean.LiveCoursesBean, BaseViewHolder> {
    public RecycAdapter(int layoutResId, @Nullable List<MainBean.DataBean.LiveCoursesBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainBean.DataBean.LiveCoursesBean item) {
        Glide.with(mContext)
                .load(item.getPhoto())
                .into((ImageView) helper.getView(R.id.course_img));//正常加载图片
        helper.setText(R.id.tv_intro,item.getIntro());
        helper.setText(R.id.tv_nickname,item.getNickname());
        helper.setText(R.id.tv_price,"¥"+item.getPrice());
        helper.setText(R.id.tv_title,item.getTitle());
        long startDate = item.getStartDate();
        String change = TimeShift.getTimeData(startDate);
        helper.setText(R.id.tv_startadata,change);

    }
}
