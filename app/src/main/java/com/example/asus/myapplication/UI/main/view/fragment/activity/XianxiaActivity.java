package com.example.asus.myapplication.UI.main.view.fragment.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.example.asus.myapplication.R;
import com.example.asus.myapplication.util.SPUtil;
import com.example.asus.myapplication.UI.main.adapter.XianxiaRecycAdapter;
import com.example.asus.myapplication.UI.main.contract.MainContract;
import com.example.asus.myapplication.UI.main.beans.XianxiaBean;
import com.example.asus.myapplication.UI.main.base.mBaseActivity;
import com.example.asus.myapplication.UI.main.model.MainModel;
import com.example.asus.myapplication.UI.main.presenter.MainPresenter;

import java.util.List;

public class XianxiaActivity extends mBaseActivity<MainModel,MainPresenter> implements MainContract.View{

    private RecyclerView xainxia_recyclerview;

    @Override
    protected void initView() {
        Integer id = (Integer) SPUtil.getInstance().get("id", 1);
        String token = (String) SPUtil.getInstance().get("token", "");
        presenter.setXianxiaUrl(String.valueOf(id),token);
         xainxia_recyclerview = findViewById(R.id.xainxia_recyclerview);


    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_xianxia;
    }

    @Override
    public void getMainData(Object bean) {
        XianxiaBean bean1 = (XianxiaBean) bean;
        Log.e("XianxiaActivity", "bean1:线下沙龙推荐" + bean1.getMessage());
        List<XianxiaBean.DataBean.ListBean> list = bean1.getData().getList();
        initList(list);
    }

    private void initList(List<XianxiaBean.DataBean.ListBean> list) {

        XianxiaRecycAdapter xianxia_recyc_adapter = new XianxiaRecycAdapter(R.layout.xianxia_rec_item,list);

        xainxia_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        xainxia_recyclerview.setAdapter(xianxia_recyc_adapter);



    }
}
