package com.example.asus.myapplication.bean;

public class LoginBean {

    /**
     * code : 1
     * message : cid为空
     * data : {"nickname":"雯.","mobile":"13931424057","photo":"http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg","id":1569,"userType":1,"token":"eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJxa2M2bDkiLCJzdWIiOiIxNTY5IiwiZXhwIjoxNTMzMjA4ODQ0LCJpYXQiOjE1MzI2MDQwNDR9.HePhEpHv5XkVI-FR9QzwNwnWY-oG5JDOa1k7BCkgCtEhpYtMjsOftiU5l_dHdwnUOdGhvrvpHtxDjeCadZ8djw"}
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
         * nickname : 雯.
         * mobile : 13931424057
         * photo : http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg
         * id : 1569
         * userType : 1
         * token : eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJxa2M2bDkiLCJzdWIiOiIxNTY5IiwiZXhwIjoxNTMzMjA4ODQ0LCJpYXQiOjE1MzI2MDQwNDR9.HePhEpHv5XkVI-FR9QzwNwnWY-oG5JDOa1k7BCkgCtEhpYtMjsOftiU5l_dHdwnUOdGhvrvpHtxDjeCadZ8djw
         */

        private String nickname;
        private String mobile;
        private String photo;
        private int id;
        private int userType;
        private String token;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
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

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
