package com.example.asus.myapplication.home.mvp.presenter;

public class BasePresenter<M, V> {
    public M m;
    public V v;

    public void setMV(M m, V v) {
        this.m = m;
        this.v = v;
    }

}
