package com.example.asus.myapplication.UI.main.adapter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.beans.ZuoPinBean;
import com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity.huifuActivity;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class LiaoTianAdapter extends BaseQuickAdapter<ZuoPinBean.DataBean.CommentsBean.ListBean,BaseViewHolder>{
    public LiaoTianAdapter(int layoutResId, @Nullable List<ZuoPinBean.DataBean.CommentsBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ZuoPinBean.DataBean.CommentsBean.ListBean item) {
        Glide.with(mContext).load(item.getPhoto()).into((RoundedImageView) helper.getView(R.id.work_detail_comment_listitem_img));
        helper.setText(R.id.work_detail_comment_listitem_name,item.getNickname());
        helper.setText(R.id.work_detail_comment_listitem_content,item.getContent());
        String chatHintTime = TimeShift.getChatHintTime(item.getCreateDate());
        helper.setText(R.id.work_detail_comment_listitem_time,chatHintTime);
        TextView work_detail_comment_listitem_comment = (TextView) helper.getView(R.id.work_detail_comment_listitem_comment);
        work_detail_comment_listitem_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, huifuActivity.class);
                mContext.startActivity(intent);
            }
        });
    }
}
