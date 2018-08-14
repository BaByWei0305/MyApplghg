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
 * Created by asus on 2018/7/30.
 */

public class Adapter1 extends BaseAdapter {
    private List<AccessPreferences.DataBean.MajorsBean> majors;
    private Context mContext;

    public Adapter1(List<AccessPreferences.DataBean.MajorsBean> majors, Context mContext) {
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
        Adapter1.ViewHolder viewHolder;
        if (convertView == null) {

            ViewHolder viewHolder1 = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
            viewHolder1.textView = convertView.findViewById(R.id.tvtv);
            viewHolder1.textView.setText(majors.get(position).getName());
            convertView.setTag(viewHolder1);

        } else {

            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    class ViewHolder{
        TextView textView;
    }
}
