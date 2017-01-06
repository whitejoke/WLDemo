package com.hdit.wldemo.network;

/**
 * Created by joker on 2016/11/10.
 */

public class Api {
    //薇琳Api
    public static final String BASE_API_WL = "http://192.168.1.188:8070/";

    //注册
    public static final String BUILDARCHIVE="common/buildArchive.do";

    //登录
    public static final String LOGIN="common/login.do";

    //首页
    public static final String GETNEWS="common/getNews.do";

    //档案列表
    public static final String GETUSERARCHIVE="common/getUserArchive.do";

    //密码修改
    public static final String UPDATEPASSWD="common/updatePasswd.do";

    //找回密码
    public static final String FORGETPASSWD="common/forgetPasswd.do";

    //订单
    public static final String GETORDERDETAIL="order/getOrderDetail.do";

    //优惠
    public static final String GETPREFERENAPPLY="preferen/getPreferenApply.do";

    //员工信息
    public static final String GETEMPINFO="employee/getEmpInfo.do";

    //修改员工信息
    public static final String UPDATEEMPLOYEE="employee/updateEmployee.do";


    //职务管理
    public static final String UPDATEPOSITION="position/updatePosition.do";

    //职务列表
    public static final String GETPOSITION="position/getPosition.do";

    //咨询接待
    public static final String UPDATEADVICE="advice/updateAdvice.do";

    //咨询列表
    public static final String GETADVICEFETAIL="advice/getAdviceDetail.do";

    //咨询师签到
    public static final String ADVISERSIGN="advice/adviserSign.do";

    //意向单管理
    public static final String UPDATEINTENTION="intention/updateIntention.do";

    //意向单列表
    public static final String GETINTENTIONDETAIL="intention/getIntentionDetail.do";

    //项目管理
    public static final String UPDATEPROJECT="project/updateProject.do";

    //项目列表
    public static final String GETPROJECT="project/getProject.do";

    //分类管理
    public static final String UPDATEPROCLASS="project/updateProClass.do";

    //分类列表
    public static final String GETPROCLASS="project/getProClass.do";

    //套餐管理
    public static final String UPDATEPACKAGE="package/updatePackage.do";

    //套餐列表
    public static final String GETPACKAGE="package/getPackage.do";

    //套餐详情
    public static final String GETPACKAGEDETAIL="package/getPackageDetail.do";

    //订单管理
    public static final String UPDATEORDER="order/updateOrder.do";

    //订单列表
    public static final String GETORDER="order/getOrder.do";

}
