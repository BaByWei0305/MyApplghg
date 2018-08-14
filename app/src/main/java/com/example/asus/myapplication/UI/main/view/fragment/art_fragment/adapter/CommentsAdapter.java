package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.adapter;

import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class CommentsAdapter extends BaseQuickAdapter<ArtXaingqingBean.DataBean.CommentsBean.ListBean,BaseViewHolder>{
    public CommentsAdapter(int layoutResId, @Nullable List<ArtXaingqingBean.DataBean.CommentsBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ArtXaingqingBean.DataBean.CommentsBean.ListBean item) {
        Glide.with(mContext).load(item.getPhoto()).into((RoundedImageView)helper.getView(R.id.work_detail_comment_listitem_img));
        helper.setText(R.id.work_detail_comment_listitem_name,item.getNickname());
        helper.setText(R.id.work_detail_comment_listitem_content,item.getContent());
        String chatHintTime = TimeShift.getChatHintTime(item.getCreateDate());
        helper.setText(R.id.work_detail_comment_listitem_time,chatHintTime);
    }
}
