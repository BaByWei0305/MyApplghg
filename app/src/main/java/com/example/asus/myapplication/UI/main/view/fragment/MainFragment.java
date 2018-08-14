package com.example.asus.myapplication.UI.main.view.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity.KechengActivity;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.adapter.RecycAdapter;
import com.example.asus.myapplication.UI.main.adapter.JobRecycAdapter;
import com.example.asus.myapplication.UI.main.adapter.MainRecycAdapter;
import com.example.asus.myapplication.UI.main.adapter.UnderlineRecycAdapter;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.MainBean;
import com.example.asus.myapplication.UI.main.base.mBaseFragment;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.activity.YiKaoActivity;
import com.example.asus.myapplication.UI.main.view.fragment.activity.MasterActivity;
import com.example.asus.myapplication.UI.main.view.fragment.activity.XianxiaActivity;
import com.example.asus.myapplication.UI.main.view.fragment.activity.XiehuiActivity;
import com.example.asus.myapplication.UI.main.view.fragment.activity.mMains_Details_Activity;
import com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity.Main_Liaotian_Activity;
import com.example.asus.myapplication.UI.main.view.fragment.Xingqu_activity.XiangqingActivity;
import com.example.asus.myapplication.UI.main.view.fragment.main_livecourses_activity.LiveCoursesActivity;
import com.xubo.scrolltextview.ScrollTextView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import static com.example.asus.myapplication.UI.main.MainPageActivity.mBottomTabBar;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends mBaseFragment<MainModel, MainPresenter> implements MainContract.View, View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Banner banner;
    private RecyclerView recyclerview;
    private RecyclerView course_recyclerview;
    private RecyclerView underline_recyclerview;
    private RecyclerView job_recyclerview;
    private ScrollTextView scrolltextview;
    private ImageView main_xiehui_img;
    private ImageView xian_xia_tuijian;
    private ImageView main_gengduo_tab;
    private ImageView main_kecheng_tuijian_tab;
    private ImageView fabu;


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
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
        presenter.setMainUrl(String.valueOf(id),token);
        banner = inflate.findViewById(R.id.banner);
        recyclerview = inflate.findViewById(R.id.recyclerview);
        course_recyclerview = inflate.findViewById(R.id.course_recyclerview);
        underline_recyclerview = inflate.findViewById(R.id.underline_recyclerview);
        job_recyclerview = inflate.findViewById(R.id.job_recyclerview);
        scrolltextview = inflate.findViewById(R.id.scrolltextview);
        main_xiehui_img = inflate.findViewById(R.id.main_xiehui_img);
        xian_xia_tuijian = inflate.findViewById(R.id.xian_xia_tuijian);
        main_gengduo_tab = inflate.findViewById(R.id.main_gengduo_tab);
        main_kecheng_tuijian_tab = inflate.findViewById(R.id.main_kecheng_tuijian_tab);
        fabu = inflate.findViewById(R.id.fabu);
        main_xiehui_img.setOnClickListener(this);
        xian_xia_tuijian.setOnClickListener(this);
        main_gengduo_tab.setOnClickListener(this);
        main_kecheng_tuijian_tab.setOnClickListener(this);
        fabu.setOnClickListener(this);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    public void getMainData(Object bean) {
        MainBean bean1 = (MainBean) bean;
        Log.e("MainFragment", "bean:" + bean1.getData().getHomewokTitle());
        List<MainBean.DataBean.SystemAdsBean> systemAds = bean1.getData().getSystemAds();
        List<MainBean.DataBean.ArtcirclesBean> artcircles = bean1.getData().getArtcircles();
        List<MainBean.DataBean.UsersBean> users = bean1.getData().getUsers();
        List<MainBean.DataBean.LiveCoursesBean> liveCourses = bean1.getData().getLiveCourses();
        List<MainBean.DataBean.OfflineCourseBean> offlineCourse = bean1.getData().getOfflineCourse();
        List<MainBean.DataBean.HomewoksBean> homewoks = bean1.getData().getHomewoks();
        mBeanner(systemAds);
        mText(artcircles);
        Recyc(users);
        courseRecyc(liveCourses);
        underline(offlineCourse);
        homewokRecyc(homewoks);

    }

    private void homewokRecyc(final List<MainBean.DataBean.HomewoksBean> homewoks) {
        JobRecycAdapter job_recycAdapter = new JobRecycAdapter(R.layout.job_recyc_item,homewoks);
        job_recyclerview.setAdapter(job_recycAdapter);
        job_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        job_recycAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent=new Intent(getContext(), Main_Liaotian_Activity.class);
                intent.putExtra("id",homewoks.get(position).getId());
                startActivity(intent);
            }
        });
    }

    private void underline(final List<MainBean.DataBean.OfflineCourseBean> offlineCourse) {
        UnderlineRecycAdapter underline_recycAdapter = new UnderlineRecycAdapter(R.layout.underline_recycl_item,offlineCourse);
        underline_recyclerview.setAdapter(underline_recycAdapter);
        underline_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        underline_recycAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(), XiangqingActivity.class);
                intent.putExtra("id",offlineCourse.get(position).getId());
                startActivity(intent);
            }
        });

    }

    private void courseRecyc(final List<MainBean.DataBean.LiveCoursesBean> liveCourses) {
        RecycAdapter course_recycAdapter = new RecycAdapter(R.layout.course_recycl_item,liveCourses);
        course_recyclerview.setAdapter(course_recycAdapter);
        course_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        course_recycAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(), LiveCoursesActivity.class);
                int id = liveCourses.get(position).getId();
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }

    private void Recyc(final List<MainBean.DataBean.UsersBean> users) {
        MainRecycAdapter main_recycAdapter = new MainRecycAdapter(R.layout.main_recycl_item,users);
        recyclerview.setAdapter(main_recycAdapter);
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        main_recycAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(),mMains_Details_Activity.class);
                intent.putExtra("teacherId",users.get(position).getId());
                startActivity(intent);
            }
        });
    }

    private void mText(List<MainBean.DataBean.ArtcirclesBean> artcircles) {
        final ArrayList<String> stringtexts=new ArrayList<>();
        for (int i = 0; i <artcircles.size() ; i++) {
            stringtexts.add(artcircles.get(i).getTitle());
        }
        scrolltextview.setTextContent(stringtexts);

        scrolltextview.startTextScroll();


    }

    private void mBeanner(List<MainBean.DataBean.SystemAdsBean> systemAds) {
        List<String> imgList=new ArrayList<>();
        for (int i = 0; i <systemAds.size() ; i++) {
            imgList.add(systemAds.get(i).getMobileImgUrl());
        }
        banner.setImages(imgList);
        banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context)
                        .load(path)
                        .into(imageView);//正常加载图片
            }
        });
        banner.setDelayTime(3000);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.FlipHorizontal);
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        banner.start();
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent(getContext(), MasterActivity.class);
                getActivity().startActivity(intent);
                Toast.makeText(getContext(), position+"", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_xiehui_img :
                Intent intent=new Intent(getContext(), XiehuiActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.xian_xia_tuijian :
                Intent intent1=new Intent(getContext(), XianxiaActivity.class);
                getActivity().startActivity(intent1);
                break;
            case R.id.main_gengduo_tab :
                Intent intent2=new Intent(getContext(), KechengActivity.class);
                getActivity().startActivity(intent2);
                break;
            case R.id.main_kecheng_tuijian_tab :
                mBottomTabBar.setCurrentTab(2);
                break;
            case R.id.fabu :
                Intent intent3=new Intent(getContext(), YiKaoActivity.class);
                getActivity().startActivity(intent3);
                break;
        }
    }
}
