package com.example.asus.myapplication.UI.main.beans;

import java.util.List;

public class ZuoPinBean {

    /**
     * code : 0
     * message : 成功
     * data : {"comments":{"pageNum":1,"pageSize":20,"size":6,"startRow":1,"endRow":6,"total":6,"pages":1,"list":[{"nickname":"神仙也用98k","replyNum":1,"photo":"http://qiniu.5roo.com/b8f4c1efeac341a398c914ab8d7c9abd.jpg","isPraise":0,"praiseNum":0,"id":896,"userType":1,"userId":1633,"content":"很好对我很有帮助 感谢老师","realname":null,"createDate":1532940593000},{"nickname":"雯.","replyNum":0,"photo":"http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg","isPraise":0,"praiseNum":0,"id":920,"userType":1,"userId":1569,"content":"111","realname":null,"createDate":1533267218000},{"nickname":"调戏猫的老鼠","replyNum":0,"photo":"http://qiniu.5roo.com/9c65fc6f561d4f23ac5e15f845bb230e.jpg","isPraise":0,"praiseNum":0,"id":917,"userType":1,"userId":1572,"content":"还可以","realname":null,"createDate":1533190662000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":909,"userType":1,"userId":1605,"content":"多谢老师帮助，指法已经提高很多","realname":null,"createDate":1533108404000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":894,"userType":1,"userId":1605,"content":"非常好，感觉对我很有帮助，谢谢老师","realname":null,"createDate":1532924468000},{"nickname":"勇往直前","replyNum":0,"photo":"http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg","isPraise":0,"praiseNum":0,"id":890,"userType":1,"userId":474,"content":"不错","realname":"贾明","createDate":1532612734000}],"prePage":0,"nextPage":0,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1],"navigateFirstPage":1,"navigateLastPage":1,"firstPage":1,"lastPage":1},"homewok":{"tUserType":6,"coverImg":"http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd?vframe/png/offset/2/w/480/h/270|imageView2/0/w/480/h/270","praiseNum":15,"source":"求教作品","isPeep":0,"content":"想知道初学者通过什么方式能快速掌握指法技巧","studentId":270,"duration":"9\u2032","path":"http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd","peepPrice":1,"tPhoto":"http://qiniu.5roo.com/3a3ac70a4f004435adaa25383807259c.jpg","answerContent":"总体表现不错，继续努力","answerPicProperty":null,"answerPermission":0,"worksType":"视频","giftNum":1,"nickname":"朝阳门山大王","id":312,"tRealname":"马丽莲","createDate":1529484265000,"answerCoverImg":"http://qiniu.5roo.com/FmFNen533ZVMlLafj5t0smYlTPdc","answerDate":1529486589000,"photo":"http://qiniu.5roo.com/a9946cfb-fc66-4051-ad63-e944194248e5.jpg","answerPath":"http://qiniu.5roo.com/522d239368ab47f9b0dc21d73e21aec1","majorIds":"1","commentNum":6,"tIntro":"优秀器乐老师","answerWorksType":"音频","picProperty":"480_270","answerDuration":null,"tUserId":1182,"isPraise":0,"userType":1,"isAnswer":0,"status":2},"rewardUserList":[{"userPhoto":"http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg","userName":"勇往直前","userId":474}]}
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
         * comments : {"pageNum":1,"pageSize":20,"size":6,"startRow":1,"endRow":6,"total":6,"pages":1,"list":[{"nickname":"神仙也用98k","replyNum":1,"photo":"http://qiniu.5roo.com/b8f4c1efeac341a398c914ab8d7c9abd.jpg","isPraise":0,"praiseNum":0,"id":896,"userType":1,"userId":1633,"content":"很好对我很有帮助 感谢老师","realname":null,"createDate":1532940593000},{"nickname":"雯.","replyNum":0,"photo":"http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg","isPraise":0,"praiseNum":0,"id":920,"userType":1,"userId":1569,"content":"111","realname":null,"createDate":1533267218000},{"nickname":"调戏猫的老鼠","replyNum":0,"photo":"http://qiniu.5roo.com/9c65fc6f561d4f23ac5e15f845bb230e.jpg","isPraise":0,"praiseNum":0,"id":917,"userType":1,"userId":1572,"content":"还可以","realname":null,"createDate":1533190662000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":909,"userType":1,"userId":1605,"content":"多谢老师帮助，指法已经提高很多","realname":null,"createDate":1533108404000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":894,"userType":1,"userId":1605,"content":"非常好，感觉对我很有帮助，谢谢老师","realname":null,"createDate":1532924468000},{"nickname":"勇往直前","replyNum":0,"photo":"http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg","isPraise":0,"praiseNum":0,"id":890,"userType":1,"userId":474,"content":"不错","realname":"贾明","createDate":1532612734000}],"prePage":0,"nextPage":0,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1],"navigateFirstPage":1,"navigateLastPage":1,"firstPage":1,"lastPage":1}
         * homewok : {"tUserType":6,"coverImg":"http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd?vframe/png/offset/2/w/480/h/270|imageView2/0/w/480/h/270","praiseNum":15,"source":"求教作品","isPeep":0,"content":"想知道初学者通过什么方式能快速掌握指法技巧","studentId":270,"duration":"9\u2032","path":"http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd","peepPrice":1,"tPhoto":"http://qiniu.5roo.com/3a3ac70a4f004435adaa25383807259c.jpg","answerContent":"总体表现不错，继续努力","answerPicProperty":null,"answerPermission":0,"worksType":"视频","giftNum":1,"nickname":"朝阳门山大王","id":312,"tRealname":"马丽莲","createDate":1529484265000,"answerCoverImg":"http://qiniu.5roo.com/FmFNen533ZVMlLafj5t0smYlTPdc","answerDate":1529486589000,"photo":"http://qiniu.5roo.com/a9946cfb-fc66-4051-ad63-e944194248e5.jpg","answerPath":"http://qiniu.5roo.com/522d239368ab47f9b0dc21d73e21aec1","majorIds":"1","commentNum":6,"tIntro":"优秀器乐老师","answerWorksType":"音频","picProperty":"480_270","answerDuration":null,"tUserId":1182,"isPraise":0,"userType":1,"isAnswer":0,"status":2}
         * rewardUserList : [{"userPhoto":"http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg","userName":"勇往直前","userId":474}]
         */

        private CommentsBean comments;
        private HomewokBean homewok;
        private List<RewardUserListBean> rewardUserList;

        public CommentsBean getComments() {
            return comments;
        }

        public void setComments(CommentsBean comments) {
            this.comments = comments;
        }

        public HomewokBean getHomewok() {
            return homewok;
        }

        public void setHomewok(HomewokBean homewok) {
            this.homewok = homewok;
        }

        public List<RewardUserListBean> getRewardUserList() {
            return rewardUserList;
        }

        public void setRewardUserList(List<RewardUserListBean> rewardUserList) {
            this.rewardUserList = rewardUserList;
        }

        public static class CommentsBean {
            /**
             * pageNum : 1
             * pageSize : 20
             * size : 6
             * startRow : 1
             * endRow : 6
             * total : 6
             * pages : 1
             * list : [{"nickname":"神仙也用98k","replyNum":1,"photo":"http://qiniu.5roo.com/b8f4c1efeac341a398c914ab8d7c9abd.jpg","isPraise":0,"praiseNum":0,"id":896,"userType":1,"userId":1633,"content":"很好对我很有帮助 感谢老师","realname":null,"createDate":1532940593000},{"nickname":"雯.","replyNum":0,"photo":"http://qiniu.5roo.com/187846b2106a41a4ba4713e1f4680369.jpg","isPraise":0,"praiseNum":0,"id":920,"userType":1,"userId":1569,"content":"111","realname":null,"createDate":1533267218000},{"nickname":"调戏猫的老鼠","replyNum":0,"photo":"http://qiniu.5roo.com/9c65fc6f561d4f23ac5e15f845bb230e.jpg","isPraise":0,"praiseNum":0,"id":917,"userType":1,"userId":1572,"content":"还可以","realname":null,"createDate":1533190662000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":909,"userType":1,"userId":1605,"content":"多谢老师帮助，指法已经提高很多","realname":null,"createDate":1533108404000},{"nickname":"神仙也用98K","replyNum":0,"photo":"http://qiniu.5roo.com/ca5e0633-44cf-4fb2-a324-4a9165043e02.jpg","isPraise":0,"praiseNum":0,"id":894,"userType":1,"userId":1605,"content":"非常好，感觉对我很有帮助，谢谢老师","realname":null,"createDate":1532924468000},{"nickname":"勇往直前","replyNum":0,"photo":"http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg","isPraise":0,"praiseNum":0,"id":890,"userType":1,"userId":474,"content":"不错","realname":"贾明","createDate":1532612734000}]
             * prePage : 0
             * nextPage : 0
             * isFirstPage : true
             * isLastPage : true
             * hasPreviousPage : false
             * hasNextPage : false
             * navigatePages : 8
             * navigatepageNums : [1]
             * navigateFirstPage : 1
             * navigateLastPage : 1
             * firstPage : 1
             * lastPage : 1
             */

            private int pageNum;
            private int pageSize;
            private int size;
            private int startRow;
            private int endRow;
            private int total;
            private int pages;
            private int prePage;
            private int nextPage;
            private boolean isFirstPage;
            private boolean isLastPage;
            private boolean hasPreviousPage;
            private boolean hasNextPage;
            private int navigatePages;
            private int navigateFirstPage;
            private int navigateLastPage;
            private int firstPage;
            private int lastPage;
            private List<ListBean> list;
            private List<Integer> navigatepageNums;

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getStartRow() {
                return startRow;
            }

            public void setStartRow(int startRow) {
                this.startRow = startRow;
            }

            public int getEndRow() {
                return endRow;
            }

            public void setEndRow(int endRow) {
                this.endRow = endRow;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public int getPages() {
                return pages;
            }

            public void setPages(int pages) {
                this.pages = pages;
            }

            public int getPrePage() {
                return prePage;
            }

            public void setPrePage(int prePage) {
                this.prePage = prePage;
            }

            public int getNextPage() {
                return nextPage;
            }

            public void setNextPage(int nextPage) {
                this.nextPage = nextPage;
            }

            public boolean isIsFirstPage() {
                return isFirstPage;
            }

            public void setIsFirstPage(boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
            }

            public boolean isIsLastPage() {
                return isLastPage;
            }

            public void setIsLastPage(boolean isLastPage) {
                this.isLastPage = isLastPage;
            }

            public boolean isHasPreviousPage() {
                return hasPreviousPage;
            }

            public void setHasPreviousPage(boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
            }

            public boolean isHasNextPage() {
                return hasNextPage;
            }

            public void setHasNextPage(boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
            }

            public int getNavigatePages() {
                return navigatePages;
            }

            public void setNavigatePages(int navigatePages) {
                this.navigatePages = navigatePages;
            }

            public int getNavigateFirstPage() {
                return navigateFirstPage;
            }

            public void setNavigateFirstPage(int navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
            }

            public int getNavigateLastPage() {
                return navigateLastPage;
            }

            public void setNavigateLastPage(int navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
            }

            public int getFirstPage() {
                return firstPage;
            }

            public void setFirstPage(int firstPage) {
                this.firstPage = firstPage;
            }

            public int getLastPage() {
                return lastPage;
            }

            public void setLastPage(int lastPage) {
                this.lastPage = lastPage;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public List<Integer> getNavigatepageNums() {
                return navigatepageNums;
            }

            public void setNavigatepageNums(List<Integer> navigatepageNums) {
                this.navigatepageNums = navigatepageNums;
            }

            public static class ListBean {
                /**
                 * nickname : 神仙也用98k
                 * replyNum : 1
                 * photo : http://qiniu.5roo.com/b8f4c1efeac341a398c914ab8d7c9abd.jpg
                 * isPraise : 0
                 * praiseNum : 0
                 * id : 896
                 * userType : 1
                 * userId : 1633
                 * content : 很好对我很有帮助 感谢老师
                 * realname : null
                 * createDate : 1532940593000
                 */

                private String nickname;
                private int replyNum;
                private String photo;
                private int isPraise;
                private int praiseNum;
                private int id;
                private int userType;
                private int userId;
                private String content;
                private Object realname;
                private long createDate;

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getReplyNum() {
                    return replyNum;
                }

                public void setReplyNum(int replyNum) {
                    this.replyNum = replyNum;
                }

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public int getIsPraise() {
                    return isPraise;
                }

                public void setIsPraise(int isPraise) {
                    this.isPraise = isPraise;
                }

                public int getPraiseNum() {
                    return praiseNum;
                }

                public void setPraiseNum(int praiseNum) {
                    this.praiseNum = praiseNum;
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

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public Object getRealname() {
                    return realname;
                }

                public void setRealname(Object realname) {
                    this.realname = realname;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }
            }
        }

        public static class HomewokBean {
            /**
             * tUserType : 6
             * coverImg : http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd?vframe/png/offset/2/w/480/h/270|imageView2/0/w/480/h/270
             * praiseNum : 15
             * source : 求教作品
             * isPeep : 0
             * content : 想知道初学者通过什么方式能快速掌握指法技巧
             * studentId : 270
             * duration : 9′
             * path : http://qiniu.5roo.com/FkAZvpsx1_JBpF2Kdl3Ia0frYDtd
             * peepPrice : 1
             * tPhoto : http://qiniu.5roo.com/3a3ac70a4f004435adaa25383807259c.jpg
             * answerContent : 总体表现不错，继续努力
             * answerPicProperty : null
             * answerPermission : 0
             * worksType : 视频
             * giftNum : 1
             * nickname : 朝阳门山大王
             * id : 312
             * tRealname : 马丽莲
             * createDate : 1529484265000
             * answerCoverImg : http://qiniu.5roo.com/FmFNen533ZVMlLafj5t0smYlTPdc
             * answerDate : 1529486589000
             * photo : http://qiniu.5roo.com/a9946cfb-fc66-4051-ad63-e944194248e5.jpg
             * answerPath : http://qiniu.5roo.com/522d239368ab47f9b0dc21d73e21aec1
             * majorIds : 1
             * commentNum : 6
             * tIntro : 优秀器乐老师
             * answerWorksType : 音频
             * picProperty : 480_270
             * answerDuration : null
             * tUserId : 1182
             * isPraise : 0
             * userType : 1
             * isAnswer : 0
             * status : 2
             */

            private int tUserType;
            private String coverImg;
            private int praiseNum;
            private String source;
            private int isPeep;
            private String content;
            private int studentId;
            private String duration;
            private String path;
            private int peepPrice;
            private String tPhoto;
            private String answerContent;
            private Object answerPicProperty;
            private int answerPermission;
            private String worksType;
            private int giftNum;
            private String nickname;
            private int id;
            private String tRealname;
            private long createDate;
            private String answerCoverImg;
            private long answerDate;
            private String photo;
            private String answerPath;
            private String majorIds;
            private int commentNum;
            private String tIntro;
            private String answerWorksType;
            private String picProperty;
            private Object answerDuration;
            private int tUserId;
            private int isPraise;
            private int userType;
            private int isAnswer;
            private int status;

            public int getTUserType() {
                return tUserType;
            }

            public void setTUserType(int tUserType) {
                this.tUserType = tUserType;
            }

            public String getCoverImg() {
                return coverImg;
            }

            public void setCoverImg(String coverImg) {
                this.coverImg = coverImg;
            }

            public int getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(int praiseNum) {
                this.praiseNum = praiseNum;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public int getIsPeep() {
                return isPeep;
            }

            public void setIsPeep(int isPeep) {
                this.isPeep = isPeep;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getStudentId() {
                return studentId;
            }

            public void setStudentId(int studentId) {
                this.studentId = studentId;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getPeepPrice() {
                return peepPrice;
            }

            public void setPeepPrice(int peepPrice) {
                this.peepPrice = peepPrice;
            }

            public String getTPhoto() {
                return tPhoto;
            }

            public void setTPhoto(String tPhoto) {
                this.tPhoto = tPhoto;
            }

            public String getAnswerContent() {
                return answerContent;
            }

            public void setAnswerContent(String answerContent) {
                this.answerContent = answerContent;
            }

            public Object getAnswerPicProperty() {
                return answerPicProperty;
            }

            public void setAnswerPicProperty(Object answerPicProperty) {
                this.answerPicProperty = answerPicProperty;
            }

            public int getAnswerPermission() {
                return answerPermission;
            }

            public void setAnswerPermission(int answerPermission) {
                this.answerPermission = answerPermission;
            }

            public String getWorksType() {
                return worksType;
            }

            public void setWorksType(String worksType) {
                this.worksType = worksType;
            }

            public int getGiftNum() {
                return giftNum;
            }

            public void setGiftNum(int giftNum) {
                this.giftNum = giftNum;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTRealname() {
                return tRealname;
            }

            public void setTRealname(String tRealname) {
                this.tRealname = tRealname;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getAnswerCoverImg() {
                return answerCoverImg;
            }

            public void setAnswerCoverImg(String answerCoverImg) {
                this.answerCoverImg = answerCoverImg;
            }

            public long getAnswerDate() {
                return answerDate;
            }

            public void setAnswerDate(long answerDate) {
                this.answerDate = answerDate;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getAnswerPath() {
                return answerPath;
            }

            public void setAnswerPath(String answerPath) {
                this.answerPath = answerPath;
            }

            public String getMajorIds() {
                return majorIds;
            }

            public void setMajorIds(String majorIds) {
                this.majorIds = majorIds;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public String getTIntro() {
                return tIntro;
            }

            public void setTIntro(String tIntro) {
                this.tIntro = tIntro;
            }

            public String getAnswerWorksType() {
                return answerWorksType;
            }

            public void setAnswerWorksType(String answerWorksType) {
                this.answerWorksType = answerWorksType;
            }

            public String getPicProperty() {
                return picProperty;
            }

            public void setPicProperty(String picProperty) {
                this.picProperty = picProperty;
            }

            public Object getAnswerDuration() {
                return answerDuration;
            }

            public void setAnswerDuration(Object answerDuration) {
                this.answerDuration = answerDuration;
            }

            public int getTUserId() {
                return tUserId;
            }

            public void setTUserId(int tUserId) {
                this.tUserId = tUserId;
            }

            public int getIsPraise() {
                return isPraise;
            }

            public void setIsPraise(int isPraise) {
                this.isPraise = isPraise;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public int getIsAnswer() {
                return isAnswer;
            }

            public void setIsAnswer(int isAnswer) {
                this.isAnswer = isAnswer;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }

        public static class RewardUserListBean {
            /**
             * userPhoto : http://qiniu.5roo.com/267ccbe1-f702-40ad-bd12-9e4fd2f8a593.jpg
             * userName : 勇往直前
             * userId : 474
             */

            private String userPhoto;
            private String userName;
            private int userId;

            public String getUserPhoto() {
                return userPhoto;
            }

            public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }
        }
    }
}
