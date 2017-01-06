package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2017/1/3.
 */

public class LoginForEmpModelImpl implements BaseModel.LoginForEmpModel {
    @Override
    public void netWorkLogin(Map<String, String> map, final BaseDataBridge.LoginForEmp loginForEmp) {
        NetWorkRequest.loginForEmpDetail(map,new MySubscriber<UserForEmp>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                loginForEmp.error();
            }

            @Override
            public void onNext(UserForEmp userForEmp) {
                super.onNext(userForEmp);
                loginForEmp.addData(userForEmp);
            }
        });
    }
}
