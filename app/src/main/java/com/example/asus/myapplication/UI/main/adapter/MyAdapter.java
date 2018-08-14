package com.example.asus.myapplication.UI.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.asus.myapplication.R;
import com.example.asus.myapplication.UI.main.beans.AccessPreferences;

import java.util.List;

/**
 * Created by asus on 2018/7/29.
 */

public class MyAdapter extends BaseAdapter {
    private List<AccessPreferences.DataBean.MajorsBean> majors;
    private Context mContext;

    public MyAdapter(List<AccessPreferences.DataBean.MajorsBean> majors, Context mContext) {
        this.majors = majors;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return majors.size();
    }

    @Override
    public Object getItem(int position) {
        return majors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
            viewHolder.textView = convertView.findViewById(R.id.tvtv);
            viewHolder.textView.setText(majors.get(position).getName());
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

     class ViewHolder{
        TextView textView;
    }
}
