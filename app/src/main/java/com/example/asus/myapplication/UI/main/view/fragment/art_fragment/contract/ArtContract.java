package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract;



import com.example.asus.myapplication.home.mvp.model.BaseModel;
import com.example.asus.myapplication.home.mvp.presenter.BasePresenter;
import com.example.asus.myapplication.home.mvp.base.BaseView;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtXaingqingBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;

import rx.Observable;

public class ArtContract {

    public interface View extends BaseView {
      void getArtData(Object bean);
      void getmArtData(Object bean);
    }

    public interface Model extends BaseModel {
        Observable<ArtBean> getArtUrl(String loginUserId, String token);
        Observable<mArtBean> getmArtUrl(String loginUserId, String sortord, String token);
        Observable<ArtXaingqingBean> getArtXaingqingUrl(String loginUserId, String artcircleId, String token);
    }

    public abstract static class Presenter extends BasePresenter<Model, View> {
        public abstract void setArtUrl(String loginUserId  , String token);
        public abstract void setmArtUrl(String loginUserId ,String sortord , String token);
        public abstract void setArtXaingqingUrl(String loginUserId ,String artcircleId , String token);
    }
}