package com.example.asus.myapplication.home.mvp.contract;

import com.example.asus.myapplication.bean.CodeBean;
import com.example.asus.myapplication.bean.ItlBean;
import com.example.asus.myapplication.bean.LoginBean;
import com.example.asus.myapplication.bean.MimaBean;
import com.example.asus.myapplication.bean.PeopleBean;
import com.example.asus.myapplication.bean.RegisterBean;
import com.example.asus.myapplication.bean.UpImgBean;
import com.example.asus.myapplication.home.mvp.model.BaseModel;
import com.example.asus.myapplication.home.mvp.presenter.BasePresenter;
import com.example.asus.myapplication.home.mvp.base.BaseView;

import java.util.List;

import okhttp3.MultipartBody;
import rx.Observable;
//契约类
public class HomeContract {

    public interface View extends BaseView {
       void getLoginData(Object bean);
        void getRegisterData(Object bean);

    }
//请求方法 model
    public interface Model extends BaseModel {
        Observable<LoginBean> getLoginUrls(String mobile, String password);
        Observable<CodeBean> getCodeUrls(String appType, String mobilePrefix, String mobile);
        Observable<RegisterBean> getRegisterUrls(String mobile, String mobileValidCode);
        Observable<CodeBean> getCellphoneUrls(String mobile);
        Observable<MimaBean> getMimaUrls(String mobile, String password);
        Observable<ItlBean> getItlUrls(int uid);
        Observable<UpImgBean> getuploadUrl(List<MultipartBody.Part> file);
        Observable<PeopleBean> getPeopleUrls(String nickname, String sex,
                                             String photo, String mobile,
                                             String mobilePrefix, String mobileLocation,
                                             String psw);
    }
    //请求方法 presenter
    public abstract static class Presenter extends BasePresenter<Model, View> {
        public abstract void setLoginUrls(String mobile, String password);
        public abstract void setCodeUrls(String appType ,String mobilePrefix , String mobile);
        public abstract void setRegisterUrls(String mobile , String mobileValidCode);
        public abstract void setCellphoneUrls(String mobile);
        public abstract void setMimaUrls(String mobile , String password);
        public abstract void setItlUrls(int uid);
        public abstract void setuploadUrls(List<MultipartBody.Part> file);
        public abstract void setPeopleUrls(String nickname, String sex,
                                           String photo, String mobile,
                                           String mobilePrefix, String mobileLocation,
                                           String psw);
    }
}