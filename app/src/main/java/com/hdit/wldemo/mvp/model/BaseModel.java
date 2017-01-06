package com.hdit.wldemo.mvp.model;

import android.content.Context;

import java.util.Map;

/**
 * Created by joker on 2016/11/11.
 */

public interface BaseModel<T> {
    void network(T model, Context context);

    interface HomeModel {
        void netWorkNewList(Map<String,Integer> map, BaseDataBridge.HomeData homeData);
    }
    interface LoginModel{
        void netWorkLogin(Context context, Map<String,String> map,BaseDataBridge.LoginData loginData);
    }
    interface LoginForEmpModel{
        void netWorkLogin(Map<String,String> map,BaseDataBridge.LoginForEmp loginForEmp);
    }
    interface RegisterModel{
        void netWorkRegister(Map<String,String> map,BaseDataBridge.RegisterData registerData);
    }
    interface MemberModel{
        void netWorkMember(int userId,BaseDataBridge.MemberData memberData);
    }
    interface MemberForEmpModel{
        void netWorkMemberForEmp(int empId,BaseDataBridge.MemberForEmpData memberForEmpData);
    }
    interface UpdatePasswdModel{
        void netWorkUpdatePasswd(Map<String,String> map,BaseDataBridge.UpdataPasswdData updataPasswdData);
    }
    interface ForgetPasswdModel{
        void netWorkForgetPasswd(Map<String,String> map,BaseDataBridge.ForgetPasswdData forgetPasswdData);
    }
    interface OrderDetailModel{
        void netWorkOrderDetail(Map<String,String> map,BaseDataBridge.OrderDetailData orderDetailData);
    }
    interface ApplyModel{
        void netWorkApply(int userId,BaseDataBridge.ApplyData applyData);
    }
    interface UpdateEmpModel{
        void netWorkUpdateEmp(Map<String,String> map,BaseDataBridge.UpdataEmpData updataEmpData);
    }
}
