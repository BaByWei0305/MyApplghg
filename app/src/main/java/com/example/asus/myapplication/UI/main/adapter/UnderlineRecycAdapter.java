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

public class UnderlineRecycAdapter extends BaseQuickAdapter<MainBean.DataBean.OfflineCourseBean, BaseViewHolder> {
    public UnderlineRecycAdapter(int layoutResId, @Nullable List<MainBean.DataBean.OfflineCourseBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainBean.DataBean.OfflineCourseBean item) {
        Glide.with(mContext)
                .load(item.getCoverImg())
                .into((ImageView) helper.getView(R.id.underline_img));//正常加载图片
        helper.setText(R.id.tv_price,"¥"+item.getPrice());
        long startDate = item.getStartDate();
        String change = TimeShift.getTimeData(startDate);
        helper.setText(R.id.underline_startadata,change);
        helper.setText(R.id.underline_title,item.getTitle());
        helper.setText(R.id.underline_address,item.getAddress());

    }
}
