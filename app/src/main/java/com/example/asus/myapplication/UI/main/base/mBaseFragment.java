package com.example.asus.myapplication.UI.main.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.util.TUtils;
import com.example.asus.myapplication.home.mvp.base.BaseView;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;


public abstract class mBaseFragment <M extends MainModel, P extends MainPresenter> extends Fragment{
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
            presenter.setMV(model, (MainContract.View) this);
        }
        initView(inflate);
        return inflate;
    }

    protected abstract void initView(View inflate);

    protected abstract int getLayoutId();
}
