package com.example.asus.myapplication.UI.main.model;



import com.example.asus.myapplication.UI.main.api.MainService;
import com.example.asus.myapplication.UI.main.contract.MainContract;
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


public class MainModel implements MainContract.Model {

    @Override
    public Observable<MainBean> getMainUrl(String loginUserId , String token) {
        MainService mainService = retrofit.create(MainService.class);

        return mainService.getMainBeanUrl(loginUserId ,token);
    }

    @Override
    public Observable<WorksBean> getWorksUrl(String loginUserId, String sortord, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getWorksBeanUrl(loginUserId, sortord, token);
    }

    @Override
    public Observable<MainsBean> getMainsUrl(String loginUserId, String userType, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getMainsBeanUrl(loginUserId, userType, token);
    }

    @Override
    public Observable<TeacherBean> getTeacherUrl(String loginUserId, String teacherId, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getTeacherBeanUrl(loginUserId, teacherId, token);
    }

    @Override
    public Observable<ZuoPinBean> getZuoPinUrl(String loginUserId, String homewokId, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getZuoPinBeanUrl(loginUserId, homewokId, token);
    }

    @Override
    public Observable<LiveCoursesBean> getLiveCoursesUrl(String loginUserId, String id, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getLiveCoursesBeanUrl(loginUserId, id, token);
    }

    @Override
    public Observable<UserBean> getUserUrl(String loginUserId, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getUserBeanUrl(loginUserId, token);
    }

    @Override
    public Observable<XianxiaBean> getXianxiaUrl(String loginUserId, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getXianxiaBeanUrl(loginUserId, token);
    }

    @Override
    public Observable<OfflineBean> getOfflineUrl(String loginUserId, String courseId, String token) {
        MainService mainService = retrofit.create(MainService.class);
        return mainService.getOfflineBeanUrl(loginUserId, courseId, token);
    }
}