package com.hdit.wldemo.mvp.Bean;

/**
 * Created by joker on 2017/1/3.
 */

public class UserForEmp {

    /**
     * type : 1
     * message : success
     * msgDetail : null
     * result : {"data":{"id":44,"uuid":null,"loginName":"zxs","passwd":"202cb962ac59075b964b07152d234b70","empName":"咨询师","positionId":"2","empNumber":"A8723158","entryTime":1483002008000,"room":"1002","sex":0,"createTime":1483002008000,"updateTime":1483433130000,"isDel":0}}
     */

    private int type;
    private String message;
    private Object msgDetail;
    /**
     * data : {"id":44,"uuid":null,"loginName":"zxs","passwd":"202cb962ac59075b964b07152d234b70","empName":"咨询师","positionId":"2","empNumber":"A8723158","entryTime":1483002008000,"room":"1002","sex":0,"createTime":1483002008000,"updateTime":1483433130000,"isDel":0}
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
        /**
         * id : 44
         * uuid : null
         * loginName : zxs
         * passwd : 202cb962ac59075b964b07152d234b70
         * empName : 咨询师
         * positionId : 2
         * empNumber : A8723158
         * entryTime : 1483002008000
         * room : 1002
         * sex : 0
         * createTime : 1483002008000
         * updateTime : 1483433130000
         * isDel : 0
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private int id;
            private Object uuid;
            private String loginName;
            private String passwd;
            private String empName;
            private String positionId;
            private String empNumber;
            private long entryTime;
            private String room;
            private int sex;
            private long createTime;
            private long updateTime;
            private int isDel;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getUuid() {
                return uuid;
            }

            public void setUuid(Object uuid) {
                this.uuid = uuid;
            }

            public String getLoginName() {
                return loginName;
            }

            public void setLoginName(String loginName) {
                this.loginName = loginName;
            }

            public String getPasswd() {
                return passwd;
            }

            public void setPasswd(String passwd) {
                this.passwd = passwd;
            }

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
            }

            public String getPositionId() {
                return positionId;
            }

            public void setPositionId(String positionId) {
                this.positionId = positionId;
            }

            public String getEmpNumber() {
                return empNumber;
            }

            public void setEmpNumber(String empNumber) {
                this.empNumber = empNumber;
            }

            public long getEntryTime() {
                return entryTime;
            }

            public void setEntryTime(long entryTime) {
                this.entryTime = entryTime;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public int getIsDel() {
                return isDel;
            }

            public void setIsDel(int isDel) {
                this.isDel = isDel;
            }
        }
    }
}
