package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2016/12/21.
 */

public class OrderDetail {

    /**
     * total : 0
     * rows : [{"type":0,"price":16900,"kqOrder":{"id":1,"uuid":null,"title":"胡斌于[2017010517]咨询的订单","adviceId":"2","orderNum":"20170105170648111000","type":null,"status":2,"packageId":"1","createTime":1483607206000,"updateTime":1483607286000,"isDel":0,"detail":null},"adviceDetail":{"id":2,"userName":"胡斌","projectName":"割双眼皮","reception":{"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"advice":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"doctor":{"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"developer":{"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"empAdvices":[{"id":4,"adviceId":"2","empId":"5","empType":1,"serviceTime":1483607126000,"empInfo":{"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"evaluId":2},{"id":5,"adviceId":"2","empId":"44","empType":2,"serviceTime":1483607126000,"empInfo":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":3},{"id":6,"adviceId":"2","empId":"19","empType":4,"serviceTime":1483607126000,"empInfo":{"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":null},{"id":7,"adviceId":"2","empId":"3","empType":3,"serviceTime":1483607295000,"empInfo":{"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":4}],"kqAdvice":{"id":2,"uuid":null,"title":"胡斌于[2017-01-05]咨询的割双眼皮","userId":"7","projectId":"5","waitTime":"12","depaId":null,"adviceStatus":2,"lastTime":1483607128000,"adviceTime":1483607164000,"createTime":1483607126000,"updateTime":1483607162000,"isDel":null,"adviceNote":"312312312"},"startTime":null,"endTime":null},"packageSend":{"id":1,"packageName":"套餐1001","packagePrice":12355,"content":"套餐1001描述内容","projectList":[{"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":9,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":13,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":21,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":29,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":37,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":53,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}]},"preferDetails":[{"id":9,"level":1,"preferPrice":455,"referPrice":"1232以上","empIdList":null,"preferStatus":0,"note":"啊上的垃圾了大家啊苏联空军","reviewNote":null,"applyTime":null,"reviewTime":null},{"id":3,"level":3,"preferPrice":45645,"referPrice":"25000","empIdList":null,"preferStatus":0,"note":"山东起舞哦卡升级换代加工费大家发改委i鳄鱼肉温柔去","reviewNote":null,"applyTime":null,"reviewTime":null},{"id":1,"level":1,"preferPrice":78788,"referPrice":"1800","empIdList":null,"preferStatus":0,"note":"阿娇说过的话啊三款经典但千万i了凯撒奖活动看","reviewNote":null,"applyTime":null,"reviewTime":null}],"projects":[{"id":4,"proPrice":0,"proStatus":2,"kqProject":{"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":1477291406000,"updateTime":1481769723000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":9,"proPrice":0,"proStatus":0,"kqProject":{"id":9,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":13,"proPrice":0,"proStatus":0,"kqProject":{"id":13,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":21,"proPrice":0,"proStatus":0,"kqProject":{"id":21,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":29,"proPrice":0,"proStatus":0,"kqProject":{"id":29,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":37,"proPrice":0,"proStatus":0,"kqProject":{"id":37,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":53,"proPrice":0,"proStatus":0,"kqProject":{"id":53,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":1477291406000,"updateTime":1482375175000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":58,"proPrice":4545,"proStatus":0,"kqProject":{"id":58,"uuid":null,"proName":"奋斗到fgd","proType":"2","referPrice":"风格豆腐干df","technology":"大范甘迪发给","course":"豆腐干dfg","suitCrowds":"df","effect":"豆豆腐干dfg腐干","cycle":"豆腐干地方","isHospital":0,"createTime":1483584213000,"updateTime":1483584213000,"isDel":0,"matters":"豆腐干","merits":"发给地方","demerits":"地方豆腐干","note":""}}],"evaluDetails":[{"id":2,"userName":null,"kqEvalu":{"id":2,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607126000,"updateTime":1483607126000,"isDel":null,"content":null},"employee":{"id":5,"uuid":null,"loginName":null,"passwd":null,"empName":"谷碧萱","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":3,"userName":null,"kqEvalu":{"id":3,"uuid":null,"title":null,"evaluTarget":null,"evaluType":2,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607178000,"updateTime":1483607178000,"isDel":null,"content":null},"employee":{"id":44,"uuid":null,"loginName":null,"passwd":null,"empName":"咨询师","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":4,"userName":null,"kqEvalu":{"id":4,"uuid":null,"title":null,"evaluTarget":null,"evaluType":3,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607429000,"updateTime":1483607429000,"isDel":null,"content":null},"employee":{"id":3,"uuid":null,"loginName":null,"passwd":null,"empName":"丁曼卉","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":5,"userName":null,"kqEvalu":{"id":5,"uuid":null,"title":null,"evaluTarget":null,"evaluType":4,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607925000,"updateTime":1483607925000,"isDel":null,"content":null},"employee":{"id":42,"uuid":null,"loginName":null,"passwd":null,"empName":"东门巧蕊","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":6,"userName":null,"kqEvalu":{"id":6,"uuid":null,"title":null,"evaluTarget":null,"evaluType":4,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607948000,"updateTime":1483607948000,"isDel":null,"content":null},"employee":{"id":1,"uuid":null,"loginName":null,"passwd":null,"empName":"澹台醉波","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}}],"feedbacks":[{"id":1,"type":0,"content":"回访内容","evaluId":5,"createTime":1483607925000,"updateTime":1483607925000,"empInfo":{"id":42,"empName":"东门巧蕊","empNumber":"A8723156","entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":11,"uuid":null,"positionName":"培训老师","createTime":null,"updateTime":null,"isDel":null}}},{"id":2,"type":1,"content":"加快大火烧开的机会","evaluId":6,"createTime":1483607948000,"updateTime":1483607948000,"empInfo":{"id":1,"empName":"澹台醉波","empNumber":"A8723115","entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":1,"uuid":null,"positionName":"前台接待","createTime":null,"updateTime":null,"isDel":null}}}]}]
     */

    private int total;
    /**
     * type : 0
     * price : 16900.0
     * kqOrder : {"id":1,"uuid":null,"title":"胡斌于[2017010517]咨询的订单","adviceId":"2","orderNum":"20170105170648111000","type":null,"status":2,"packageId":"1","createTime":1483607206000,"updateTime":1483607286000,"isDel":0,"detail":null}
     * adviceDetail : {"id":2,"userName":"胡斌","projectName":"割双眼皮","reception":{"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"advice":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"doctor":{"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"developer":{"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"empAdvices":[{"id":4,"adviceId":"2","empId":"5","empType":1,"serviceTime":1483607126000,"empInfo":{"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"evaluId":2},{"id":5,"adviceId":"2","empId":"44","empType":2,"serviceTime":1483607126000,"empInfo":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":3},{"id":6,"adviceId":"2","empId":"19","empType":4,"serviceTime":1483607126000,"empInfo":{"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":null},{"id":7,"adviceId":"2","empId":"3","empType":3,"serviceTime":1483607295000,"empInfo":{"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":4}],"kqAdvice":{"id":2,"uuid":null,"title":"胡斌于[2017-01-05]咨询的割双眼皮","userId":"7","projectId":"5","waitTime":"12","depaId":null,"adviceStatus":2,"lastTime":1483607128000,"adviceTime":1483607164000,"createTime":1483607126000,"updateTime":1483607162000,"isDel":null,"adviceNote":"312312312"},"startTime":null,"endTime":null}
     * packageSend : {"id":1,"packageName":"套餐1001","packagePrice":12355,"content":"套餐1001描述内容","projectList":[{"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":9,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":13,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":21,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":29,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":37,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":53,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}]}
     * preferDetails : [{"id":9,"level":1,"preferPrice":455,"referPrice":"1232以上","empIdList":null,"preferStatus":0,"note":"啊上的垃圾了大家啊苏联空军","reviewNote":null,"applyTime":null,"reviewTime":null},{"id":3,"level":3,"preferPrice":45645,"referPrice":"25000","empIdList":null,"preferStatus":0,"note":"山东起舞哦卡升级换代加工费大家发改委i鳄鱼肉温柔去","reviewNote":null,"applyTime":null,"reviewTime":null},{"id":1,"level":1,"preferPrice":78788,"referPrice":"1800","empIdList":null,"preferStatus":0,"note":"阿娇说过的话啊三款经典但千万i了凯撒奖活动看","reviewNote":null,"applyTime":null,"reviewTime":null}]
     * projects : [{"id":4,"proPrice":0,"proStatus":2,"kqProject":{"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":1477291406000,"updateTime":1481769723000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":9,"proPrice":0,"proStatus":0,"kqProject":{"id":9,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":13,"proPrice":0,"proStatus":0,"kqProject":{"id":13,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":21,"proPrice":0,"proStatus":0,"kqProject":{"id":21,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":29,"proPrice":0,"proStatus":0,"kqProject":{"id":29,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":37,"proPrice":0,"proStatus":0,"kqProject":{"id":37,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":1477291406000,"updateTime":1480490344000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":53,"proPrice":0,"proStatus":0,"kqProject":{"id":53,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":1477291406000,"updateTime":1482375175000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}},{"id":58,"proPrice":4545,"proStatus":0,"kqProject":{"id":58,"uuid":null,"proName":"奋斗到fgd","proType":"2","referPrice":"风格豆腐干df","technology":"大范甘迪发给","course":"豆腐干dfg","suitCrowds":"df","effect":"豆豆腐干dfg腐干","cycle":"豆腐干地方","isHospital":0,"createTime":1483584213000,"updateTime":1483584213000,"isDel":0,"matters":"豆腐干","merits":"发给地方","demerits":"地方豆腐干","note":""}}]
     * evaluDetails : [{"id":2,"userName":null,"kqEvalu":{"id":2,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607126000,"updateTime":1483607126000,"isDel":null,"content":null},"employee":{"id":5,"uuid":null,"loginName":null,"passwd":null,"empName":"谷碧萱","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":3,"userName":null,"kqEvalu":{"id":3,"uuid":null,"title":null,"evaluTarget":null,"evaluType":2,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607178000,"updateTime":1483607178000,"isDel":null,"content":null},"employee":{"id":44,"uuid":null,"loginName":null,"passwd":null,"empName":"咨询师","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":4,"userName":null,"kqEvalu":{"id":4,"uuid":null,"title":null,"evaluTarget":null,"evaluType":3,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607429000,"updateTime":1483607429000,"isDel":null,"content":null},"employee":{"id":3,"uuid":null,"loginName":null,"passwd":null,"empName":"丁曼卉","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":5,"userName":null,"kqEvalu":{"id":5,"uuid":null,"title":null,"evaluTarget":null,"evaluType":4,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607925000,"updateTime":1483607925000,"isDel":null,"content":null},"employee":{"id":42,"uuid":null,"loginName":null,"passwd":null,"empName":"东门巧蕊","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}},{"id":6,"userName":null,"kqEvalu":{"id":6,"uuid":null,"title":null,"evaluTarget":null,"evaluType":4,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607948000,"updateTime":1483607948000,"isDel":null,"content":null},"employee":{"id":1,"uuid":null,"loginName":null,"passwd":null,"empName":"澹台醉波","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}}]
     * feedbacks : [{"id":1,"type":0,"content":"回访内容","evaluId":5,"createTime":1483607925000,"updateTime":1483607925000,"empInfo":{"id":42,"empName":"东门巧蕊","empNumber":"A8723156","entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":11,"uuid":null,"positionName":"培训老师","createTime":null,"updateTime":null,"isDel":null}}},{"id":2,"type":1,"content":"加快大火烧开的机会","evaluId":6,"createTime":1483607948000,"updateTime":1483607948000,"empInfo":{"id":1,"empName":"澹台醉波","empNumber":"A8723115","entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":1,"uuid":null,"positionName":"前台接待","createTime":null,"updateTime":null,"isDel":null}}}]
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
        private int type;
        private double price;
        /**
         * id : 1
         * uuid : null
         * title : 胡斌于[2017010517]咨询的订单
         * adviceId : 2
         * orderNum : 20170105170648111000
         * type : null
         * status : 2
         * packageId : 1
         * createTime : 1483607206000
         * updateTime : 1483607286000
         * isDel : 0
         * detail : null
         */

        private KqOrderBean kqOrder;
        /**
         * id : 2
         * userName : 胡斌
         * projectName : 割双眼皮
         * reception : {"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
         * advice : {"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
         * doctor : {"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
         * developer : {"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
         * empAdvices : [{"id":4,"adviceId":"2","empId":"5","empType":1,"serviceTime":1483607126000,"empInfo":{"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"evaluId":2},{"id":5,"adviceId":"2","empId":"44","empType":2,"serviceTime":1483607126000,"empInfo":{"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":3},{"id":6,"adviceId":"2","empId":"19","empType":4,"serviceTime":1483607126000,"empInfo":{"id":19,"empName":"司马娅静","empNumber":"A8723133","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":null},{"id":7,"adviceId":"2","empId":"3","empType":3,"serviceTime":1483607295000,"empInfo":{"id":3,"empName":"丁曼卉","empNumber":"A8723117","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null},"adviser":null,"evaluId":4}]
         * kqAdvice : {"id":2,"uuid":null,"title":"胡斌于[2017-01-05]咨询的割双眼皮","userId":"7","projectId":"5","waitTime":"12","depaId":null,"adviceStatus":2,"lastTime":1483607128000,"adviceTime":1483607164000,"createTime":1483607126000,"updateTime":1483607162000,"isDel":null,"adviceNote":"312312312"}
         * startTime : null
         * endTime : null
         */

        private AdviceDetailBean adviceDetail;
        /**
         * id : 1
         * packageName : 套餐1001
         * packagePrice : 12355.0
         * content : 套餐1001描述内容
         * projectList : [{"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":9,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":13,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":21,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":29,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":37,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":0,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"},{"id":53,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":null,"updateTime":null,"isDel":null,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}]
         */

        private PackageSendBean packageSend;
        /**
         * id : 9
         * level : 1
         * preferPrice : 455.0
         * referPrice : 1232以上
         * empIdList : null
         * preferStatus : 0
         * note : 啊上的垃圾了大家啊苏联空军
         * reviewNote : null
         * applyTime : null
         * reviewTime : null
         */

        private List<PreferDetailsBean> preferDetails;
        /**
         * id : 4
         * proPrice : 0.0
         * proStatus : 2
         * kqProject : {"id":4,"uuid":null,"proName":"牙齿矫正","proType":"8","referPrice":"参考价格描述内容","technology":"技术手段描述内容","course":"手术疗程描述内容","suitCrowds":"事宜人群描述内容","effect":"治疗效果描述内容","cycle":"治疗描述内容","isHospital":1,"createTime":1477291406000,"updateTime":1481769723000,"isDel":0,"matters":"术后事项描述内容","merits":"就是一个项目的优点描述","demerits":"就是一个项目的缺点描述","note":"就是一个项目的备注信息"}
         */

        private List<ProjectsBean> projects;
        /**
         * id : 2
         * userName : null
         * kqEvalu : {"id":2,"uuid":null,"title":null,"evaluTarget":null,"evaluType":1,"star":null,"status":0,"startTime":null,"endTime":null,"createTime":1483607126000,"updateTime":1483607126000,"isDel":null,"content":null}
         * employee : {"id":5,"uuid":null,"loginName":null,"passwd":null,"empName":"谷碧萱","positionId":null,"empNumber":null,"entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null}
         */

        private List<EvaluDetailsBean> evaluDetails;
        /**
         * id : 1
         * type : 0
         * content : 回访内容
         * evaluId : 5
         * createTime : 1483607925000
         * updateTime : 1483607925000
         * empInfo : {"id":42,"empName":"东门巧蕊","empNumber":"A8723156","entryTime":null,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":{"id":11,"uuid":null,"positionName":"培训老师","createTime":null,"updateTime":null,"isDel":null}}
         */

        private List<FeedbacksBean> feedbacks;

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

        public static class KqOrderBean {
            private int id;
            private Object uuid;
            private String title;
            private String adviceId;
            private String orderNum;
            private Object type;
            private int status;
            private String packageId;
            private long createTime;
            private long updateTime;
            private int isDel;
            private Object detail;

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

            public Object getType() {
                return type;
            }

            public void setType(Object type) {
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

            public Object getDetail() {
                return detail;
            }

            public void setDetail(Object detail) {
                this.detail = detail;
            }
        }

        public static class AdviceDetailBean {
            private int id;
            private String userName;
            private String projectName;
            /**
             * id : 5
             * empName : 谷碧萱
             * empNumber : A8723119
             * entryTime : 1476979200000
             * room : null
             * sex : 0
             * createTime : null
             * updateTime : null
             * isDel : null
             * position : null
             */

            private ReceptionBean reception;
            /**
             * id : 44
             * empName : 咨询师
             * empNumber : A8723158
             * entryTime : 1429027200000
             * room : null
             * sex : 0
             * createTime : null
             * updateTime : null
             * isDel : null
             * position : null
             */

            private AdviceBean advice;
            /**
             * id : 3
             * empName : 丁曼卉
             * empNumber : A8723117
             * entryTime : 1476979200000
             * room : null
             * sex : 0
             * createTime : null
             * updateTime : null
             * isDel : null
             * position : null
             */

            private DoctorBean doctor;
            /**
             * id : 19
             * empName : 司马娅静
             * empNumber : A8723133
             * entryTime : 1476979200000
             * room : null
             * sex : 0
             * createTime : null
             * updateTime : null
             * isDel : null
             * position : null
             */

            private DeveloperBean developer;
            /**
             * id : 2
             * uuid : null
             * title : 胡斌于[2017-01-05]咨询的割双眼皮
             * userId : 7
             * projectId : 5
             * waitTime : 12
             * depaId : null
             * adviceStatus : 2
             * lastTime : 1483607128000
             * adviceTime : 1483607164000
             * createTime : 1483607126000
             * updateTime : 1483607162000
             * isDel : null
             * adviceNote : 312312312
             */

            private KqAdviceBean kqAdvice;
            private Object startTime;
            private Object endTime;
            /**
             * id : 4
             * adviceId : 2
             * empId : 5
             * empType : 1
             * serviceTime : 1483607126000
             * empInfo : {"id":5,"empName":"谷碧萱","empNumber":"A8723119","entryTime":1476979200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
             * adviser : {"id":44,"empName":"咨询师","empNumber":"A8723158","entryTime":1429027200000,"room":null,"sex":0,"createTime":null,"updateTime":null,"isDel":null,"position":null}
             * evaluId : 2
             */

            private List<EmpAdvicesBean> empAdvices;

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

            public Object getStartTime() {
                return startTime;
            }

            public void setStartTime(Object startTime) {
                this.startTime = startTime;
            }

            public Object getEndTime() {
                return endTime;
            }

            public void setEndTime(Object endTime) {
                this.endTime = endTime;
            }

            public List<EmpAdvicesBean> getEmpAdvices() {
                return empAdvices;
            }

            public void setEmpAdvices(List<EmpAdvicesBean> empAdvices) {
                this.empAdvices = empAdvices;
            }

            public static class ReceptionBean {
                private int id;
                private String empName;
                private String empNumber;
                private long entryTime;
                private Object room;
                private int sex;
                private Object createTime;
                private Object updateTime;
                private Object isDel;
                private Object position;

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

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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

                public Object getPosition() {
                    return position;
                }

                public void setPosition(Object position) {
                    this.position = position;
                }
            }

            public static class AdviceBean {
                private int id;
                private String empName;
                private String empNumber;
                private long entryTime;
                private Object room;
                private int sex;
                private Object createTime;
                private Object updateTime;
                private Object isDel;
                private Object position;

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

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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

                public Object getPosition() {
                    return position;
                }

                public void setPosition(Object position) {
                    this.position = position;
                }
            }

            public static class DoctorBean {
                private int id;
                private String empName;
                private String empNumber;
                private long entryTime;
                private Object room;
                private int sex;
                private Object createTime;
                private Object updateTime;
                private Object isDel;
                private Object position;

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

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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

                public Object getPosition() {
                    return position;
                }

                public void setPosition(Object position) {
                    this.position = position;
                }
            }

            public static class DeveloperBean {
                private int id;
                private String empName;
                private String empNumber;
                private long entryTime;
                private Object room;
                private int sex;
                private Object createTime;
                private Object updateTime;
                private Object isDel;
                private Object position;

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

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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

                public Object getPosition() {
                    return position;
                }

                public void setPosition(Object position) {
                    this.position = position;
                }
            }

            public static class KqAdviceBean {
                private int id;
                private Object uuid;
                private String title;
                private String userId;
                private String projectId;
                private String waitTime;
                private Object depaId;
                private int adviceStatus;
                private long lastTime;
                private long adviceTime;
                private long createTime;
                private long updateTime;
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

                public String getProjectId() {
                    return projectId;
                }

                public void setProjectId(String projectId) {
                    this.projectId = projectId;
                }

                public String getWaitTime() {
                    return waitTime;
                }

                public void setWaitTime(String waitTime) {
                    this.waitTime = waitTime;
                }

                public Object getDepaId() {
                    return depaId;
                }

                public void setDepaId(Object depaId) {
                    this.depaId = depaId;
                }

                public int getAdviceStatus() {
                    return adviceStatus;
                }

                public void setAdviceStatus(int adviceStatus) {
                    this.adviceStatus = adviceStatus;
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

            public static class EmpAdvicesBean {
                private int id;
                private String adviceId;
                private String empId;
                private int empType;
                private long serviceTime;
                /**
                 * id : 5
                 * empName : 谷碧萱
                 * empNumber : A8723119
                 * entryTime : 1476979200000
                 * room : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 * position : null
                 */

                private EmpInfoBean empInfo;
                /**
                 * id : 44
                 * empName : 咨询师
                 * empNumber : A8723158
                 * entryTime : 1429027200000
                 * room : null
                 * sex : 0
                 * createTime : null
                 * updateTime : null
                 * isDel : null
                 * position : null
                 */

                private AdviserBean adviser;
                private int evaluId;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getAdviceId() {
                    return adviceId;
                }

                public void setAdviceId(String adviceId) {
                    this.adviceId = adviceId;
                }

                public String getEmpId() {
                    return empId;
                }

                public void setEmpId(String empId) {
                    this.empId = empId;
                }

                public int getEmpType() {
                    return empType;
                }

                public void setEmpType(int empType) {
                    this.empType = empType;
                }

                public long getServiceTime() {
                    return serviceTime;
                }

                public void setServiceTime(long serviceTime) {
                    this.serviceTime = serviceTime;
                }

                public EmpInfoBean getEmpInfo() {
                    return empInfo;
                }

                public void setEmpInfo(EmpInfoBean empInfo) {
                    this.empInfo = empInfo;
                }

                public AdviserBean getAdviser() {
                    return adviser;
                }

                public void setAdviser(AdviserBean adviser) {
                    this.adviser = adviser;
                }

                public int getEvaluId() {
                    return evaluId;
                }

                public void setEvaluId(int evaluId) {
                    this.evaluId = evaluId;
                }

                public static class EmpInfoBean {
                    private int id;
                    private String empName;
                    private String empNumber;
                    private long entryTime;
                    private Object room;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;
                    private Object position;

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

                    public Object getRoom() {
                        return room;
                    }

                    public void setRoom(Object room) {
                        this.room = room;
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

                    public Object getPosition() {
                        return position;
                    }

                    public void setPosition(Object position) {
                        this.position = position;
                    }
                }

                public static class AdviserBean {
                    private int id;
                    private String empName;
                    private String empNumber;
                    private long entryTime;
                    private Object room;
                    private int sex;
                    private Object createTime;
                    private Object updateTime;
                    private Object isDel;
                    private Object position;

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

                    public Object getRoom() {
                        return room;
                    }

                    public void setRoom(Object room) {
                        this.room = room;
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

                    public Object getPosition() {
                        return position;
                    }

                    public void setPosition(Object position) {
                        this.position = position;
                    }
                }
            }
        }

        public static class PackageSendBean {
            private int id;
            private String packageName;
            private double packagePrice;
            private String content;
            /**
             * id : 4
             * uuid : null
             * proName : 牙齿矫正
             * proType : 8
             * referPrice : 参考价格描述内容
             * technology : 技术手段描述内容
             * course : 手术疗程描述内容
             * suitCrowds : 事宜人群描述内容
             * effect : 治疗效果描述内容
             * cycle : 治疗描述内容
             * isHospital : 1
             * createTime : null
             * updateTime : null
             * isDel : null
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
                private Object createTime;
                private Object updateTime;
                private Object isDel;
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
            private Object empIdList;
            private int preferStatus;
            private String note;
            private Object reviewNote;
            private Object applyTime;
            private Object reviewTime;

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

            public Object getApplyTime() {
                return applyTime;
            }

            public void setApplyTime(Object applyTime) {
                this.applyTime = applyTime;
            }

            public Object getReviewTime() {
                return reviewTime;
            }

            public void setReviewTime(Object reviewTime) {
                this.reviewTime = reviewTime;
            }
        }

        public static class ProjectsBean {
            private int id;
            private double proPrice;
            private int proStatus;
            /**
             * id : 4
             * uuid : null
             * proName : 牙齿矫正
             * proType : 8
             * referPrice : 参考价格描述内容
             * technology : 技术手段描述内容
             * course : 手术疗程描述内容
             * suitCrowds : 事宜人群描述内容
             * effect : 治疗效果描述内容
             * cycle : 治疗描述内容
             * isHospital : 1
             * createTime : 1477291406000
             * updateTime : 1481769723000
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

            public int getProStatus() {
                return proStatus;
            }

            public void setProStatus(int proStatus) {
                this.proStatus = proStatus;
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
            private Object userName;
            /**
             * id : 2
             * uuid : null
             * title : null
             * evaluTarget : null
             * evaluType : 1
             * star : null
             * status : 0
             * startTime : null
             * endTime : null
             * createTime : 1483607126000
             * updateTime : 1483607126000
             * isDel : null
             * content : null
             */

            private KqEvaluBean kqEvalu;
            /**
             * id : 5
             * uuid : null
             * loginName : null
             * passwd : null
             * empName : 谷碧萱
             * positionId : null
             * empNumber : null
             * entryTime : null
             * room : null
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

            public Object getUserName() {
                return userName;
            }

            public void setUserName(Object userName) {
                this.userName = userName;
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
                private Object startTime;
                private Object endTime;
                private long createTime;
                private long updateTime;
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

                public Object getStartTime() {
                    return startTime;
                }

                public void setStartTime(Object startTime) {
                    this.startTime = startTime;
                }

                public Object getEndTime() {
                    return endTime;
                }

                public void setEndTime(Object endTime) {
                    this.endTime = endTime;
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
                private Object loginName;
                private Object passwd;
                private String empName;
                private Object positionId;
                private Object empNumber;
                private Object entryTime;
                private Object room;
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

                public Object getLoginName() {
                    return loginName;
                }

                public void setLoginName(Object loginName) {
                    this.loginName = loginName;
                }

                public Object getPasswd() {
                    return passwd;
                }

                public void setPasswd(Object passwd) {
                    this.passwd = passwd;
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

                public Object getEmpNumber() {
                    return empNumber;
                }

                public void setEmpNumber(Object empNumber) {
                    this.empNumber = empNumber;
                }

                public Object getEntryTime() {
                    return entryTime;
                }

                public void setEntryTime(Object entryTime) {
                    this.entryTime = entryTime;
                }

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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
            private int type;
            private String content;
            private int evaluId;
            private long createTime;
            private long updateTime;
            /**
             * id : 42
             * empName : 东门巧蕊
             * empNumber : A8723156
             * entryTime : null
             * room : null
             * sex : 0
             * createTime : null
             * updateTime : null
             * isDel : null
             * position : {"id":11,"uuid":null,"positionName":"培训老师","createTime":null,"updateTime":null,"isDel":null}
             */

            private EmpInfoBean empInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getEvaluId() {
                return evaluId;
            }

            public void setEvaluId(int evaluId) {
                this.evaluId = evaluId;
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

            public EmpInfoBean getEmpInfo() {
                return empInfo;
            }

            public void setEmpInfo(EmpInfoBean empInfo) {
                this.empInfo = empInfo;
            }

            public static class EmpInfoBean {
                private int id;
                private String empName;
                private String empNumber;
                private Object entryTime;
                private Object room;
                private int sex;
                private Object createTime;
                private Object updateTime;
                private Object isDel;
                /**
                 * id : 11
                 * uuid : null
                 * positionName : 培训老师
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

                public String getEmpNumber() {
                    return empNumber;
                }

                public void setEmpNumber(String empNumber) {
                    this.empNumber = empNumber;
                }

                public Object getEntryTime() {
                    return entryTime;
                }

                public void setEntryTime(Object entryTime) {
                    this.entryTime = entryTime;
                }

                public Object getRoom() {
                    return room;
                }

                public void setRoom(Object room) {
                    this.room = room;
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
    }
}
