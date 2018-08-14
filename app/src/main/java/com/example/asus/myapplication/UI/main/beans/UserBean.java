package com.example.asus.myapplication.UI.main.beans;

public class UserBean {

    /**
     * code : 0
     * message : 成功
     * data : {"flowerCount":0,"artcircleCount":0,"isPreference":1,"orgName":"测试模拟机构1","mobile":"13931424057","photo":"http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg","attentionCount":0,"fansCount":0,"userId":1569,"realname":null,"homewokCount":0,"beanAmount":0,"majors":"音乐、表演、美术、舞蹈","intro":null,"nickname":"雯.","coachingCount":0,"userType":1,"isauth":0,"favoriteCount":0}
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
         * flowerCount : 0
         * artcircleCount : 0
         * isPreference : 1
         * orgName : 测试模拟机构1
         * mobile : 13931424057
         * photo : http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg
         * attentionCount : 0
         * fansCount : 0
         * userId : 1569
         * realname : null
         * homewokCount : 0
         * beanAmount : 0
         * majors : 音乐、表演、美术、舞蹈
         * intro : null
         * nickname : 雯.
         * coachingCount : 0
         * userType : 1
         * isauth : 0
         * favoriteCount : 0
         */

        private int flowerCount;
        private int artcircleCount;
        private int isPreference;
        private String orgName;
        private String mobile;
        private String photo;
        private int attentionCount;
        private int fansCount;
        private int userId;
        private Object realname;
        private int homewokCount;
        private int beanAmount;
        private String majors;
        private Object intro;
        private String nickname;
        private int coachingCount;
        private int userType;
        private int isauth;
        private int favoriteCount;

        public int getFlowerCount() {
            return flowerCount;
        }

        public void setFlowerCount(int flowerCount) {
            this.flowerCount = flowerCount;
        }

        public int getArtcircleCount() {
            return artcircleCount;
        }

        public void setArtcircleCount(int artcircleCount) {
            this.artcircleCount = artcircleCount;
        }

        public int getIsPreference() {
            return isPreference;
        }

        public void setIsPreference(int isPreference) {
            this.isPreference = isPreference;
        }

        public String getOrgName() {
            return orgName;
        }

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public int getAttentionCount() {
            return attentionCount;
        }

        public void setAttentionCount(int attentionCount) {
            this.attentionCount = attentionCount;
        }

        public int getFansCount() {
            return fansCount;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public Object getRealname() {
            return realname;
        }

        public void setRealname(Object realname) {
            this.realname = realname;
        }

        public int getHomewokCount() {
            return homewokCount;
        }

        public void setHomewokCount(int homewokCount) {
            this.homewokCount = homewokCount;
        }

        public int getBeanAmount() {
            return beanAmount;
        }

        public void setBeanAmount(int beanAmount) {
            this.beanAmount = beanAmount;
        }

        public String getMajors() {
            return majors;
        }

        public void setMajors(String majors) {
            this.majors = majors;
        }

        public Object getIntro() {
            return intro;
        }

        public void setIntro(Object intro) {
            this.intro = intro;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getCoachingCount() {
            return coachingCount;
        }

        public void setCoachingCount(int coachingCount) {
            this.coachingCount = coachingCount;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public int getIsauth() {
            return isauth;
        }

        public void setIsauth(int isauth) {
            this.isauth = isauth;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }
    }
}
