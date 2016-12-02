package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/11/25.
 */

public class UpdatePasswdModelImpl implements BaseModel.UpdatePasswdModel {
    @Override
    public void netWorkUpdatePasswd(Map<String, String> map,final BaseDataBridge.UpdataPasswdData updataPasswdData) {
        NetWorkRequest.updatePasswd(map,new MySubscriber<PostNoBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onNext(PostNoBean postNoBean) {
                super.onNext(postNoBean);
                updataPasswdData.addData(postNoBean);
            }
        });
    }
}
