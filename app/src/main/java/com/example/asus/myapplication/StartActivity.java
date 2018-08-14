package com.example.asus.myapplication;

import android.animation.Animator;
import android.content.Intent;

import com.airbnb.lottie.LottieAnimationView;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.UI.activity.LoginActivity;


public class StartActivity extends BaseActivity {

    private LottieAnimationView animationView;

    @Override
    protected void initView() {
        setFitsSystemWindows(this,true);
        animationView = findViewById(R.id.lottie);
        animationView.setAnimation("economy.lk.json");//在assets目录下的动画json文件名。
        //animationView.loop(true);//设置动画循环播放
        animationView.playAnimation();//播放动画
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                finish();
                Intent intent=new Intent(StartActivity.this, LoginActivity.class);
                StartActivity.this.startActivity(intent);

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
