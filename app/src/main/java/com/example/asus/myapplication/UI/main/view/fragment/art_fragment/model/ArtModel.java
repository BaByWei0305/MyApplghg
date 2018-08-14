package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.model;


import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.api.ArtService;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;

import rx.Observable;

/**
* Created by TMVPHelper on 2018/08/01
*/
public class ArtModel implements ArtContract.Model{

    @Override
    public Observable<ArtBean> getArtUrl(String loginUserId , String token) {
        ArtService artService = retrofit.create(ArtService.class);
        return artService.getArtBeanUrl(loginUserId, token);
    }

    @Override
    public Observable<mArtBean> getmArtUrl(String loginUserId, String sortord, String token) {
        ArtService artService = retrofit.create(ArtService.class);
        return artService.getmArtBeanUrl(loginUserId, sortord, token);
    }

    @Override
    public Observable<ArtXaingqingBean> getArtXaingqingUrl(String loginUserId, String artcircleId, String token) {
        ArtService artService = retrofit.create(ArtService.class);
        return artService.getArtXaingqingBeanUrl(loginUserId, artcircleId, token);
    }
}