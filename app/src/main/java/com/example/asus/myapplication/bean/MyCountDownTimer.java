package com.example.asus.myapplication.bean;

import android.os.CountDownTimer;
import android.widget.TextView;

public class MyCountDownTimer extends CountDownTimer {
    public TextView text;
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */

    public MyCountDownTimer(long millisInFuture, long countDownInterval, TextView text) {
        super(millisInFuture, countDownInterval);
        this.text = text;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        text.setClickable(false);
        text.setText(millisUntilFinished/1000+"s");
    }

    @Override
    public void onFinish() {
//重新给Button设置文字
        text.setText("重新获取验证码");
        //设置可点击
        text.setClickable(true);
    }
}
