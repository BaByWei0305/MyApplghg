package com.example.asus.myapplication.home.mvp.presenter;

import android.util.Log;


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
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/07/26
*/
public class StarPresenter extends HomeContract.Presenter{

    @Override
    public void setLoginUrls(String mobile, String password) {
        m.getLoginUrls(mobile,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<LoginBean>() {
                    @Override
                    public void call(LoginBean bean) {
                        v.getLoginData(bean);
                        Log.e("1StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("2StarPresenter", "失败");
                    }
                });

    }

    @Override
    public void setCodeUrls(String appType , String mobilePrefix , String mobile) {
        m.getCodeUrls(appType , mobilePrefix,mobile)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CodeBean>() {
                    @Override
                    public void call(CodeBean codeBean) {
                        v.getLoginData(codeBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }

    @Override
    public void setRegisterUrls(String mobile, String mobileValidCode) {
        m.getRegisterUrls(mobile,mobileValidCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<RegisterBean>() {
                    @Override
                    public void call(RegisterBean registerBean) {
                        v.getRegisterData(registerBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }

    @Override
    public void setCellphoneUrls(String mobile) {
        m.getCellphoneUrls(mobile)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CodeBean>() {
                    @Override
                    public void call(CodeBean codeBean) {
                        v.getRegisterData(codeBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }

    @Override
    public void setMimaUrls(String mobile, String password) {
        m.getMimaUrls(mobile,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MimaBean>() {
                    @Override
                    public void call(MimaBean mimaBean) {
                        v.getLoginData(mimaBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }

    @Override
    public void setItlUrls(int uid) {
        m.getItlUrls(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ItlBean>() {
                    @Override
                    public void call(ItlBean itlBean) {
                        v.getLoginData(itlBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", throwable.getMessage());
                    }
                });
    }

    @Override
    public void setuploadUrls(List<MultipartBody.Part> file) {
        m.getuploadUrl(file)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UpImgBean>() {
                    @Override
                    public void call(UpImgBean upImgBean) {
                        v.getLoginData(upImgBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }

    @Override
    public void setPeopleUrls(String nickname, String sex, String photo, String mobile, String mobilePrefix, String mobileLocation, String psw) {
        m.getPeopleUrls(nickname, sex, photo, mobile, mobilePrefix, mobileLocation, psw)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<PeopleBean>() {
                    @Override
                    public void call(PeopleBean peopleBean) {
                        v.getRegisterData(peopleBean);
                        Log.e("StarPresenter", "成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("StarPresenter", "失败");
                    }
                });
    }
}