package com.hdit.wldemo.mvp.Bean;

/**
 * Created by joker on 2016/11/22.
 */

public class RegisterBean {

    /**
     * type : 1
     * message : success
     * msgDetail : null
     * result : {"status":1}
     */

    private int type;
    private String message;
    private Object msgDetail;
    /**
     * status : 1
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
        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
