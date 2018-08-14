package com.example.asus.myapplication.UI.main.contract;



import com.example.asus.myapplication.home.mvp.model.BaseModel;
import com.example.asus.myapplication.home.mvp.presenter.BasePresenter;
import com.example.asus.myapplication.home.mvp.base.BaseView;
import com.example.asus.myapplication.UI.main.beans.LiveCoursesBean;
import com.example.asus.myapplication.UI.main.beans.MainBean;
import com.example.asus.myapplication.UI.main.beans.MainsBean;
import com.example.asus.myapplication.UI.main.beans.OfflineBean;
import com.example.asus.myapplication.UI.main.beans.TeacherBean;
import com.example.asus.myapplication.UI.main.beans.UserBean;
import com.example.asus.myapplication.UI.main.beans.WorksBean;
import com.example.asus.myapplication.UI.main.beans.XianxiaBean;
import com.example.asus.myapplication.UI.main.beans.ZuoPinBean;

import rx.Observable;

public class MainContract {

    public interface View extends BaseView {
      void getMainData(Object bean);
    }

    public interface Model extends BaseModel {
        Observable<MainBean> getMainUrl(String loginUserId, String token);
        Observable<WorksBean> getWorksUrl(String loginUserId, String sortord, String token);
        Observable<MainsBean> getMainsUrl(String loginUserId, String userType, String token);
        Observable<TeacherBean> getTeacherUrl(String loginUserId, String teacherId, String token);
        Observable<ZuoPinBean> getZuoPinUrl(String loginUserId, String homewokId, String token);
        Observable<LiveCoursesBean> getLiveCoursesUrl(String loginUserId, String id, String token);
        Observable<UserBean> getUserUrl(String loginUserId, String token);
        Observable<XianxiaBean> getXianxiaUrl(String loginUserId, String token);
        Observable<OfflineBean> getOfflineUrl(String loginUserId, String courseId, String token);
    }

    public abstract static class Presenter extends BasePresenter<Model, View> {
        public abstract void setMainUrl(String loginUserId , String token);
        public abstract void setWorksUrl(String loginUserId ,String sortord , String token);
        public abstract void setMainsUrl(String loginUserId ,String userType , String token);
        public abstract void setTeacherUrl(String loginUserId , String teacherId , String token);
        public abstract void setZuoPinUrl(String loginUserId , String homewokId , String token);
        public abstract void setLiveCoursesUrl(String loginUserId , String id , String token);
        public abstract void setUserUrl(String loginUserId , String token);
        public abstract void setXianxiaUrl(String loginUserId , String token);
        public abstract void setOfflineUrl(String loginUserId , String courseId , String token);
    }
}