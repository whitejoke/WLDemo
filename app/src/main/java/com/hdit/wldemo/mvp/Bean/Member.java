package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2016/11/22.
 */

public class Member {

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
         * id : 7
         * uuid : null
         * loginName : hbiner
         * passwd : aaaaaa
         * createTime : 1478250046000
         * updateTime : 1478250046000
         * isDel : 0
         * custoInfo : {"id":7,"uuid":"胡斌","userName":"尔等皆水","userId":null,"age":29,"birthday":"09-25","occupa":"iOS开发","sex":1,"telphone":"15825559361","idNum":"33020319850822xxxx","email":"hbiner@163.com","chat":null,"address":"鄞州商会","area":null,"sourceChann":null,"channName":null,"income":"1000","userCardNum":"12345809764315","sponsorCardNum":null,"infoSources":null,"memberType":null,"points":null,"userStatus":null,"photoPath":null,"photoStatus":null,"theConsult":null,"custStaff":null,"primaryTime":1478251311000,"createTime":1478251311000,"updateTime":1479261775000,"isDel":0,"note":null}
         */

        private List<ArchiveBean> Archive;

        public List<ArchiveBean> getArchive() {
            return Archive;
        }

        public void setArchive(List<ArchiveBean> Archive) {
            this.Archive = Archive;
        }

        public static class ArchiveBean {
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
                private String uuid;
                private String userName;
                private Object userId;
                private String age;
                private String birthday;
                private String occupa;
                private String sex;
                private String telphone;
                private String idNum;
                private String email;
                private Object chat;
                private String address;
                private Object area;
                private Object sourceChann;
                private Object channName;
                private String income;
                private String userCardNum;
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

                public String getUuid() {
                    return uuid;
                }

                public void setUuid(String uuid) {
                    this.uuid = uuid;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public Object getUserId() {
                    return userId;
                }

                public void setUserId(Object userId) {
                    this.userId = userId;
                }

                public String getAge() {
                    return age;
                }

                public void setAge(String age) {
                    this.age = age;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public String getOccupa() {
                    return occupa;
                }

                public void setOccupa(String occupa) {
                    this.occupa = occupa;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getTelphone() {
                    return telphone;
                }

                public void setTelphone(String telphone) {
                    this.telphone = telphone;
                }

                public String getIdNum() {
                    return idNum;
                }

                public void setIdNum(String idNum) {
                    this.idNum = idNum;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public Object getChat() {
                    return chat;
                }

                public void setChat(Object chat) {
                    this.chat = chat;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
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

                public String getIncome() {
                    return income;
                }

                public void setIncome(String income) {
                    this.income = income;
                }

                public String getUserCardNum() {
                    return userCardNum;
                }

                public void setUserCardNum(String userCardNum) {
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
