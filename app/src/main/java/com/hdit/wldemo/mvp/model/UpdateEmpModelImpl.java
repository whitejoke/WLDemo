package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2017/1/4.
 */

public class UpdateEmpModelImpl implements BaseModel.UpdateEmpModel {
    @Override
    public void netWorkUpdateEmp(Map<String, String> map, final BaseDataBridge.UpdataEmpData updataEmpData) {
        NetWorkRequest.updateEmp(map,new MySubscriber<PostNoBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                updataEmpData.error();
            }
            @Override
            public void onNext(PostNoBean postNoBean) {
                super.onNext(postNoBean);
                updataEmpData.addData(postNoBean);
            }
        });
    }
}
