package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2016/11/25.
 */

public class TreatmentProcessBean {


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
         * type : 0
         * price : 47563.75
         * kqOrder : {"id":4,"uuid":null,"title":"hbiner于[2016110817]咨询的订单","adviceId":"2","orderNum":"20161109092840998001","type":"2","status":0,"packageId":"1","createTime":1478653735000,"updateTime":1478764668000,"isDel":0,"detail":"修改订单的项目说明内容002"}
         * adviceDetail : {"id":2,"userName":"hbiner","projectName":"割双眼皮","reception":{"id":1,"uuid":null,"empName":"澹台醉波","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null},"advice":{"id":2,"uuid":null,"empName":"张廖寄云","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null},"doctor":{"id":3,"uuid":null,"empName":"丁曼卉","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null},"developer":{"id":16,"uuid":null,"empName":"颛孙依萱","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null},"kqAdvice":{"id":2,"uuid":null,"title":"hbiner于[2016-11-08]咨询的抽脂减肥","userId":"7","reception":"1","advice":"2","projectId":"1","waitTime":null,"depaId":"1","adviceStatus":0,"doctId":null,"devId":null,"lastTime":1477289383000,"adviceTime":1478596666000,"createTime":null,"updateTime":null,"isDel":null,"adviceNote":"详细描述咨询情况002"}}
         * packageSend : {"id":1,"packageName":"双眼皮隆鼻套餐","packagePrice":25000.75,"content":"套餐包括1.割双眼皮 2.隆鼻","projectList":[{"id":1,"uuid":null,"proName":"割双眼皮","proType":"1","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477280668000,"updateTime":1477280668000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":2,"uuid":null,"proName":"隆鼻","proType":"3","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291376000,"updateTime":1478154853000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}]}
         * preferDetails : [{"id":3,"level":3,"preferPrice":25000,"referPrice":"25000","preferStatus":0,"note":"就是一个关于优惠的说明文字"},{"id":4,"level":4,"preferPrice":38888,"referPrice":"38888","preferStatus":0,"note":"就是一个关于优惠的说明文字"}]
         * projects : [{"id":3,"proPrice":22563,"kqProject":{"id":3,"uuid":null,"proName":"抽脂减肥","proType":"5","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291393000,"updateTime":1478154853000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}}]
         * evaluDetails : [{"id":4,"kqEvalu":{"id":4,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":4,"status":1,"createTime":null,"updateTime":null,"isDel":null,"content":"评价内容描述001"},"employee":{"id":1,"uuid":null,"empName":"澹台醉波","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":5,"kqEvalu":{"id":5,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":5,"status":1,"createTime":null,"updateTime":null,"isDel":null,"content":"评价内容描述002"},"employee":{"id":1,"uuid":null,"empName":"澹台醉波","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":3,"kqEvalu":{"id":3,"uuid":null,"title":null,"evaluTarget":null,"evaluType":4,"star":5,"status":1,"createTime":null,"updateTime":null,"isDel":null,"content":"评价内容描述"},"employee":{"id":16,"uuid":null,"empName":"颛孙依萱","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}}]
         * feedbacks : [{"id":1,"content":"回访内容描述001","empInfo":{"id":16,"empName":"颛孙依萱","entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":5,"uuid":null,"positionName":"开发人员","room":null,"createTime":null,"updateTime":null,"isDel":null}}},{"id":2,"content":"回访内容描述002","empInfo":{"id":4,"empName":"刘嘉珍","entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":1,"uuid":null,"positionName":"前台接待","room":null,"createTime":null,"updateTime":null,"isDel":null}}},{"id":3,"content":"回访内容描述003","empInfo":{"id":8,"empName":"符思菱","entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":3,"uuid":null,"positionName":"助诊医生","room":null,"createTime":null,"updateTime":null,"isDel":null}}}]
         * orderStatuses : [{"id":4,"projectId":"1","proName":"割双眼皮","proStatus":0},{"id":4,"projectId":"2","proName":"隆鼻","proStatus":0},{"id":4,"projectId":"3","proName":"抽脂减肥","proStatus":0}]
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private int type;
            private double price;
            /**
             * id : 4
             * uuid : null
             * title : hbiner于[2016110817]咨询的订单
             * adviceId : 2
             * orderNum : 20161109092840998001
             * type : 2
             * status : 0
             * packageId : 1
             * createTime : 1478653735000
             * updateTime : 1478764668000
             * isDel : 0
             * detail : 修改订单的项目说明内容002
             */

            private KqOrderBean kqOrder;
            /**
             * id : 2
             * userName : hbiner
             * projectName : 割双眼皮
             * reception : {"id":1,"uuid":null,"empName":"澹台醉波","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
             * advice : {"id":2,"uuid":null,"empName":"张廖寄云","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
             * doctor : {"id":3,"uuid":null,"empName":"丁曼卉","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
             * developer : {"id":16,"uuid":null,"empName":"颛孙依萱","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
             * kqAdvice : {"id":2,"uuid":null,"title":"hbiner于[2016-11-08]咨询的抽脂减肥","userId":"7","reception":"1","advice":"2","projectId":"1","waitTime":null,"depaId":"1","adviceStatus":0,"doctId":null,"devId":null,"lastTime":1477289383000,"adviceTime":1478596666000,"createTime":null,"updateTime":null,"isDel":null,"adviceNote":"详细描述咨询情况002"}
             */

            private AdviceDetailBean adviceDetail;
            /**
             * id : 1
             * packageName : 双眼皮隆鼻套餐
             * packagePrice : 25000.75
             * content : 套餐包括1.割双眼皮 2.隆鼻
             * projectList : [{"id":1,"uuid":null,"proName":"割双眼皮","proType":"1","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477280668000,"updateTime":1477280668000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":2,"uuid":null,"proName":"隆鼻","proType":"3","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291376000,"updateTime":1478154853000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}]
             */

            private PackageSendBean packageSend;
            /**
             * id : 3
             * level : 3
             * preferPrice : 25000.0
             * referPrice : 25000
             * preferStatus : 0
             * note : 就是一个关于优惠的说明文字
             */

            private List<PreferDetailsBean> preferDetails;
            /**
             * id : 3
             * proPrice : 22563.0
             * kqProject : {"id":3,"uuid":null,"proName":"抽脂减肥","proType":"5","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291393000,"updateTime":1478154853000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}
             */

            private List<ProjectsBean> projects;
            /**
             * id : 4
             * kqEvalu : {"id":4,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":4,"status":1,"createTime":null,"updateTime":null,"isDel":null,"content":"评价内容描述001"}
             * employee : {"id":1,"uuid":null,"empName":"澹台醉波","positionId":null,"entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
             */

            private List<EvaluDetailsBean> evaluDetails;
            /**
             * id : 1
             * content : 回访内容描述001
             * empInfo : {"id":16,"empName":"颛孙依萱","entryTime":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":5,"uuid":null,"positionName":"开发人员","room":null,"createTime":null,"updateTime":null,"isDel":null}}
             */

            private List<FeedbacksBean> feedbacks;
            /**
             * id : 4
             * projectId : 1
             * proName : 割双眼皮
             * proStatus : 0
             */

            private List<OrderStatusesBean> orderStatuses;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public KqOrderBean getKqOrder() {
                return kqOrder;
            }

            public void setKqOrder(KqOrderBean kqOrder) {
                this.kqOrder = kqOrder;
            }

            public AdviceDetailBean getAdviceDetail() {
                return adviceDetail;
            }

            public void setAdviceDetail(AdviceDetailBean adviceDetail) {
                this.adviceDetail = adviceDetail;
            }

            public PackageSendBean getPackageSend() {
                return packageSend;
            }

            public void setPackageSend(PackageSendBean packageSend) {
                this.packageSend = packageSend;
            }

            public List<PreferDetailsBean> getPreferDetails() {
                return preferDetails;
            }

            public void setPreferDetails(List<PreferDetailsBean> preferDetails) {
                this.preferDetails = preferDetails;
            }

            public List<ProjectsBean> getProjects() {
                return projects;
            }

            public void setProjects(List<ProjectsBean> projects) {
                this.projects = projects;
            }

            public List<EvaluDetailsBean> getEvaluDetails() {
                return evaluDetails;
            }

            public void setEvaluDetails(List<EvaluDetailsBean> evaluDetails) {
                this.evaluDetails = evaluDetails;
            }

            public List<FeedbacksBean> getFeedbacks() {
                return feedbacks;
            }

            public void setFeedbacks(List<FeedbacksBean> feedbacks) {
                this.feedbacks = feedbacks;
            }

            public List<OrderStatusesBean> getOrderStatuses() {
                return orderStatuses;
            }

            public void setOrderStatuses(List<OrderStatusesBean> orderStatuses) {
                this.orderStatuses = orderStatuses;
            }

            public static class KqOrderBean {
                private int id;
                private Object uuid;
                private String title;
                private String adviceId;
                private String orderNum;
                private String type;
                private int status;
                private String packageId;
                private long createTime;
                private long updateTime;
                private int isDel;
                private String detail;

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

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAdviceId() {
                    return adviceId;
                }

                public void setAdviceId(String adviceId) {
                    this.adviceId = adviceId;
                }

                public String getOrderNum() {
                    return orderNum;
                }

                public void setOrderNum(String orderNum) {
                    this.orderNum = orderNum;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getPackageId() {
                    return packageId;
                }

                public void setPackageId(String packageId) {
                    this.packageId = packageId;
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

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }
            }

            public static class AdviceDetailBean {
                private int id;
                private String userName;
                private String projectName;
                /**
                 * id : 1
                 * uuid : null
                 * empName : 澹台醉波
                 * positionId : null
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 */

                private ReceptionBean reception;
                /**
                 * id : 2
                 * uuid : null
                 * empName : 张廖寄云
                 * positionId : null
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 */

                private AdviceBean advice;
                /**
                 * id : 3
                 * uuid : null
                 * empName : 丁曼卉
                 * positionId : null
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 */

                private DoctorBean doctor;
                /**
                 * id : 16
                 * uuid : null
                 * empName : 颛孙依萱
                 * positionId : null
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 */

                private DeveloperBean developer;
                /**
                 * id : 2
                 * uuid : null
                 * title : hbiner于[2016-11-08]咨询的抽脂减肥
                 * userId : 7
                 * reception : 1
                 * advice : 2
                 * projectId : 1
                 * waitTime : null
                 * depaId : 1
                 * adviceStatus : 0
                 * doctId : null
                 * devId : null
                 * lastTime : 1477289383000
                 * adviceTime : 1478596666000
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 * adviceNote : 详细描述咨询情况002
                 */

                private KqAdviceBean kqAdvice;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getProjectName() {
                    return projectName;
                }

                public void setProjectName(String projectName) {
                    this.projectName = projectName;
                }

                public ReceptionBean getReception() {
                    return reception;
                }

                public void setReception(ReceptionBean reception) {
                    this.reception = reception;
                }

                public AdviceBean getAdvice() {
                    return advice;
                }

                public void setAdvice(AdviceBean advice) {
                    this.advice = advice;
                }

                public DoctorBean getDoctor() {
                    return doctor;
                }

                public void setDoctor(DoctorBean doctor) {
                    this.doctor = doctor;
                }

                public DeveloperBean getDeveloper() {
                    return developer;
                }

                public void setDeveloper(DeveloperBean developer) {
                    this.developer = developer;
                }

                public KqAdviceBean getKqAdvice() {
                    return kqAdvice;
                }

                public void setKqAdvice(KqAdviceBean kqAdvice) {
                    this.kqAdvice = kqAdvice;
                }

                public static class ReceptionBean {
                    private int id;
                    private Object uuid;
                    private String empName;
                    private Object positionId;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;

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

                    public String getEmpName() {
                        return empName;
                    }

                    public void setEmpName(String empName) {
                        this.empName = empName;
                    }

                    public Object getPositionId() {
                        return positionId;
                    }

                    public void setPositionId(Object positionId) {
                        this.positionId = positionId;
                    }

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }
                }

                public static class AdviceBean {
                    private int id;
                    private Object uuid;
                    private String empName;
                    private Object positionId;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;

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

                    public String getEmpName() {
                        return empName;
                    }

                    public void setEmpName(String empName) {
                        this.empName = empName;
                    }

                    public Object getPositionId() {
                        return positionId;
                    }

                    public void setPositionId(Object positionId) {
                        this.positionId = positionId;
                    }

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }
                }

                public static class DoctorBean {
                    private int id;
                    private Object uuid;
                    private String empName;
                    private Object positionId;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;

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

                    public String getEmpName() {
                        return empName;
                    }

                    public void setEmpName(String empName) {
                        this.empName = empName;
                    }

                    public Object getPositionId() {
                        return positionId;
                    }

                    public void setPositionId(Object positionId) {
                        this.positionId = positionId;
                    }

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }
                }

                public static class DeveloperBean {
                    private int id;
                    private Object uuid;
                    private String empName;
                    private Object positionId;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;

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

                    public String getEmpName() {
                        return empName;
                    }

                    public void setEmpName(String empName) {
                        this.empName = empName;
                    }

                    public Object getPositionId() {
                        return positionId;
                    }

                    public void setPositionId(Object positionId) {
                        this.positionId = positionId;
                    }

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }
                }

                public static class KqAdviceBean {
                    private int id;
                    private Object uuid;
                    private String title;
                    private String userId;
                    private String reception;
                    private String advice;
                    private String projectId;
                    private Object waitTime;
                    private String depaId;
                    private int adviceStatus;
                    private Object doctId;
                    private Object devId;
                    private long lastTime;
                    private long adviceTime;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;
                    private String adviceNote;

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

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getUserId() {
                        return userId;
                    }

                    public void setUserId(String userId) {
                        this.userId = userId;
                    }

                    public String getReception() {
                        return reception;
                    }

                    public void setReception(String reception) {
                        this.reception = reception;
                    }

                    public String getAdvice() {
                        return advice;
                    }

                    public void setAdvice(String advice) {
                        this.advice = advice;
                    }

                    public String getProjectId() {
                        return projectId;
                    }

                    public void setProjectId(String projectId) {
                        this.projectId = projectId;
                    }

                    public Object getWaitTime() {
                        return waitTime;
                    }

                    public void setWaitTime(Object waitTime) {
                        this.waitTime = waitTime;
                    }

                    public String getDepaId() {
                        return depaId;
                    }

                    public void setDepaId(String depaId) {
                        this.depaId = depaId;
                    }

                    public int getAdviceStatus() {
                        return adviceStatus;
                    }

                    public void setAdviceStatus(int adviceStatus) {
                        this.adviceStatus = adviceStatus;
                    }

                    public Object getDoctId() {
                        return doctId;
                    }

                    public void setDoctId(Object doctId) {
                        this.doctId = doctId;
                    }

                    public Object getDevId() {
                        return devId;
                    }

                    public void setDevId(Object devId) {
                        this.devId = devId;
                    }

                    public long getLastTime() {
                        return lastTime;
                    }

                    public void setLastTime(long lastTime) {
                        this.lastTime = lastTime;
                    }

                    public long getAdviceTime() {
                        return adviceTime;
                    }

                    public void setAdviceTime(long adviceTime) {
                        this.adviceTime = adviceTime;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }

                    public String getAdviceNote() {
                        return adviceNote;
                    }

                    public void setAdviceNote(String adviceNote) {
                        this.adviceNote = adviceNote;
                    }
                }
            }

            public static class PackageSendBean {
                private int id;
                private String packageName;
                private double packagePrice;
                private String content;
                /**
                 * id : 1
                 * uuid : null
                 * proName : 割双眼皮
                 * proType : 1
                 * referPrice : 参考价格描述内容
                 * technology : 技术手段描述内容
                 * course : 手术疗程描述内容
                 * suitCrowds : 事宜人群描述内容
                 * effect : 治疗效果描述内容
                 * cycle : 治疗描述内容
                 * isHospital : 0
                 * createTime : 1477280668000
                 * updateTime : 1477280668000
                 * isDel : 0
                 * matters : 术后事项描述内容
                 * merits : 就是一个项目的优点描述
                 * demerits : 就是一个项目的缺点描述
                 * note : 就是一个项目的备注信息
                 */

                private List<ProjectListBean> projectList;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getPackageName() {
                    return packageName;
                }

                public void setPackageName(String packageName) {
                    this.packageName = packageName;
                }

                public double getPackagePrice() {
                    return packagePrice;
                }

                public void setPackagePrice(double packagePrice) {
                    this.packagePrice = packagePrice;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public List<ProjectListBean> getProjectList() {
                    return projectList;
                }

                public void setProjectList(List<ProjectListBean> projectList) {
                    this.projectList = projectList;
                }

                public static class ProjectListBean {
                    private int id;
                    private Object uuid;
                    private String proName;
                    private String proType;
                    private String referPrice;
                    private String technology;
                    private String course;
                    private String suitCrowds;
                    private String effect;
                    private String cycle;
                    private int isHospital;
                    private long createTime;
                    private long updateTime;
                    private int isDel;
                    private String matters;
                    private String merits;
                    private String demerits;
                    private String note;

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

                    public String getProName() {
                        return proName;
                    }

                    public void setProName(String proName) {
                        this.proName = proName;
                    }

                    public String getProType() {
                        return proType;
                    }

                    public void setProType(String proType) {
                        this.proType = proType;
                    }

                    public String getReferPrice() {
                        return referPrice;
                    }

                    public void setReferPrice(String referPrice) {
                        this.referPrice = referPrice;
                    }

                    public String getTechnology() {
                        return technology;
                    }

                    public void setTechnology(String technology) {
                        this.technology = technology;
                    }

                    public String getCourse() {
                        return course;
                    }

                    public void setCourse(String course) {
                        this.course = course;
                    }

                    public String getSuitCrowds() {
                        return suitCrowds;
                    }

                    public void setSuitCrowds(String suitCrowds) {
                        this.suitCrowds = suitCrowds;
                    }

                    public String getEffect() {
                        return effect;
                    }

                    public void setEffect(String effect) {
                        this.effect = effect;
                    }

                    public String getCycle() {
                        return cycle;
                    }

                    public void setCycle(String cycle) {
                        this.cycle = cycle;
                    }

                    public int getIsHospital() {
                        return isHospital;
                    }

                    public void setIsHospital(int isHospital) {
                        this.isHospital = isHospital;
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

                    public String getMatters() {
                        return matters;
                    }

                    public void setMatters(String matters) {
                        this.matters = matters;
                    }

                    public String getMerits() {
                        return merits;
                    }

                    public void setMerits(String merits) {
                        this.merits = merits;
                    }

                    public String getDemerits() {
                        return demerits;
                    }

                    public void setDemerits(String demerits) {
                        this.demerits = demerits;
                    }

                    public String getNote() {
                        return note;
                    }

                    public void setNote(String note) {
                        this.note = note;
                    }
                }
            }

            public static class PreferDetailsBean {
                private int id;
                private int level;
                private double preferPrice;
                private String referPrice;
                private int preferStatus;
                private String note;

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
            }

            public static class ProjectsBean {
                private int id;
                private double proPrice;
                /**
                 * id : 3
                 * uuid : null
                 * proName : 抽脂减肥
                 * proType : 5
                 * referPrice : 参考价格描述内容
                 * technology : 技术手段描述内容
                 * course : 手术疗程描述内容
                 * suitCrowds : 事宜人群描述内容
                 * effect : 治疗效果描述内容
                 * cycle : 治疗描述内容
                 * isHospital : 0
                 * createTime : 1477291393000
                 * updateTime : 1478154853000
                 * isDel : 0
                 * matters : 术后事项描述内容
                 * merits : 就是一个项目的优点描述
                 * demerits : 就是一个项目的缺点描述
                 * note : 就是一个项目的备注信息
                 */

                private KqProjectBean kqProject;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public double getProPrice() {
                    return proPrice;
                }

                public void setProPrice(double proPrice) {
                    this.proPrice = proPrice;
                }

                public KqProjectBean getKqProject() {
                    return kqProject;
                }

                public void setKqProject(KqProjectBean kqProject) {
                    this.kqProject = kqProject;
                }

                public static class KqProjectBean {
                    private int id;
                    private Object uuid;
                    private String proName;
                    private String proType;
                    private String referPrice;
                    private String technology;
                    private String course;
                    private String suitCrowds;
                    private String effect;
                    private String cycle;
                    private int isHospital;
                    private long createTime;
                    private long updateTime;
                    private int isDel;
                    private String matters;
                    private String merits;
                    private String demerits;
                    private String note;

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

                    public String getProName() {
                        return proName;
                    }

                    public void setProName(String proName) {
                        this.proName = proName;
                    }

                    public String getProType() {
                        return proType;
                    }

                    public void setProType(String proType) {
                        this.proType = proType;
                    }

                    public String getReferPrice() {
                        return referPrice;
                    }

                    public void setReferPrice(String referPrice) {
                        this.referPrice = referPrice;
                    }

                    public String getTechnology() {
                        return technology;
                    }

                    public void setTechnology(String technology) {
                        this.technology = technology;
                    }

                    public String getCourse() {
                        return course;
                    }

                    public void setCourse(String course) {
                        this.course = course;
                    }

                    public String getSuitCrowds() {
                        return suitCrowds;
                    }

                    public void setSuitCrowds(String suitCrowds) {
                        this.suitCrowds = suitCrowds;
                    }

                    public String getEffect() {
                        return effect;
                    }

                    public void setEffect(String effect) {
                        this.effect = effect;
                    }

                    public String getCycle() {
                        return cycle;
                    }

                    public void setCycle(String cycle) {
                        this.cycle = cycle;
                    }

                    public int getIsHospital() {
                        return isHospital;
                    }

                    public void setIsHospital(int isHospital) {
                        this.isHospital = isHospital;
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

                    public String getMatters() {
                        return matters;
                    }

                    public void setMatters(String matters) {
                        this.matters = matters;
                    }

                    public String getMerits() {
                        return merits;
                    }

                    public void setMerits(String merits) {
                        this.merits = merits;
                    }

                    public String getDemerits() {
                        return demerits;
                    }

                    public void setDemerits(String demerits) {
                        this.demerits = demerits;
                    }

                    public String getNote() {
                        return note;
                    }

                    public void setNote(String note) {
                        this.note = note;
                    }
                }
            }

            public static class EvaluDetailsBean {
                private int id;
                /**
                 * id : 4
                 * uuid : null
                 * title : null
                 * evaluTarget : null
                 * evaluType : 1
                 * star : 4
                 * status : 1
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 * content : 评价内容描述001
                 */

                private KqEvaluBean kqEvalu;
                /**
                 * id : 1
                 * uuid : null
                 * empName : 澹台醉波
                 * positionId : null
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 */

                private EmployeeBean employee;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public KqEvaluBean getKqEvalu() {
                    return kqEvalu;
                }

                public void setKqEvalu(KqEvaluBean kqEvalu) {
                    this.kqEvalu = kqEvalu;
                }

                public EmployeeBean getEmployee() {
                    return employee;
                }

                public void setEmployee(EmployeeBean employee) {
                    this.employee = employee;
                }

                public static class KqEvaluBean {
                    private int id;
                    private Object uuid;
                    private Object title;
                    private Object evaluTarget;
                    private int evaluType;
                    private int star;
                    private int status;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;
                    private String content;

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

                    public Object getTitle() {
                        return title;
                    }

                    public void setTitle(Object title) {
                        this.title = title;
                    }

                    public Object getEvaluTarget() {
                        return evaluTarget;
                    }

                    public void setEvaluTarget(Object evaluTarget) {
                        this.evaluTarget = evaluTarget;
                    }

                    public int getEvaluType() {
                        return evaluType;
                    }

                    public void setEvaluType(int evaluType) {
                        this.evaluType = evaluType;
                    }

                    public int getStar() {
                        return star;
                    }

                    public void setStar(int star) {
                        this.star = star;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }
                }

                public static class EmployeeBean {
                    private int id;
                    private Object uuid;
                    private String empName;
                    private Object positionId;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;

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

                    public String getEmpName() {
                        return empName;
                    }

                    public void setEmpName(String empName) {
                        this.empName = empName;
                    }

                    public Object getPositionId() {
                        return positionId;
                    }

                    public void setPositionId(Object positionId) {
                        this.positionId = positionId;
                    }

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
                        this.isDel = isDel;
                    }
                }
            }

            public static class FeedbacksBean {
                private int id;
                private String content;
                /**
                 * id : 16
                 * empName : 颛孙依萱
                 * entryTime : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 * position : {"id":5,"uuid":null,"positionName":"开发人员","room":null,"createTime":null,"updateTime":null,"isDel":null}
                 */

                private EmpInfoBean empInfo;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public EmpInfoBean getEmpInfo() {
                    return empInfo;
                }

                public void setEmpInfo(EmpInfoBean empInfo) {
                    this.empInfo = empInfo;
                }

                public static class EmpInfoBean {
                    private int id;
                    private String empName;
                    private Object entryTime;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;
                    /**
                     * id : 5
                     * uuid : null
                     * positionName : 开发人员
                     * room : null
                     * createTime : null
                     * updateTime : null
                     * isDel : null
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

                    public Object getEntryTime() {
                        return entryTime;
                    }

                    public void setEntryTime(Object entryTime) {
                        this.entryTime = entryTime;
                    }

                    public int getSex() {
                        return sex;
                    }

                    public void setSex(int sex) {
                        this.sex = sex;
                    }

                    public Object getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(Object createTime) {
                        this.createTime = createTime;
                    }

                    public Object getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(Object updateTime) {
                        this.updateTime = updateTime;
                    }

                    public Object getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(Object isDel) {
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
                        private Object room;
                        private Object createTime;
                        private Object updateTime;
                        private Object isDel;

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

                        public Object getRoom() {
                            return room;
                        }

                        public void setRoom(Object room) {
                            this.room = room;
                        }

                        public Object getCreateTime() {
                            return createTime;
                        }

                        public void setCreateTime(Object createTime) {
                            this.createTime = createTime;
                        }

                        public Object getUpdateTime() {
                            return updateTime;
                        }

                        public void setUpdateTime(Object updateTime) {
                            this.updateTime = updateTime;
                        }

                        public Object getIsDel() {
                            return isDel;
                        }

                        public void setIsDel(Object isDel) {
                            this.isDel = isDel;
                        }
                    }
                }
            }

            public static class OrderStatusesBean {
                private int id;
                private String projectId;
                private String proName;
                private int proStatus;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getProjectId() {
                    return projectId;
                }

                public void setProjectId(String projectId) {
                    this.projectId = projectId;
                }

                public String getProName() {
                    return proName;
                }

                public void setProName(String proName) {
                    this.proName = proName;
                }

                public int getProStatus() {
                    return proStatus;
                }

                public void setProStatus(int proStatus) {
                    this.proStatus = proStatus;
                }
            }
        }
    }
}
