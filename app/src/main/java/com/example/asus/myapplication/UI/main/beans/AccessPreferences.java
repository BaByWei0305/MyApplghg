package com.example.asus.myapplication.UI.main.beans;

import java.util.List;

/**
 * Created by asus on 2018/7/29.
 */

public class AccessPreferences {

    /**
     * code : 0
     * message : 成功
     * data : {"majors":[{"id":6,"page":1,"rows":20,"pId":0,"name":"表演","sortord":8,"intro":"表演，旨在培养具有一定的基本理论素养，并具备和掌握表演艺术的基本理论和基本技巧，能够在戏剧、戏曲、电影、电视和舞蹈等表演中独立完成不同人物形象创作的高级专门人才。\r\n","photo":"http://qiniu.5roo.com/b93a8ea1-93ea-4100-8c5a-97165222d71f.jpg","thumbPhoto":"http://qiniu.5roo.com/0a726477-248b-45a9-8ebe-7378497c8bc3.jpg","color":"#7ED321"},{"id":32,"page":1,"rows":20,"pId":0,"name":"舞蹈","sortord":7,"intro":"舞蹈的任务是，以其掌握的舞蹈动作、造型和技巧能力，结合音乐和美术等艺术手段，将作品的思想内容转化为可视可感的舞蹈形象。","photo":"http://qiniu.5roo.com/6e5ba2d0-5b9d-4ca9-bdc4-8fc51b2bea58.jpg","thumbPhoto":"http://qiniu.5roo.com/292a419e-b0c1-4bca-a5eb-231e38764c10.jpg","color":"#F35633"},{"id":7,"page":1,"rows":20,"pId":0,"name":"美术","sortord":6,"intro":"美术专业为美术史论、美术教育领域培养教学和科研，美术评论和编辑、艺术管理和博物馆等方面的高级专门人才，学生毕业后能从事美术教育、美术研究、文博艺术管理、新闻出版等方面的工作。","photo":"http://qiniu.5roo.com/171c4295-cc47-42f6-a116-6f1ae046e192.jpg","thumbPhoto":"http://qiniu.5roo.com/0d717efd-47be-4d36-b897-e92849fc743a.jpg","color":"#5491FF"},{"id":1,"page":1,"rows":20,"pId":0,"name":"音乐","sortord":4,"intro":"音乐，分为声乐和器乐。","photo":"http://qiniu.5roo.com/396dbe91-a8a1-4ee9-8109-6192ed734e28.jpg","thumbPhoto":"http://qiniu.5roo.com/6babe952-5b9e-4849-b80b-8dda43b8d18e.jpg","color":"#F5A623"}],"colleges":[{"id":1,"page":1,"rows":20,"name":"中央音乐学院","sortord":1},{"id":2,"page":1,"rows":20,"name":"中央美术学院","sortord":2},{"id":3,"page":1,"rows":20,"name":"中央戏剧学院","sortord":3},{"id":4,"page":1,"rows":20,"name":"北京电影学院","sortord":4},{"id":5,"page":1,"rows":20,"name":"北京舞蹈学院","sortord":5},{"id":6,"page":1,"rows":20,"name":"鲁迅美术学院","sortord":6},{"id":7,"page":1,"rows":20,"name":"上海戏剧学院","sortord":7},{"id":8,"page":1,"rows":20,"name":"中国戏曲学院","sortord":8},{"id":9,"page":1,"rows":20,"name":"南京艺术学院","sortord":9},{"id":10,"page":1,"rows":20,"name":"四川美术学院","sortord":10},{"id":11,"page":1,"rows":20,"name":"四川音乐学院","sortord":11},{"id":12,"page":1,"rows":20,"name":"沈阳音乐学院","sortord":12},{"id":14,"page":1,"rows":20,"name":"中国音乐学院","sortord":13},{"id":15,"page":1,"rows":20,"name":"中央工艺美术学院","sortord":null},{"id":16,"page":1,"rows":20,"name":"北京师范大学","sortord":null},{"id":17,"page":1,"rows":20,"name":"山西工商学院","sortord":null},{"id":19,"page":1,"rows":20,"name":"武汉音乐学院","sortord":null},{"id":20,"page":1,"rows":20,"name":"中南民族大学","sortord":null},{"id":21,"page":1,"rows":20,"name":"河北传媒学院","sortord":null},{"id":23,"page":1,"rows":20,"name":"陕西师范大学","sortord":null},{"id":25,"page":1,"rows":20,"name":"西安培华学院","sortord":null},{"id":26,"page":1,"rows":20,"name":"北京现代音乐学院","sortord":null},{"id":27,"page":1,"rows":20,"name":"中国传媒大学","sortord":null},{"id":28,"page":1,"rows":20,"name":"首都师范大学","sortord":null},{"id":29,"page":1,"rows":20,"name":"广东外语外贸大学","sortord":null},{"id":30,"page":1,"rows":20,"name":"广州美术学院","sortord":null},{"id":31,"page":1,"rows":20,"name":"东北农业大学","sortord":null},{"id":32,"page":1,"rows":20,"name":"英国伦敦大学","sortord":null},{"id":33,"page":1,"rows":20,"name":"首都师范大学科德学院","sortord":null},{"id":34,"page":1,"rows":20,"name":"对外经贸大学","sortord":null},{"id":35,"page":1,"rows":20,"name":"重庆大学美视电影学院","sortord":null},{"id":36,"page":1,"rows":20,"name":"北京联合大学","sortord":null},{"id":37,"page":1,"rows":20,"name":"清华大学美术学院","sortord":null},{"id":40,"page":1,"rows":20,"name":"北京舞蹈学院附中","sortord":null},{"id":41,"page":1,"rows":20,"name":"北京体育大学","sortord":null},{"id":42,"page":1,"rows":20,"name":"北京大学","sortord":null},{"id":43,"page":1,"rows":20,"name":"法国GPSO大巴黎国立音乐学院","sortord":null},{"id":44,"page":1,"rows":20,"name":"中央民族大学","sortord":null},{"id":45,"page":1,"rows":20,"name":"井冈山大学","sortord":null},{"id":46,"page":1,"rows":20,"name":"印度国立大学","sortord":null},{"id":47,"page":1,"rows":20,"name":"美国Oberlin音乐学院","sortord":null},{"id":48,"page":1,"rows":20,"name":"南昌教育学院","sortord":null}]}
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
        private List<MajorsBean> majors;
        private List<CollegesBean> colleges;

        public List<MajorsBean> getMajors() {
            return majors;
        }

        public void setMajors(List<MajorsBean> majors) {
            this.majors = majors;
        }

        public List<CollegesBean> getColleges() {
            return colleges;
        }

        public void setColleges(List<CollegesBean> colleges) {
            this.colleges = colleges;
        }

        public static class MajorsBean {
            /**
             * id : 6
             * page : 1
             * rows : 20
             * pId : 0
             * name : 表演
             * sortord : 8
             * intro : 表演，旨在培养具有一定的基本理论素养，并具备和掌握表演艺术的基本理论和基本技巧，能够在戏剧、戏曲、电影、电视和舞蹈等表演中独立完成不同人物形象创作的高级专门人才。

             * photo : http://qiniu.5roo.com/b93a8ea1-93ea-4100-8c5a-97165222d71f.jpg
             * thumbPhoto : http://qiniu.5roo.com/0a726477-248b-45a9-8ebe-7378497c8bc3.jpg
             * color : #7ED321
             */

            private int id;
            private int page;
            private int rows;
            private int pId;
            private String name;
            private int sortord;
            private String intro;
            private String photo;
            private String thumbPhoto;
            private String color;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getRows() {
                return rows;
            }

            public void setRows(int rows) {
                this.rows = rows;
            }

            public int getPId() {
                return pId;
            }

            public void setPId(int pId) {
                this.pId = pId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSortord() {
                return sortord;
            }

            public void setSortord(int sortord) {
                this.sortord = sortord;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getThumbPhoto() {
                return thumbPhoto;
            }

            public void setThumbPhoto(String thumbPhoto) {
                this.thumbPhoto = thumbPhoto;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }

        public static class CollegesBean {
            /**
             * id : 1
             * page : 1
             * rows : 20
             * name : 中央音乐学院
             * sortord : 1
             */

            private int id;
            private int page;
            private int rows;
            private String name;
            private int sortord;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getRows() {
                return rows;
            }

            public void setRows(int rows) {
                this.rows = rows;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSortord() {
                return sortord;
            }

            public void setSortord(int sortord) {
                this.sortord = sortord;
            }
        }
    }
}
