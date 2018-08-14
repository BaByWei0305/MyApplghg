package com.example.asus.myapplication.api.app;

import android.app.Application;

import com.example.asus.myapplication.util.SUtils;


public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SUtils.initialize(this);
    }
}
