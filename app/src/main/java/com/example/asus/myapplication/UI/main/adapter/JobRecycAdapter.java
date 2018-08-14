package com.example.asus.myapplication.UI.main.adapter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.TimeShift;
import com.example.asus.myapplication.UI.main.beans.MainBean;
import com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity.Main_Liaotian_Activity;


import java.util.List;

public class JobRecycAdapter extends BaseQuickAdapter<MainBean.DataBean.HomewoksBean, BaseViewHolder>{
    public JobRecycAdapter(int layoutResId, @Nullable List<MainBean.DataBean.HomewoksBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final MainBean.DataBean.HomewoksBean item) {
        Glide.with(mContext)
                .load(item.getPhoto())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))//加载圆形图片
                .into((ImageView) helper.getView(R.id.job_studentimg));
        helper.setText(R.id.job_studentname,item.getNickname());
        String timeStr = TimeShift.getTimeStr(item.getAnswerDate());
        helper.setText(R.id.job_time,timeStr);
        helper.setText(R.id.job_from,item.getSource());
        helper.setText(R.id.job_content,item.getContent());
        helper.setText(R.id.job_worktype,item.getWorksType());
        Glide.with(mContext)
                .load(item.getTPhoto())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))//加载圆形图片
                .into((ImageView) helper.getView(R.id.job_teacherimg));
        helper.setText(R.id.job_teachername,item.getTRealname());
        helper.setText(R.id.job_teacherintro,item.getTIntro());
        Glide.with(mContext)
                .load(item.getPath())
                .into((ImageView) helper.getView(R.id.job_audioimg));//正常加载图片
        helper.setText(R.id.job_video_time,item.getDuration());
        helper.setText(R.id.job_reply,item.getCommentNum()+"");
        helper.setText(R.id.job_praise,item.getPraiseNum()+"");
        helper.setText(R.id.job_masterwork,item.getGiftNum()+"");
        CheckBox home_masterwork_list_item_reply_cb = (CheckBox) helper.getView(R.id.home_masterwork_list_item_reply_cb);
        home_masterwork_list_item_reply_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Intent intent=new Intent(mContext, Main_Liaotian_Activity.class);
                intent.putExtra("id",item.getId());
                mContext.startActivity(intent);
            }
        });
        CheckBox home_masterwork_list_item_praise_cb = (CheckBox) helper.getView(R.id.home_masterwork_list_item_praise_cb);
        TextView job_praise = (TextView) helper.getView(R.id.job_praise);
        home_masterwork_list_item_praise_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    
                }
            }
        });
    }
}
