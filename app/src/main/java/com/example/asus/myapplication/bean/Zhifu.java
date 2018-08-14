package com.example.asus.myapplication.bean;

public class Zhifu {

    /**
     * code : 0
     * message : 成功
     * data : alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_id=2017121300703777&biz_content=%7B%22out_trade_no%22%3A%22180806202856073%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22%E5%85%85%E5%80%BC%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%221.0%22%7D&charset=UTF-8&format=JSON&method=alipay.trade.app.pay&notify_url=https%3A%2F%2Fwww.univstar.com%2Fv1%2Fm%2Falipay%2FnotifyUrl&sign=IlfJQp0eachmJsEL59zX6uWj2R9ha5%2BkTBixkZqu5lt6KUI%2FBCmNxi0MXasgtjC75Qd5b9y849f5x9XOgUjDm6MtrK3OAA3yrLOnEmdvW1tXCLWFmfUWPQaWsGT4jq%2F6NOwep%2B78cKOMrHRORGutNCkL5o%2FYvwtfhmX2rF%2BnQASPPqgoY8321pjCFQV5a1LQxmNlC%2FqVMwHM0wQkEGm12DdpoYBXcYWYxrhDr4xhJSi8h%2F43GTDN9CT%2BHpxLMydj9NVQ2Iztv%2FENgttvcxM5UJ%2F9csL0YiUg0YmasUPrgq5sEJYbxu77%2BSp1P%2BzkvEfHf9KB7cAyLKbG5sHLBZ81yw%3D%3D&sign_type=RSA2&timestamp=2018-08-07+19%3A05%3A32&version=1.0
     */

    private int code;
    private String message;
    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
