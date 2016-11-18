package com.hdit.wldemo.mvp.model;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/11/15.
 */

public class LoginModelImpl implements BaseModel.LoginModel {
    @Override
    public void netWorkLogin(Context context, Map<String, String> map, final BaseDataBridge.LoginData loginData) {
        NetWorkRequest.loginDetail(context,map,new MySubscriber<UserBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onNext(UserBean userBean) {
                super.onNext(userBean);
                loginData.addData(userBean.getResult().getData());
            }
        });
    }
}
