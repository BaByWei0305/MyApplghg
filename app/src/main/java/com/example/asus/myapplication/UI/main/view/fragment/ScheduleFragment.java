package com.example.asus.myapplication.UI.main.view.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.view.activity.XuanzeActivity;


public class ScheduleFragment extends Fragment implements View.OnClickListener {

    private String mParam1;
    private String mParam2;
    private View inflate;
    private TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fragment_schedule, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        tv = (TextView) inflate.findViewById(R.id.tv);

        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), XuanzeActivity.class);
                startActivity(intent);
            }
        });
    }
}
