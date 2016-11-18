package com.hdit.wldemo.mvp.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joker on 2016/11/14.
 */

public class UserBean implements Serializable{

    /**
     * type : 1
     * message : success
     * msgDetail : null
     * result : {"data":[{"id":9,"uuid":null,"loginName":"susu","passwd":"112233","createTime":1479105216000,"updateTime":1479105216000,"isDel":0,"custoInfo":{"id":8,"uuid":null,"userName":null,"userId":null,"age":28,"birthday":"12-02","occupa":null,"sex":null,"telphone":null,"idNum":null,"email":null,"chat":null,"address":null,"area":null,"sourceChann":null,"channName":null,"income":null,"userCardNum":null,"sponsorCardNum":null,"infoSources":null,"memberType":null,"points":null,"userStatus":null,"photoPath":null,"photoStatus":null,"theConsult":null,"custStaff":null,"primaryTime":1479105216000,"createTime":1479105216000,"updateTime":1479112149000,"isDel":0,"note":null}}]}
     */
    private static final long serialVersionUID = 1L;
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
         * id : 9
         * uuid : null
         * loginName : susu
         * passwd : 112233
         * createTime : 1479105216000
         * updateTime : 1479105216000
         * isDel : 0
         * custoInfo : {"id":8,"uuid":null,"userName":null,"userId":null,"age":28,"birthday":"12-02","occupa":null,"sex":null,"telphone":null,"idNum":null,"email":null,"chat":null,"address":null,"area":null,"sourceChann":null,"channName":null,"income":null,"userCardNum":null,"sponsorCardNum":null,"infoSources":null,"memberType":null,"points":null,"userStatus":null,"photoPath":null,"photoStatus":null,"theConsult":null,"custStaff":null,"primaryTime":1479105216000,"createTime":1479105216000,"updateTime":1479112149000,"isDel":0,"note":null}
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private int id;
            private Object uuid;
            private String loginName;
            private String passwd;
            private long createTime;
            private long updateTime;
            private int isDel;

            private CustoInfoBean custoInfo;

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

            public CustoInfoBean getCustoInfo() {
                return custoInfo;
            }

            public void setCustoInfo(CustoInfoBean custoInfo) {
                this.custoInfo = custoInfo;
            }

            public static class CustoInfoBean {
                private int id;
                private Object uuid;
                private Object userName;
                private Object userId;
                private int age;
                private String birthday;
                private Object occupa;
                private Object sex;
                private Object telphone;
                private Object idNum;
                private Object email;
                private Object chat;
                private Object address;
                private Object area;
                private Object sourceChann;
                private Object channName;
                private Object income;
                private Object userCardNum;
                private Object sponsorCardNum;
                private Object infoSources;
                private Object memberType;
                private Object points;
                private Object userStatus;
                private Object photoPath;
                private Object photoStatus;
                private Object theConsult;
                private Object custStaff;
                private long primaryTime;
                private long createTime;
                private long updateTime;
                private int isDel;
                private Object note;

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

                public Object getUserName() {
                    return userName;
                }

                public void setUserName(Object userName) {
                    this.userName = userName;
                }

                public Object getUserId() {
                    return userId;
                }

                public void setUserId(Object userId) {
                    this.userId = userId;
                }

                public int getAge() {
                    return age;
                }

                public void setAge(int age) {
                    this.age = age;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public Object getOccupa() {
                    return occupa;
                }

                public void setOccupa(Object occupa) {
                    this.occupa = occupa;
                }

                public Object getSex() {
                    return sex;
                }

                public void setSex(Object sex) {
                    this.sex = sex;
                }

                public Object getTelphone() {
                    return telphone;
                }

                public void setTelphone(Object telphone) {
                    this.telphone = telphone;
                }

                public Object getIdNum() {
                    return idNum;
                }

                public void setIdNum(Object idNum) {
                    this.idNum = idNum;
                }

                public Object getEmail() {
                    return email;
                }

                public void setEmail(Object email) {
                    this.email = email;
                }

                public Object getChat() {
                    return chat;
                }

                public void setChat(Object chat) {
                    this.chat = chat;
                }

                public Object getAddress() {
                    return address;
                }

                public void setAddress(Object address) {
                    this.address = address;
                }

                public Object getArea() {
                    return area;
                }

                public void setArea(Object area) {
                    this.area = area;
                }

                public Object getSourceChann() {
                    return sourceChann;
                }

                public void setSourceChann(Object sourceChann) {
                    this.sourceChann = sourceChann;
                }

                public Object getChannName() {
                    return channName;
                }

                public void setChannName(Object channName) {
                    this.channName = channName;
                }

                public Object getIncome() {
                    return income;
                }

                public void setIncome(Object income) {
                    this.income = income;
                }

                public Object getUserCardNum() {
                    return userCardNum;
                }

                public void setUserCardNum(Object userCardNum) {
                    this.userCardNum = userCardNum;
                }

                public Object getSponsorCardNum() {
                    return sponsorCardNum;
                }

                public void setSponsorCardNum(Object sponsorCardNum) {
                    this.sponsorCardNum = sponsorCardNum;
                }

                public Object getInfoSources() {
                    return infoSources;
                }

                public void setInfoSources(Object infoSources) {
                    this.infoSources = infoSources;
                }

                public Object getMemberType() {
                    return memberType;
                }

                public void setMemberType(Object memberType) {
                    this.memberType = memberType;
                }

                public Object getPoints() {
                    return points;
                }

                public void setPoints(Object points) {
                    this.points = points;
                }

                public Object getUserStatus() {
                    return userStatus;
                }

                public void setUserStatus(Object userStatus) {
                    this.userStatus = userStatus;
                }

                public Object getPhotoPath() {
                    return photoPath;
                }

                public void setPhotoPath(Object photoPath) {
                    this.photoPath = photoPath;
                }

                public Object getPhotoStatus() {
                    return photoStatus;
                }

                public void setPhotoStatus(Object photoStatus) {
                    this.photoStatus = photoStatus;
                }

                public Object getTheConsult() {
                    return theConsult;
                }

                public void setTheConsult(Object theConsult) {
                    this.theConsult = theConsult;
                }

                public Object getCustStaff() {
                    return custStaff;
                }

                public void setCustStaff(Object custStaff) {
                    this.custStaff = custStaff;
                }

                public long getPrimaryTime() {
                    return primaryTime;
                }

                public void setPrimaryTime(long primaryTime) {
                    this.primaryTime = primaryTime;
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

                public Object getNote() {
                    return note;
                }

                public void setNote(Object note) {
                    this.note = note;
                }
            }
        }
    }
}
