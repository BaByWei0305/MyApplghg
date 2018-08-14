package com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity;

import android.content.Intent;

import com.bumptech.glide.Glide;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;


import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class ShiPingActivity extends mBaseActivity {

    @Override
    protected void initView() {
        Intent intent = getIntent();
        String path = intent.getStringExtra("path");
        JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) findViewById(R.id.videoplayer);
        jcVideoPlayerStandard.TOOL_BAR_EXIST = false;
        jcVideoPlayerStandard.setUp(path
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "播放视频的标题，可以为空");
//        jcVideoPlayerStandard.loop  = true;//是否循环播放

        Glide.with(getApplicationContext()).load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                .into(jcVideoPlayerStandard.thumbImageView);
        jcVideoPlayerStandard.widthRatio = 4;//播放比例
        jcVideoPlayerStandard.heightRatio = 3;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main__liaotian__shi_pin_;
    }
    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
}
