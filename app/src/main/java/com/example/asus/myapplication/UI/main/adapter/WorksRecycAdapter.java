package com.example.asus.myapplication.UI.main.adapter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.beans.WorksBean;
import com.example.asus.myapplication.UI.main.view.fragment.activity.mMains_Details_Activity;


import java.util.List;

public class WorksRecycAdapter extends BaseQuickAdapter<WorksBean.DataBean.ListBean,BaseViewHolder>{
    public WorksRecycAdapter(int layoutResId, @Nullable List<WorksBean.DataBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final WorksBean.DataBean.ListBean item) {
        Glide.with(mContext)
                .load(item.getPhoto())
                .into((ImageView) helper.getView(R.id.works_studentimg));
        helper.setText(R.id.works_listitem_from,item.getSource());
        helper.setText(R.id.works_studentname,item.getNickname());
        Glide.with(mContext)
                .load(item.getCoverImg())
                .into((ImageView) helper.getView(R.id.works_audioimg));
        Glide.with(mContext)
                .load(item.getTPhoto())
                .into((ImageView) helper.getView(R.id.works_teacherimg));
        helper.setText(R.id.works_teachername,item.getTRealname());
        helper.setText(R.id.works_teacherintro,item.getTIntro());
        helper.setText(R.id.works_video_time,item.getDuration()+" ");
        String hourAndMin = TimeShift.getTimeStr(item.getCreateDate());
        helper.setText(R.id.home_masterwork_listitem_time,hourAndMin);
        Glide.with(mContext)
                .load(R.mipmap.home_level_vip_blue)
                .into((ImageView) helper.getView(R.id.home_masterwork_listitem_teacherlevel));
        helper.setText(R.id.home_masterwork_listview_item_peep_price,item.getPeepPrice()+"元观摩");
        helper.setText(R.id.works_xinxi,item.getCommentNum()+"");
        helper.setText(R.id.works_dianzan,item.getPraiseNum()+"");
        helper.setText(R.id.works_liwu,item.getGiftNum()+"");
        ImageView works_teacherimg = (ImageView) helper.getView(R.id.works_teacherimg);
        works_teacherimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,mMains_Details_Activity.class);
                intent.putExtra("teacherId",item.getTUserId());
                mContext.startActivity(intent);
            }
        });
    }
}
