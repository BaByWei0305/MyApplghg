package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.util.TUtils;
import com.example.asus.myapplication.home.mvp.base.BaseView;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.model.ArtModel;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.presenter.ArtPresenter;


public abstract class BaseArtFragment<M extends ArtModel, P extends ArtPresenter> extends Fragment{
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
            presenter.setMV(model, (ArtContract.View) this);
        }
        initView(inflate);
        return inflate;
    }

    protected abstract void initView(View inflate);

    protected abstract int getLayoutId();
}
