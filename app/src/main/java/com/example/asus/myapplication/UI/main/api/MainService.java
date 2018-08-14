package com.example.asus.myapplication.UI.main.api;


import com.example.asus.myapplication.UI.main.beans.LiveCoursesBean;
import com.example.asus.myapplication.UI.main.beans.MainBean;
import com.example.asus.myapplication.UI.main.beans.MainsBean;
import com.example.asus.myapplication.UI.main.beans.OfflineBean;
import com.example.asus.myapplication.UI.main.beans.TeacherBean;
import com.example.asus.myapplication.UI.main.beans.UserBean;
import com.example.asus.myapplication.UI.main.beans.WorksBean;
import com.example.asus.myapplication.UI.main.beans.XianxiaBean;
import com.example.asus.myapplication.UI.main.beans.ZuoPinBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface MainService {
    //首页
    @FormUrlEncoded
    @POST(Api.MAINBEAN)
    @Headers({"oCode:350010","appType:1"})
    Observable<MainBean> getMainBeanUrl(@Field("loginUserId") String loginUserId, @Header("apptoken") String token);

    //交作品
    @FormUrlEncoded
    @POST("v1/m/homewok/home")
    @Headers({"oCode:350010","appType:1"})
    Observable<WorksBean> getWorksBeanUrl(@Field("loginUserId") String loginUserId, @Field("sortord") String sortord, @Header("apptoken") String token);

    //协会名师数据
    @FormUrlEncoded
    @POST("v1/m/user/teacher/list")
    @Headers({"oCode:350010","appType:1"})
    Observable<MainsBean> getMainsBeanUrl(@Field("loginUserId") String loginUserId, @Field("userType") String userType, @Header("apptoken") String token);

    //协会名师数据
    @FormUrlEncoded
    @POST("v1/m/user/teacher/homepage")
    @Headers({"oCode:350010","appType:1"})
    Observable<TeacherBean> getTeacherBeanUrl(@Field("loginUserId") String loginUserId, @Field("teacherId") String teacherId, @Header("apptoken") String token);


    //作业推荐里面的作品详情
    @FormUrlEncoded
    @POST("v1/m/homewok/detail")
    @Headers({"oCode:350010","appType:1"})
    Observable<ZuoPinBean> getZuoPinBeanUrl(@Field("loginUserId") String loginUserId, @Field("homewokId") String homewokId, @Header("apptoken") String token);


    //课程推荐详情
    @FormUrlEncoded
    @POST("v1/m/liveCourse/alliance/detail")
    @Headers({"oCode:350010","appType:1"})
    Observable<LiveCoursesBean> getLiveCoursesBeanUrl(@Field("loginUserId") String loginUserId, @Field("id") String id, @Header("apptoken") String token);
    //我的详情
    @FormUrlEncoded
    @POST("v1/m/user/my")
    @Headers({"oCode:350010","appType:1"})
    Observable<UserBean> getUserBeanUrl(@Field("loginUserId") String loginUserId, @Header("apptoken") String token);

    //线下沙龙推荐
    @FormUrlEncoded
    @POST("v1/m/forthcoming/alliance/home")
    @Headers({"oCode:350010","appType:1"})
    Observable<XianxiaBean> getXianxiaBeanUrl(@Field("loginUserId") String loginUserId, @Header("apptoken") String token);
    //线下沙龙详情
    @FormUrlEncoded
    @POST("v1/m/forthcoming/alliance/detail")
    @Headers({"oCode:350010","appType:1"})
    Observable<OfflineBean> getOfflineBeanUrl(@Field("loginUserId") String loginUserId, @Field("courseId") String courseId, @Header("apptoken") String token);
}
