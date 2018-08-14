package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;


import java.util.List;

public class ArtRecycAdapter extends BaseQuickAdapter<mArtBean.DataBean.ArtcircleListBean.ListBean,BaseViewHolder>{
    public ArtRecycAdapter(int layoutResId, @Nullable List<mArtBean.DataBean.ArtcircleListBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, mArtBean.DataBean.ArtcircleListBean.ListBean item) {
        Glide.with(mContext).load(item.getPhoto()).into((ImageView) helper.getView(R.id.works_studentimg));
        helper.setText(R.id.text_name,item.getContentType());
        helper.setText(R.id.works_studentname,item.getNickname());
        helper.setText(R.id.home_masterwork_listitem_content,item.getContent());
        helper.setText(R.id.home_masterwork_listitem_contentintro,item.getTitle());
        Glide.with(mContext).load(item.getCoverImg()).into((ImageView) helper.getView(R.id.works_audioimg));
        helper.setText(R.id.works_xinxi,item.getCommentNum()+"");
        helper.setText(R.id.works_dianzan,item.getPraiseNum()+"");
        helper.setText(R.id.works_liwu,item.getFavoriteNum()+"");
        helper.setText(R.id.works_video_time,item.getDuration()+"");

    }
}
