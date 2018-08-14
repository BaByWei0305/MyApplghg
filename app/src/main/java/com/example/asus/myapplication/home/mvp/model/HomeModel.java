package com.example.asus.myapplication.home.mvp.model;


import com.example.asus.myapplication.api.ApiService;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.CodeBean;
import com.example.asus.myapplication.bean.ItlBean;
import com.example.asus.myapplication.bean.LoginBean;
import com.example.asus.myapplication.bean.MimaBean;
import com.example.asus.myapplication.bean.PeopleBean;
import com.example.asus.myapplication.bean.RegisterBean;
import com.example.asus.myapplication.bean.UpImgBean;

import java.util.List;

import okhttp3.MultipartBody;
import rx.Observable;


/**
* Created by TMVPHelper on 2018/07/26
*/
public class HomeModel implements HomeContract.Model{

    @Override
    public Observable<LoginBean> getLoginUrls(String mobile, String password) {

        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getLoginUrl(mobile,password);
    }

    @Override
    public Observable<CodeBean> getCodeUrls(String appType , String mobilePrefix, String mobile) {

        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getCodelUrl(appType,mobilePrefix,mobile);
    }

    @Override
    public Observable<RegisterBean> getRegisterUrls(String mobile, String mobileValidCode) {

        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getRegisterUrl(mobile,mobileValidCode);
    }

    @Override
    public Observable<CodeBean> getCellphoneUrls(String mobile) {
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getCellphoneUrl(mobile);
    }

    @Override
    public Observable<MimaBean> getMimaUrls(String mobile, String password) {
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getMimaUrl(mobile,password);
    }

    @Override
    public Observable<ItlBean> getItlUrls(int uid) {
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getItlUrl(uid);
    }

    @Override
    public Observable<UpImgBean> getuploadUrl(List<MultipartBody.Part> file) {
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getuploadOne(file);
    }

    @Override
    public Observable<PeopleBean> getPeopleUrls(String nickname, String sex, String photo, String mobile, String mobilePrefix, String mobileLocation, String psw) {
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService.getPeopleUrl(nickname, sex, photo, mobile, mobilePrefix, mobileLocation, psw);
    }


}