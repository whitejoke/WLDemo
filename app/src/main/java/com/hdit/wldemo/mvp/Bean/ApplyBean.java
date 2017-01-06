package com.hdit.wldemo.mvp.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joker on 2016/12/29.
 */

public class ApplyBean {

    /**
     * total : 2
     * rows : [{"id":3,"level":2,"preferPrice":599,"referPrice":"12321","empIdList":null,"preferStatus":0,"note":"打算开始计划的控球后卫看","reviewNote":null,"applyTime":1482914783000,"reviewTime":1482914783000},{"id":2,"level":1,"preferPrice":588,"referPrice":"1232以上","empIdList":null,"preferStatus":0,"note":"啊上的垃圾了大家啊苏联空军","reviewNote":null,"applyTime":1482913650000,"reviewTime":1482913650000}]
     */

    private int total;
    /**
     * id : 3
     * level : 2
     * preferPrice : 599.0
     * referPrice : 12321
     * empIdList : null
     * preferStatus : 0
     * note : 打算开始计划的控球后卫看
     * reviewNote : null
     * applyTime : 1482914783000
     * reviewTime : 1482914783000
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

    public static class RowsBean implements Serializable {
        private int id;
        private int level;
        private double preferPrice;
        private String referPrice;
        private Object empIdList;
        private int preferStatus;
        private String note;
        private Object reviewNote;
        private long applyTime;
        private long reviewTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public double getPreferPrice() {
            return preferPrice;
        }

        public void setPreferPrice(double preferPrice) {
            this.preferPrice = preferPrice;
        }

        public String getReferPrice() {
            return referPrice;
        }

        public void setReferPrice(String referPrice) {
            this.referPrice = referPrice;
        }

        public Object getEmpIdList() {
            return empIdList;
        }

        public void setEmpIdList(Object empIdList) {
            this.empIdList = empIdList;
        }

        public int getPreferStatus() {
            return preferStatus;
        }

        public void setPreferStatus(int preferStatus) {
            this.preferStatus = preferStatus;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public Object getReviewNote() {
            return reviewNote;
        }

        public void setReviewNote(Object reviewNote) {
            this.reviewNote = reviewNote;
        }

        public long getApplyTime() {
            return applyTime;
        }

        public void setApplyTime(long applyTime) {
            this.applyTime = applyTime;
        }

        public long getReviewTime() {
            return reviewTime;
        }

        public void setReviewTime(long reviewTime) {
            this.reviewTime = reviewTime;
        }
    }
}
