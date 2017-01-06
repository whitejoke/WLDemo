package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2017/1/4.
 */

public class MemberForEmp {

    /**
     * type : 1
     * message : success
     * msgDetail : null
     * result : {"EmpInfo":[{"id":1,"empName":"澹台醉波","empNumber":"A8723115","entryTime":1476979200000,"room":"1001","sex":0,"createTime":1477030147000,"updateTime":1483433127000,"isDel":0,"position":{"id":1,"uuid":null,"positionName":"前台接待","createTime":1477030065000,"updateTime":1480473276000,"isDel":0}}]}
     */

    private int type;
    private String message;
    private Object msgDetail;
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
         * id : 1
         * empName : 澹台醉波
         * empNumber : A8723115
         * entryTime : 1476979200000
         * room : 1001
         * sex : 0
         * createTime : 1477030147000
         * updateTime : 1483433127000
         * isDel : 0
         * position : {"id":1,"uuid":null,"positionName":"前台接待","createTime":1477030065000,"updateTime":1480473276000,"isDel":0}
         */

        private List<EmpInfoBean> EmpInfo;

        public List<EmpInfoBean> getEmpInfo() {
            return EmpInfo;
        }

        public void setEmpInfo(List<EmpInfoBean> EmpInfo) {
            this.EmpInfo = EmpInfo;
        }

        public static class EmpInfoBean {
            private int id;
            private String empName;
            private String empNumber;
            private long entryTime;
            private String room;
            private int sex;
            private long createTime;
            private long updateTime;
            private int isDel;
            /**
             * id : 1
             * uuid : null
             * positionName : 前台接待
             * createTime : 1477030065000
             * updateTime : 1480473276000
             * isDel : 0
             */

            private PositionBean position;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
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

            public PositionBean getPosition() {
                return position;
            }

            public void setPosition(PositionBean position) {
                this.position = position;
            }

            public static class PositionBean {
                private int id;
                private Object uuid;
                private String positionName;
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

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
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
}
