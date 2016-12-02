package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/11/22.
 */

public class RegisterModelImpl implements BaseModel.RegisterModel {
    @Override
    public void netWorkRegister(Map<String, String> map, final BaseDataBridge.RegisterData registerData) {
        NetWorkRequest.registerDetail(map,new MySubscriber<PostNoBean>(){
            @Override
            public void onNext(PostNoBean postNoBean) {
                super.onNext(postNoBean);
                registerData.addData(postNoBean);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }
        });
    }
}
