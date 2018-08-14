package com.example.asus.myapplication.UI.main.view.fragment.mains_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.adapter.MainsRecycAdaapter;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.MainsBean;
import com.example.asus.myapplication.UI.main.base.mBaseFragment;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.fragment.activity.mMains_Details_Activity;


import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mMains_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mMains_Fragment extends mBaseFragment<MainModel,MainPresenter> implements MainContract.View{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView mains_recyclerview;


    public mMains_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mMains_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static mMains_Fragment newInstance(String param1, String param2) {
        mMains_Fragment fragment = new mMains_Fragment();
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

        presenter.setMainsUrl(String.valueOf(id),mParam1,token);
        mains_recyclerview = inflate.findViewById(R.id.mains_recyclerview);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mains_;
    }

    @Override
    public void getMainData(Object bean) {
        MainsBean bean1 = (MainsBean) bean;
        Log.e("mMains_Fragment", "bean1:" + bean1.getMessage());
        List<MainsBean.DataBean.ListBean> list = bean1.getData().getList();
        mains_recyc(list);

    }

    private void mains_recyc(final List<MainsBean.DataBean.ListBean> list) {
        MainsRecycAdaapter mains_recyc_adaapter = new MainsRecycAdaapter(R.layout.mains_recyc_item,list);
        mains_recyclerview.setAdapter(mains_recyc_adaapter);
        mains_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mains_recyc_adaapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(),mMains_Details_Activity.class);
                intent.putExtra("teacherId",list.get(position).get_$Id193());
                startActivity(intent);
                Toast.makeText(getContext(), list.get(position).get_$Id193()+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
