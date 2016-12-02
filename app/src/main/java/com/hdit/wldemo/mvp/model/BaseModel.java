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
    interface RegisterModel{
        void netWorkRegister(Map<String,String> map,BaseDataBridge.RegisterData registerData);
    }
    interface MemberModel{
        void netWorkMember(int userId,BaseDataBridge.MemberData memberData);
    }
    interface UpdatePasswdModel{
        void netWorkUpdatePasswd(Map<String,String> map,BaseDataBridge.UpdataPasswdData updataPasswdData);
    }
    interface ForgetPasswdModel{
        void netWorkForgetPasswd(Map<String,String> map,BaseDataBridge.ForgetPasswdData forgetPasswdData);
    }
}
