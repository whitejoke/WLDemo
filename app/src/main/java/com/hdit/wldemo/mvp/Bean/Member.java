package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2016/11/22.
 */

public class Member {

    /**
     * total : 1
     * rows : [{"id":7,"uuid":null,"loginName":"hbiner","passwd":"0b4e7a0e5fe84ad35fb5f95b9ceeac79","createTime":1478250046000,"updateTime":1481782806000,"isDel":0,"custoInfo":{"id":7,"uuid":"胡斌","userName":"hbiner","userId":null,"age":18,"birthday":"09-25","occupa":"iOS开发","sex":1,"telphone":"15825559361","idNum":"33020319850822xxxx","email":"hbiner@163.com","chat":"","address":"","area":"","sourceChann":"","channName":"","income":"1000","userCardNum":"12345809764315","sponsorCardNum":"","infoSources":"","memberType":null,"points":null,"userStatus":null,"photoPath":null,"photoStatus":null,"theConsult":"","custStaff":39,"primaryTime":1478251311000,"createTime":1478251311000,"updateTime":1482299771000,"isDel":0,"note":""}}]
     */

    private int total;
    /**
     * id : 7
     * uuid : null
     * loginName : hbiner
     * passwd : 0b4e7a0e5fe84ad35fb5f95b9ceeac79
     * createTime : 1478250046000
     * updateTime : 1481782806000
     * isDel : 0
     * custoInfo : {"id":7,"uuid":"胡斌","userName":"hbiner","userId":null,"age":18,"birthday":"09-25","occupa":"iOS开发","sex":1,"telphone":"15825559361","idNum":"33020319850822xxxx","email":"hbiner@163.com","chat":"","address":"","area":"","sourceChann":"","channName":"","income":"1000","userCardNum":"12345809764315","sponsorCardNum":"","infoSources":"","memberType":null,"points":null,"userStatus":null,"photoPath":null,"photoStatus":null,"theConsult":"","custStaff":39,"primaryTime":1478251311000,"createTime":1478251311000,"updateTime":1482299771000,"isDel":0,"note":""}
     */

    private List<RowsBean> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        private int id;
        private Object uuid;
        private String loginName;
        private String passwd;
        private long createTime;
        private long updateTime;
        private int isDel;
        /**
         * id : 7
         * uuid : 胡斌
         * userName : hbiner
         * userId : null
         * age : 18
         * birthday : 09-25
         * occupa : iOS开发
         * sex : 1
         * telphone : 15825559361
         * idNum : 33020319850822xxxx
         * email : hbiner@163.com
         * chat :
         * address :
         * area :
         * sourceChann :
         * channName :
         * income : 1000
         * userCardNum : 12345809764315
         * sponsorCardNum :
         * infoSources :
         * memberType : null
         * points : null
         * userStatus : null
         * photoPath : null
         * photoStatus : null
         * theConsult :
         * custStaff : 39
         * primaryTime : 1478251311000
         * createTime : 1478251311000
         * updateTime : 1482299771000
         * isDel : 0
         * note :
         */

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
            private String chat;
            private String address;
            private String area;
            private String sourceChann;
            private String channName;
            private String income;
            private String userCardNum;
            private String sponsorCardNum;
            private String infoSources;
            private Object memberType;
            private Object points;
            private Object userStatus;
            private Object photoPath;
            private Object photoStatus;
            private String theConsult;
            private int custStaff;
            private long primaryTime;
            private long createTime;
            private long updateTime;
            private int isDel;
            private String note;

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

            public String getChat() {
                return chat;
            }

            public void setChat(String chat) {
                this.chat = chat;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getSourceChann() {
                return sourceChann;
            }

            public void setSourceChann(String sourceChann) {
                this.sourceChann = sourceChann;
            }

            public String getChannName() {
                return channName;
            }

            public void setChannName(String channName) {
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

            public String getSponsorCardNum() {
                return sponsorCardNum;
            }

            public void setSponsorCardNum(String sponsorCardNum) {
                this.sponsorCardNum = sponsorCardNum;
            }

            public String getInfoSources() {
                return infoSources;
            }

            public void setInfoSources(String infoSources) {
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

            public String getTheConsult() {
                return theConsult;
            }

            public void setTheConsult(String theConsult) {
                this.theConsult = theConsult;
            }

            public int getCustStaff() {
                return custStaff;
            }

            public void setCustStaff(int custStaff) {
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

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }
        }
    }
}
