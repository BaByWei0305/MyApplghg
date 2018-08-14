package com.example.asus.myapplication.UI.main.beans;

import java.util.List;

public class TeacherBean {

    /**
     * code : 0
     * message : 成功
     * data : {"courses":[],"liveCourses":[],"attentionCount":0,"fansCount":0,"praise":{"praiseCount":0,"isPraise":0},"isAttention":0,"liveCount":0,"postsCount":0,"price":0.1,"coachingCount":0,"homewokPublishCount":0,"user":{"birthday":null,"area":"","college":"","country":"","images":"http://qiniu.5roo.com/ba9d0887ff554f2398f8ea030e098eea.jpg","address":"","sex":1,"mobile":"13998188625","photo":"http://qiniu.5roo.com/3738b73d4a98474dae047f42f4a5b280.jpg","teacherCoursePrice":0.1,"skilled":"表演,戏剧文学,编导,播音主持,戏剧表演,影视表演","realname":"崔珍郝","videoPath":"","post":null,"major":"6","intro":"青年演员","nickname":"崔珍郝","details":"<p>毕业于北京电影学院，主要作品有<\/p><p>话剧：《大年初一》女一号饰演母亲&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 《美丽心灵》女一号饰演铁主任&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《雷锋岗》    女二号饰演银行职员等&nbsp;<\/p><p>电影：《盲春》女一号饰演小娟&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《舞夜》女二号饰演雯雯等\r\n小品<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《换妻瓶》饰演妻子&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《意外惊喜》饰演妻子等。<\/p>","id":894,"userType":2,"email":""}}
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
         * courses : []
         * liveCourses : []
         * attentionCount : 0
         * fansCount : 0
         * praise : {"praiseCount":0,"isPraise":0}
         * isAttention : 0
         * liveCount : 0
         * postsCount : 0
         * price : 0.1
         * coachingCount : 0
         * homewokPublishCount : 0
         * user : {"birthday":null,"area":"","college":"","country":"","images":"http://qiniu.5roo.com/ba9d0887ff554f2398f8ea030e098eea.jpg","address":"","sex":1,"mobile":"13998188625","photo":"http://qiniu.5roo.com/3738b73d4a98474dae047f42f4a5b280.jpg","teacherCoursePrice":0.1,"skilled":"表演,戏剧文学,编导,播音主持,戏剧表演,影视表演","realname":"崔珍郝","videoPath":"","post":null,"major":"6","intro":"青年演员","nickname":"崔珍郝","details":"<p>毕业于北京电影学院，主要作品有<\/p><p>话剧：《大年初一》女一号饰演母亲&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 《美丽心灵》女一号饰演铁主任&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《雷锋岗》    女二号饰演银行职员等&nbsp;<\/p><p>电影：《盲春》女一号饰演小娟&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《舞夜》女二号饰演雯雯等\r\n小品<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《换妻瓶》饰演妻子&nbsp;<\/p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《意外惊喜》饰演妻子等。<\/p>","id":894,"userType":2,"email":""}
         */

        private int attentionCount;
        private int fansCount;
        private PraiseBean praise;
        private int isAttention;
        private int liveCount;
        private int postsCount;
        private double price;
        private int coachingCount;
        private int homewokPublishCount;
        private UserBean user;
        private List<?> courses;
        private List<?> liveCourses;

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

        public PraiseBean getPraise() {
            return praise;
        }

        public void setPraise(PraiseBean praise) {
            this.praise = praise;
        }

        public int getIsAttention() {
            return isAttention;
        }

        public void setIsAttention(int isAttention) {
            this.isAttention = isAttention;
        }

        public int getLiveCount() {
            return liveCount;
        }

        public void setLiveCount(int liveCount) {
            this.liveCount = liveCount;
        }

        public int getPostsCount() {
            return postsCount;
        }

        public void setPostsCount(int postsCount) {
            this.postsCount = postsCount;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getCoachingCount() {
            return coachingCount;
        }

        public void setCoachingCount(int coachingCount) {
            this.coachingCount = coachingCount;
        }

        public int getHomewokPublishCount() {
            return homewokPublishCount;
        }

        public void setHomewokPublishCount(int homewokPublishCount) {
            this.homewokPublishCount = homewokPublishCount;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<?> getCourses() {
            return courses;
        }

        public void setCourses(List<?> courses) {
            this.courses = courses;
        }

        public List<?> getLiveCourses() {
            return liveCourses;
        }

        public void setLiveCourses(List<?> liveCourses) {
            this.liveCourses = liveCourses;
        }

        public static class PraiseBean {
            /**
             * praiseCount : 0
             * isPraise : 0
             */

            private int praiseCount;
            private int isPraise;

            public int getPraiseCount() {
                return praiseCount;
            }

            public void setPraiseCount(int praiseCount) {
                this.praiseCount = praiseCount;
            }

            public int getIsPraise() {
                return isPraise;
            }

            public void setIsPraise(int isPraise) {
                this.isPraise = isPraise;
            }
        }

        public static class UserBean {
            /**
             * birthday : null
             * area :
             * college :
             * country :
             * images : http://qiniu.5roo.com/ba9d0887ff554f2398f8ea030e098eea.jpg
             * address :
             * sex : 1
             * mobile : 13998188625
             * photo : http://qiniu.5roo.com/3738b73d4a98474dae047f42f4a5b280.jpg
             * teacherCoursePrice : 0.1
             * skilled : 表演,戏剧文学,编导,播音主持,戏剧表演,影视表演
             * realname : 崔珍郝
             * videoPath :
             * post : null
             * major : 6
             * intro : 青年演员
             * nickname : 崔珍郝
             * details : <p>毕业于北京电影学院，主要作品有</p><p>话剧：《大年初一》女一号饰演母亲&nbsp;</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 《美丽心灵》女一号饰演铁主任&nbsp;</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《雷锋岗》    女二号饰演银行职员等&nbsp;</p><p>电影：《盲春》女一号饰演小娟&nbsp;</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《舞夜》女二号饰演雯雯等
             小品</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《换妻瓶》饰演妻子&nbsp;</p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;《意外惊喜》饰演妻子等。</p>
             * id : 894
             * userType : 2
             * email :
             */

            private Object birthday;
            private String area;
            private String college;
            private String country;
            private String images;
            private String address;
            private int sex;
            private String mobile;
            private String photo;
            private double teacherCoursePrice;
            private String skilled;
            private String realname;
            private String videoPath;
            private Object post;
            private String major;
            private String intro;
            private String nickname;
            private String details;
            private int id;
            private int userType;
            private String email;

            public Object getBirthday() {
                return birthday;
            }

            public void setBirthday(Object birthday) {
                this.birthday = birthday;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCollege() {
                return college;
            }

            public void setCollege(String college) {
                this.college = college;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getImages() {
                return images;
            }

            public void setImages(String images) {
                this.images = images;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
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

            public double getTeacherCoursePrice() {
                return teacherCoursePrice;
            }

            public void setTeacherCoursePrice(double teacherCoursePrice) {
                this.teacherCoursePrice = teacherCoursePrice;
            }

            public String getSkilled() {
                return skilled;
            }

            public void setSkilled(String skilled) {
                this.skilled = skilled;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getVideoPath() {
                return videoPath;
            }

            public void setVideoPath(String videoPath) {
                this.videoPath = videoPath;
            }

            public Object getPost() {
                return post;
            }

            public void setPost(Object post) {
                this.post = post;
            }

            public String getMajor() {
                return major;
            }

            public void setMajor(String major) {
                this.major = major;
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

            public String getDetails() {
                return details;
            }

            public void setDetails(String details) {
                this.details = details;
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

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
    }
}
