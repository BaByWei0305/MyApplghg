package com.example.asus.myapplication.home.mvp.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;
import com.example.asus.myapplication.util.TUtils;


public abstract class BaseFragment<M extends HomeModel, P extends StarPresenter> extends Fragment {
    public M model;
    public P presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), container, false);
        model= TUtils.getT(this,0);
        presenter=TUtils.getT(this,1);
        if(this instanceof BaseView)
        {
            presenter.setMV(model, (HomeContract.View) this);
        }
        initView(inflate);
        return inflate;
    }

    protected abstract void initView(View inflate);

    protected abstract int getLayoutId();

}
