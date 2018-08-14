package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.presenter;

import android.util.Log;


import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/08/01
*/
public class ArtPresenter extends ArtContract.Presenter{

    @Override
    public void setArtUrl(String loginUserId, String token) {
        m.getArtUrl(loginUserId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ArtBean>() {
                    @Override
                    public void call(ArtBean bean) {
                        v.getArtData(bean);
                        Log.e("ArtPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("ArtPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setmArtUrl(String loginUserId, String sortord, String token) {
        m.getmArtUrl(loginUserId, sortord, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<mArtBean>() {
                    @Override
                    public void call(mArtBean Bean) {
                        v.getmArtData(Bean);
                        Log.e("ArtPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("ArtPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setArtXaingqingUrl(String loginUserId, String artcircleId, String token) {
        m.getArtXaingqingUrl(loginUserId, artcircleId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ArtXaingqingBean>() {
                    @Override
                    public void call(ArtXaingqingBean artXaingqingBean) {
                        Log.e("ArtPresenter", "访问成功");
                        v.getArtData(artXaingqingBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("ArtPresenter", "访问失败");
                    }
                });
    }
}