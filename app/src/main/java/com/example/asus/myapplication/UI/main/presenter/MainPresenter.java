package com.example.asus.myapplication.UI.main.presenter;

import android.util.Log;


import com.example.asus.myapplication.util.EncryptUtil;
import com.example.asus.myapplication.util.SPUtil;
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

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
* Created by TMVPHelper on 2018/07/28
*/
public class MainPresenter extends MainContract.Presenter {

    @Override
    public void setMainUrl(String loginUserId ,String token) {
        try {
            //第一步解密
            String decrypt = EncryptUtil.decrypt("G00hN1wuqkr/NStp+5iS7itUQup0nEDpNHELksZAl9yaUIXK1tVHgg==");
            //第二步获取当前系统毫秒数
            long timeMillis = System.currentTimeMillis();
            //第三步对token进行再次加密
            String encryptToken = EncryptUtil.encrypt(timeMillis + decrypt).replaceAll("\\n", "").toUpperCase();
            //第四步拼接系统当前时间保存token
            SPUtil.getInstance().put("token",encryptToken+"."+timeMillis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.getMainUrl(loginUserId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MainBean>() {
                    @Override
                    public void call(MainBean bean) {
                        v.getMainData(bean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setWorksUrl(String loginUserId, String sortord, String token) {
        m.getWorksUrl(loginUserId, sortord, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<WorksBean>() {
                    @Override
                    public void call(WorksBean worksBean) {
                        v.getMainData(worksBean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setMainsUrl(String loginUserId, String userType, String token) {
        m.getMainsUrl(loginUserId, userType, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MainsBean>() {
                    @Override
                    public void call(MainsBean mainsBean) {
                        v.getMainData(mainsBean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setTeacherUrl(String loginUserId, String teacherId, String token) {
        m.getTeacherUrl(loginUserId, teacherId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<TeacherBean>() {
                    @Override
                    public void call(TeacherBean teacherBean) {
                        v.getMainData(teacherBean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setZuoPinUrl(String loginUserId, String homewokId, String token) {
        m.getZuoPinUrl(loginUserId, homewokId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ZuoPinBean>() {
                    @Override
                    public void call(ZuoPinBean zuoPinBean) {
                        v.getMainData(zuoPinBean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setLiveCoursesUrl(String loginUserId, String id, String token) {
        m.getLiveCoursesUrl(loginUserId, id, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<LiveCoursesBean>() {
                    @Override
                    public void call(LiveCoursesBean liveCoursesBean) {
                        Log.e("MainPresenter", "访问成功");
                        v.getMainData(liveCoursesBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setUserUrl(String loginUserId, String token) {
        m.getUserUrl(loginUserId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserBean>() {
                    @Override
                    public void call(UserBean userBean) {
                        Log.e("MainPresenter", "访问成功");
                        v.getMainData(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setXianxiaUrl(String loginUserId, String token) {
        m.getXianxiaUrl(loginUserId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<XianxiaBean>() {
                    @Override
                    public void call(XianxiaBean xianxiaBean) {
                        v.getMainData(xianxiaBean);
                        Log.e("MainPresenter", "访问成功");
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }

    @Override
    public void setOfflineUrl(String loginUserId, String courseId, String token) {
        m.getOfflineUrl(loginUserId, courseId, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<OfflineBean>() {
                    @Override
                    public void call(OfflineBean offlineBean) {
                        Log.e("MainPresenter", "访问成功");
                        v.getMainData(offlineBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("MainPresenter", "访问失败");
                    }
                });
    }
}