package com.example.asus.myapplication.bean;

public class UpImgBean {

    /**
     * code : 0
     * message : 成功
     * data : {"fileName":"http://qiniu.5roo.com/e7640ccd-4737-4e1d-a0c3-83f40d86342f.png"}
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
         * fileName : http://qiniu.5roo.com/e7640ccd-4737-4e1d-a0c3-83f40d86342f.png
         */

        private String fileName;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }
}

