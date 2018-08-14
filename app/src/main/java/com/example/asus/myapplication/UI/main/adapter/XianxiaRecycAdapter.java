package com.example.asus.myapplication.UI.main.adapter;

import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.beans.XianxiaBean;


import java.util.List;

public class XianxiaRecycAdapter extends BaseQuickAdapter<XianxiaBean.DataBean.ListBean,BaseViewHolder>{
    public XianxiaRecycAdapter(int layoutResId, @Nullable List<XianxiaBean.DataBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, XianxiaBean.DataBean.ListBean item) {
        Glide.with(mContext).load(item.getCoverImg()).into((ImageView) helper.getView(R.id.mains_details_img));
        Log.e("asdfasdfasdfas", item.getAddress());
        String timeData = TimeShift.getTimeData(item.getStartDate());
        helper.setText(R.id.xianxia_item,timeData);
        helper.setText(R.id.xianxia_address,item.getAddress());
        helper.setText(R.id.xianxia_price,"¥"+item.getPrice());
    }
}
