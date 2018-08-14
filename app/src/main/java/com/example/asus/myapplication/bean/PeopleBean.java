package com.example.asus.myapplication.bean;

public class PeopleBean {

    /**
     * code : 0
     * message : 成功
     * data : {"nickname":"7387293","mobile":null,"photo":"http://qiniu.5roo.com/a7403589-54e6-4a25-b0f7-e1190c8f6b8c.png","id":1660,"userType":null,"token":"eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJ1OTJxM2MiLCJzdWIiOiIxNjYwIiwiZXhwIjoxNTMzMzY0NDM1LCJpYXQiOjE1MzI3NTk2MzV9.q7KenB0aFoRQAkwQlsLGIQUWooph0fNWfhglGCHE2oToE1qMe8xiJA1qUilpdjjTdnJ7i-HwMrcAe_jAtLwTEg"}
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
         * nickname : 7387293
         * mobile : null
         * photo : http://qiniu.5roo.com/a7403589-54e6-4a25-b0f7-e1190c8f6b8c.png
         * id : 1660
         * userType : null
         * token : eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJ1OTJxM2MiLCJzdWIiOiIxNjYwIiwiZXhwIjoxNTMzMzY0NDM1LCJpYXQiOjE1MzI3NTk2MzV9.q7KenB0aFoRQAkwQlsLGIQUWooph0fNWfhglGCHE2oToE1qMe8xiJA1qUilpdjjTdnJ7i-HwMrcAe_jAtLwTEg
         */

        private String nickname;
        private Object mobile;
        private String photo;
        private int id;
        private Object userType;
        private String token;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Object getMobile() {
            return mobile;
        }

        public void setMobile(Object mobile) {
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

        public Object getUserType() {
            return userType;
        }

        public void setUserType(Object userType) {
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
