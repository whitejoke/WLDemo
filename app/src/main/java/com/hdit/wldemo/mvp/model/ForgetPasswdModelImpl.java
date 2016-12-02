package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/11/25.
 */

public class ForgetPasswdModelImpl implements BaseModel.ForgetPasswdModel {
    @Override
    public void netWorkForgetPasswd(Map<String, String> map, final BaseDataBridge.ForgetPasswdData forgetPasswdData) {
        NetWorkRequest.forgetPasswd(map,new MySubscriber<ForgetPasswordBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onNext(ForgetPasswordBean forgetPasswordBean) {
                super.onNext(forgetPasswordBean);
                forgetPasswdData.addData(forgetPasswordBean);
            }
        });
    }
}
