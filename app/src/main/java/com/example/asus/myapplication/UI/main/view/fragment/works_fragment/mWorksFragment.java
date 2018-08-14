package com.example.asus.myapplication.UI.main.view.fragment.works_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.adapter.WorksRecycAdapter;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.WorksBean;
import com.example.asus.myapplication.UI.main.base.mBaseFragment;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;
import com.example.asus.myapplication.UI.main.view.fragment.works_activity.mWorksActivity;


import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mWorksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mWorksFragment extends mBaseFragment<MainModel, MainPresenter> implements MainContract.View{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView works_recyclerview;


    public mWorksFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mWorksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static mWorksFragment newInstance(String param1, String param2) {
        mWorksFragment fragment = new mWorksFragment();
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
        Log.e("mWorksFragment---", mParam2);
        presenter.setWorksUrl(String.valueOf(id),mParam2,token);
        works_recyclerview = inflate.findViewById(R.id.works_recyclerview);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_m_works;
    }

    @Override
    public void getMainData(Object bean) {
        WorksBean bean1 = (WorksBean) bean;
        Log.e("mWorksFragment", "bean1---:" + bean1.getMessage());
        List<WorksBean.DataBean.ListBean> list = bean1.getData().getList();
        worksphonto(list);
    }

    private void worksphonto(List<WorksBean.DataBean.ListBean> list) {
        WorksRecycAdapter works_recyc_adapter = new WorksRecycAdapter(R.layout.works_recyc_item,list);
        works_recyclerview.setAdapter(works_recyc_adapter);
        works_recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        works_recyc_adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(),mWorksActivity.class);
                startActivity(intent);
            }
        });
    }
}
