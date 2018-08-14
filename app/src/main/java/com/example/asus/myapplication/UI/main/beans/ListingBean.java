package com.example.asus.myapplication.UI.main.beans;

public class ListingBean {
    public String tab_name;
    public String tab_id;

    public ListingBean(String tab_name, String tab_id) {
        this.tab_name = tab_name;
        this.tab_id = tab_id;
    }

    public String getTab_name() {
        return tab_name;
    }

    public void setTab_name(String tab_name) {
        this.tab_name = tab_name;
    }

    public String getTab_id() {
        return tab_id;
    }

    public void setTab_id(String tab_id) {
        this.tab_id = tab_id;
    }

    @Override
    public String toString() {
        return "ListingBean{" +
                "tab_name='" + tab_name + '\'' +
                ", tab_id='" + tab_id + '\'' +
                '}';
    }
}
