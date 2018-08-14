package com.example.asus.myapplication.UI.main.beans;

public class OfflineBean {

    /**
     * code : 0
     * message : 成功
     * data : {"address":"北京奥体中心","coverImg":"http://qiniu.5roo.com/5b7db396-fe2f-4c5f-8b24-f7b9b1d73c32.04.30.jpg","endDate":1527929344000,"collegeIds":"12","reservationNum":20,"mobile":"14222222222","isReservation":0,"title":"音乐艺考通关秘籍","courseContent":"<h1><font color=\"#f9963b\"><b>音乐通关大秘籍，祝你成功过艺考？<\/b><\/font><\/h1><p><img src=\"http://qiniu.5roo.com/9a2bcd55-bf17-4ee9-91ee-5846cb15f6d4.jpg\" style=\"max-width:100%;\"><br><\/p><p><img src=\"http://qiniu.5roo.com/7590b737-2842-4793-8ebc-a5fd77ea2882.jpg\" style=\"max-width:100%;\"><br><\/p><p><img src=\"http://qiniu.5roo.com/8d73c7d5-7171-4592-ba56-c39a60c088d7.jpg\" style=\"max-width:100%;\"><br><\/p><p><br><\/p>","majorIds":"1","subscribeNum":100,"price":0.1,"id":78,"favorite":0,"startDate":1527929333000,"courseVideoPath":""}
     */

    private int code;
    private String message;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * address : 北京奥体中心
         * coverImg : http://qiniu.5roo.com/5b7db396-fe2f-4c5f-8b24-f7b9b1d73c32.04.30.jpg
         * endDate : 1527929344000
         * collegeIds : 12
         * reservationNum : 20
         * mobile : 14222222222
         * isReservation : 0
         * title : 音乐艺考通关秘籍
         * courseContent : <h1><font color="#f9963b"><b>音乐通关大秘籍，祝你成功过艺考？</b></font></h1><p><img src="http://qiniu.5roo.com/9a2bcd55-bf17-4ee9-91ee-5846cb15f6d4.jpg" style="max-width:100%;"><br></p><p><img src="http://qiniu.5roo.com/7590b737-2842-4793-8ebc-a5fd77ea2882.jpg" style="max-width:100%;"><br></p><p><img src="http://qiniu.5roo.com/8d73c7d5-7171-4592-ba56-c39a60c088d7.jpg" style="max-width:100%;"><br></p><p><br></p>
         * majorIds : 1
         * subscribeNum : 100
         * price : 0.1
         * id : 78
         * favorite : 0
         * startDate : 1527929333000
         * courseVideoPath :
         */

        private String address;
        private String coverImg;
        private long endDate;
        private String collegeIds;
        private int reservationNum;
        private String mobile;
        private int isReservation;
        private String title;
        private String courseContent;
        private String majorIds;
        private int subscribeNum;
        private double price;
        private int id;
        private int favorite;
        private long startDate;
        private String courseVideoPath;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCoverImg() {
            return coverImg;
        }

        public void setCoverImg(String coverImg) {
            this.coverImg = coverImg;
        }

        public long getEndDate() {
            return endDate;
        }

        public void setEndDate(long endDate) {
            this.endDate = endDate;
        }

        public String getCollegeIds() {
            return collegeIds;
        }

        public void setCollegeIds(String collegeIds) {
            this.collegeIds = collegeIds;
        }

        public int getReservationNum() {
            return reservationNum;
        }

        public void setReservationNum(int reservationNum) {
            this.reservationNum = reservationNum;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getIsReservation() {
            return isReservation;
        }

        public void setIsReservation(int isReservation) {
            this.isReservation = isReservation;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCourseContent() {
            return courseContent;
        }

        public void setCourseContent(String courseContent) {
            this.courseContent = courseContent;
        }

        public String getMajorIds() {
            return majorIds;
        }

        public void setMajorIds(String majorIds) {
            this.majorIds = majorIds;
        }

        public int getSubscribeNum() {
            return subscribeNum;
        }

        public void setSubscribeNum(int subscribeNum) {
            this.subscribeNum = subscribeNum;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public long getStartDate() {
            return startDate;
        }

        public void setStartDate(long startDate) {
            this.startDate = startDate;
        }

        public String getCourseVideoPath() {
            return courseVideoPath;
        }

        public void setCourseVideoPath(String courseVideoPath) {
            this.courseVideoPath = courseVideoPath;
        }
    }
}
