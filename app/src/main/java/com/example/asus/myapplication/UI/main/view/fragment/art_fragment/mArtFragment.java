package com.example.asus.myapplication.UI.main.view.fragment.art_fragment;


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
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.adapter.ArtRecycAdapter;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans.mArtBean;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.yishu_xiangqing.Art_Xiangqing_Activity;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.base.BaseArtFragment;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.contract.ArtContract;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.model.ArtModel;
import com.example.asus.myapplication.UI.main.view.fragment.art_fragment.presenter.ArtPresenter;


import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mArtFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mArtFragment extends BaseArtFragment<ArtModel, ArtPresenter> implements ArtContract.View {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView art_recyclervice;


    public mArtFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mArtFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static mArtFragment newInstance(String param1, String param2) {
        mArtFragment fragment = new mArtFragment();
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
        presenter.setmArtUrl(String.valueOf(id),mParam2,token);
        art_recyclervice = inflate.findViewById(R.id.art_recyclervice);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_m_art;
    }

    @Override
    public void getArtData(Object bean) {

    }

    @Override
    public void getmArtData(Object bean) {
        mArtBean bean1 = (mArtBean) bean;
        Log.e("mArtFragment", "bean:" + bean1.getMessage());
        final List<mArtBean.DataBean.ArtcircleListBean.ListBean> list = bean1.getData().getArtcircleList().getList();
        ArtRecycAdapter art_recyc_adapter = new ArtRecycAdapter(R.layout.art_recyc_item,list);
        art_recyclervice.setAdapter(art_recyc_adapter);
        art_recyclervice.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        art_recyc_adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(),Art_Xiangqing_Activity.class);
                int id = list.get(position).getId();
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}
