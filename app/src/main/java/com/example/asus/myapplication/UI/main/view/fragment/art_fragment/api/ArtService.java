package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.api;



import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface ArtService {
    //艺术圈轮播图
    @FormUrlEncoded
    @POST("v1/m/artcircle/slideshow")
    @Headers({"oCode:350010","appType:1"})
    Observable<ArtBean> getArtBeanUrl(@Field("loginUserId") String loginUserId, @Header("apptoken") String token);

    //艺术圈数据
    @FormUrlEncoded
    @POST("v1/m/artcircle/home")
    @Headers({"oCode:350010","appType:1"})
    Observable<mArtBean> getmArtBeanUrl(@Field("loginUserId") String loginUserId, @Field("sortord") String sortord, @Header("apptoken") String token);

    //艺术圈详情
    @FormUrlEncoded
    @POST("v1/m/artcircle/detail")
    @Headers({"oCode:350010","appType:1"})
    Observable<ArtXaingqingBean> getArtXaingqingBeanUrl(@Field("loginUserId") String loginUserId, @Field("artcircleId") String artcircleId, @Header("apptoken") String token);
}
