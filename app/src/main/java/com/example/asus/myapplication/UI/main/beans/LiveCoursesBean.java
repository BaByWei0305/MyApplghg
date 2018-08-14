package com.example.asus.myapplication.UI.main.beans;

public class LiveCoursesBean {


    /**
     * code : 0
     * message : 成功
     * data : {"replayPath":"http://qiniu.5roo.com/第三课.mp4","coverImg":"http://qiniu.5roo.com/7ea9e873-c22b-4781-94e7-9646c6f1c2e2.jpg","endDate":1526474400000,"subscribe":52,"groupid":null,"photo":"http://qiniu.5roo.com/a79640ef-cd97-42a6-8622-36d45ec17d67.jpg","replay":39.9,"title":"第三节 实战练习\u2014\u2014如何让学会当众孤独","type":"讲堂","isSubscribe":0,"content":"<p><img src=\"http://qiniu.5roo.com/56c8893c-7716-4034-be62-34fc93c101a5.jpg\" style=\"max-width:100%;\"><br><\/p><p><img src=\"http://qiniu.5roo.com/5d22bf69-a46f-463d-9eaf-b604dddc4f0f.jpg\" style=\"max-width:100%;\"><br><\/p><p><img src=\"http://qiniu.5roo.com/5d8cafd1-95e9-49c8-9264-d418c2c5df04.jpg\" style=\"max-width:100%;\"><br><\/p>","realname":"陈雅韩","majorIds":"6","teacherId":459,"subscribeNum":100,"price":39.9,"intro":"台词教师","nickname":"陈雅韩","attention":0,"id":89,"userType":3,"startDate":1526472000000,"liveStatus":2,"isFavorite":0}
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
         * replayPath : http://qiniu.5roo.com/第三课.mp4
         * coverImg : http://qiniu.5roo.com/7ea9e873-c22b-4781-94e7-9646c6f1c2e2.jpg
         * endDate : 1526474400000
         * subscribe : 52
         * groupid : null
         * photo : http://qiniu.5roo.com/a79640ef-cd97-42a6-8622-36d45ec17d67.jpg
         * replay : 39.9
         * title : 第三节 实战练习——如何让学会当众孤独
         * type : 讲堂
         * isSubscribe : 0
         * content : <p><img src="http://qiniu.5roo.com/56c8893c-7716-4034-be62-34fc93c101a5.jpg" style="max-width:100%;"><br></p><p><img src="http://qiniu.5roo.com/5d22bf69-a46f-463d-9eaf-b604dddc4f0f.jpg" style="max-width:100%;"><br></p><p><img src="http://qiniu.5roo.com/5d8cafd1-95e9-49c8-9264-d418c2c5df04.jpg" style="max-width:100%;"><br></p>
         * realname : 陈雅韩
         * majorIds : 6
         * teacherId : 459
         * subscribeNum : 100
         * price : 39.9
         * intro : 台词教师
         * nickname : 陈雅韩
         * attention : 0
         * id : 89
         * userType : 3
         * startDate : 1526472000000
         * liveStatus : 2
         * isFavorite : 0
         */

        private String replayPath;
        private String coverImg;
        private long endDate;
        private int subscribe;
        private Object groupid;
        private String photo;
        private double replay;
        private String title;
        private String type;
        private int isSubscribe;
        private String content;
        private String realname;
        private String majorIds;
        private int teacherId;
        private int subscribeNum;
        private double price;
        private String intro;
        private String nickname;
        private int attention;
        private int id;
        private int userType;
        private long startDate;
        private int liveStatus;
        private int isFavorite;

        public String getReplayPath() {
            return replayPath;
        }

        public void setReplayPath(String replayPath) {
            this.replayPath = replayPath;
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

        public int getSubscribe() {
            return subscribe;
        }

        public void setSubscribe(int subscribe) {
            this.subscribe = subscribe;
        }

        public Object getGroupid() {
            return groupid;
        }

        public void setGroupid(Object groupid) {
            this.groupid = groupid;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public double getReplay() {
            return replay;
        }

        public void setReplay(double replay) {
            this.replay = replay;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getIsSubscribe() {
            return isSubscribe;
        }

        public void setIsSubscribe(int isSubscribe) {
            this.isSubscribe = isSubscribe;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }

        public String getMajorIds() {
            return majorIds;
        }

        public void setMajorIds(String majorIds) {
            this.majorIds = majorIds;
        }

        public int getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(int teacherId) {
            this.teacherId = teacherId;
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

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getAttention() {
            return attention;
        }

        public void setAttention(int attention) {
            this.attention = attention;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public long getStartDate() {
            return startDate;
        }

        public void setStartDate(long startDate) {
            this.startDate = startDate;
        }

        public int getLiveStatus() {
            return liveStatus;
        }

        public void setLiveStatus(int liveStatus) {
            this.liveStatus = liveStatus;
        }

        public int getIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(int isFavorite) {
            this.isFavorite = isFavorite;
        }
    }
}
