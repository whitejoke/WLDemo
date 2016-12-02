package com.hdit.wldemo.mvp.Bean;

/**
 * Created by joker on 2016/11/25.
 */

public class ForgetPasswordBean {

    /**
     * type : 1
     * message : 验证邮件发送成功
     * msgDetail : null
     * result : {"code":581962}
     */

    private int type;
    private String message;
    private Object msgDetail;
    /**
     * code : 581962
     */

    private ResultBean result;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getMsgDetail() {
        return msgDetail;
    }

    public void setMsgDetail(Object msgDetail) {
        this.msgDetail = msgDetail;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
