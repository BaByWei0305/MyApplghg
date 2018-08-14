package com.example.asus.myapplication.UI.main.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.util.TUtils;
import com.example.asus.myapplication.home.mvp.base.BaseView;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;


public abstract class mBaseActivity <M extends MainModel, P extends MainPresenter> extends AppCompatActivity{
    public M model;
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setFitsSystemWindows(this,true);
        model= TUtils.getT(this,0);
        presenter=TUtils.getT(this,1);
        if(this instanceof BaseView)
        {
            presenter.setMV(model, (MainContract.View) this);
        }
        initView();
    }

    protected abstract void initView();

    protected abstract int getLayoutId();

    public static void setFitsSystemWindows(Activity activity, boolean value) {
        ViewGroup contentFrameLayout = (ViewGroup) activity.findViewById(android.R.id.content);
        View parentView = contentFrameLayout.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            parentView.setFitsSystemWindows(value);
        }
    }
}
