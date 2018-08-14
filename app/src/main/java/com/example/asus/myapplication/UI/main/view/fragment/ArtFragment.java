package com.example.asus.myapplication.UI.main.view.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.adapter.ViewPagerAdapter;
import com.example.asus.myapplication.UI.main.view.fragment.activity.MasterActivity;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.ArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.base.BaseArtFragment;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.mArtFragment;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.model.ArtModel;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.presenter.ArtPresenter;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArtFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArtFragment extends BaseArtFragment<ArtModel, ArtPresenter> implements ArtContract.View{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ViewPager viewpager;
    private TabLayout tablayout;
    List<String> string_tab=new ArrayList<>();
    List<Fragment> fragmentList=new ArrayList<>();
    private Banner art_banner;
    private ViewPagerAdapter art_viewPager_adapter;


    public ArtFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ArtFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ArtFragment newInstance(String param1, String param2) {
        ArtFragment fragment = new ArtFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    protected void initView(View inflate) {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        presenter.setArtUrl(String.valueOf(id),token);
        presenter.setmArtUrl(String.valueOf(id),"0",token);
        string_tab.add("智能筛选");
        string_tab.add("赞数最多");
        string_tab.add("最新评论");
        string_tab.add("本机构");
        tablayout = inflate.findViewById(R.id.tablayout);
        viewpager = inflate.findViewById(R.id.viewpager);
        art_banner = inflate.findViewById(R.id.art_banner);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_art;
    }

    @Override
    public void getArtData(Object bean) {
        ArtBean bean1 = (ArtBean) bean;
        Log.e("ArtFragment", "bean:" + bean1.getMessage());
        List<ArtBean.DataBean.ListBean> list = bean1.getData().getList();
        art_photo(list);
    }

    @Override
    public void getmArtData(Object bean) {
        mArtBean bean1 = (mArtBean) bean;
        Log.e("ArtFragment", "bean1---:" + bean1.getMessage());
        List<mArtBean.DataBean.ArtcircleCategoriesBean> artcircleCategories = bean1.getData().getArtcircleCategories();
        for (int i = 0; i < artcircleCategories.size(); i++) {
            string_tab.add(artcircleCategories.get(i).getName());
        }
        for (int i = 0; i <string_tab.size() ; i++) {
            fragmentList.add(mArtFragment.newInstance(string_tab.get(i),i+""));
        }
        art_viewPager_adapter = new ViewPagerAdapter(getChildFragmentManager(),string_tab,fragmentList);
        viewpager.setAdapter(art_viewPager_adapter);
        tablayout.setupWithViewPager(viewpager);
        viewpager.setOffscreenPageLimit(4);
    }

    private void art_photo(List<ArtBean.DataBean.ListBean> list) {
        List<String> stringphoto=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            stringphoto.add(list.get(i).getMobileImgUrl());
        }
        art_banner.setImages(stringphoto);
        art_banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        art_banner.setBannerAnimation(Transformer.FlipHorizontal);
        art_banner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        art_banner.start();
        art_banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent(getContext(), MasterActivity.class);
                getActivity().startActivity(intent);
                Toast.makeText(getContext(), position+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
