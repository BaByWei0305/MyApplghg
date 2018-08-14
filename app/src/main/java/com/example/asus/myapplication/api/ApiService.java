package com.example.asus.myapplication.api;


import com.example.asus.myapplication.bean.CodeBean;
import com.example.asus.myapplication.bean.ItlBean;
import com.example.asus.myapplication.bean.JDdingdan;
import com.example.asus.myapplication.bean.JDjiage;
import com.example.asus.myapplication.bean.LoginBean;
import com.example.asus.myapplication.bean.MimaBean;
import com.example.asus.myapplication.bean.PeopleBean;
import com.example.asus.myapplication.bean.RegisterBean;
import com.example.asus.myapplication.bean.UpImgBean;
import com.example.asus.myapplication.bean.Zhifu;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

public interface ApiService {
    //登录
    @FormUrlEncoded
    @POST("v1/m/user/login/mobile?")
    Observable<LoginBean> getLoginUrl(@Field("mobile") String mobile, @Field("password") String password);

    //获取验证码
    @FormUrlEncoded
    @POST("v1/m/user/authcode?")
    Observable<CodeBean> getCodelUrl(@Header("appType") String appType, @Field("mobilePrefix") String mobilePrefix, @Field("mobile") String mobile);

    //注册
    @FormUrlEncoded
    @POST("v1/m/user/register/mobile?")
    Observable<RegisterBean> getRegisterUrl(@Field("mobile") String mobile, @Field("mobileValidCode") String mobileValidCode);

    //重置密码
    @FormUrlEncoded
    @POST("v1/m/user/save/password?")
    Observable<MimaBean> getMimaUrl(@Field("mobile") String mobile, @Field("password") String password);

    //验证手机号
    //
    @FormUrlEncoded
    @POST("v1/m/user/verify/mobile?")
    Observable<CodeBean> getCellphoneUrl(@Field("mobile") String mobile);

    //根据用户ID查询用户属于机构信息
    @FormUrlEncoded
    @POST("v1/m/user/findOrgByUserId?")
    Observable<ItlBean> getItlUrl(@Field("uid") int uid);

    //上传图片
    @Multipart
    @POST("v1/m/qiniu/qiniuUpload")
    Observable<UpImgBean> getuploadOne(@Part List<MultipartBody.Part> file);

    //上传信息
    @Multipart
    @Headers({"appType:000", "cid:1","did:1","oCode:1"})
    @POST("v1/m/qiniu/qiniuUpload")
    Observable<PeopleBean> getPeopleUrl(@Field("nickname") String nickname,
                                        @Field("sex") String sex,
                                        @Field("photo") String photo,
                                        @Field("mobile") String mobile,
                                        @Field("mobilePrefix") String mobilePrefix,
                                        @Field("mobileLocation") String mobileLocation,
                                        @Field("psw") String psw);

    @FormUrlEncoded
    @POST("/v1/m/record/bean/detail")
    Observable<JDjiage> XDjiage(@Field("loginUserId") Integer loginUserId);

    @FormUrlEncoded
    @POST("/v1/m/order/save/recharge")
    Observable<JDdingdan> JDdingdan(@Field("buyerId") Integer buyerId, @Field("price") double price, @Field("amount") Integer amount);

    @FormUrlEncoded
    @POST("/v1/m/alipay/params")
    Observable<Zhifu>Zhifu(@Field("orderNo") String orderNo);


}
