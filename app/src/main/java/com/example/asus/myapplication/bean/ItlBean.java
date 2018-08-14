package com.example.asus.myapplication.bean;

import java.util.List;

public class ItlBean {

    /**
     * code : 0
     * message : 成功
     * data : [{"orgCover":"http://qiniu.5roo.com/8d447844d8fe4676960fe1a11714caba.jpg","organizationName":"测试模拟机构1","organizationCode":"350010"}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * orgCover : http://qiniu.5roo.com/8d447844d8fe4676960fe1a11714caba.jpg
         * organizationName : 测试模拟机构1
         * organizationCode : 350010
         */

        private String orgCover;
        private String organizationName;
        private String organizationCode;

        public String getOrgCover() {
            return orgCover;
        }

        public void setOrgCover(String orgCover) {
            this.orgCover = orgCover;
        }

        public String getOrganizationName() {
            return organizationName;
        }

        public void setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
        }

        public String getOrganizationCode() {
            return organizationCode;
        }

        public void setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
        }
    }
}
