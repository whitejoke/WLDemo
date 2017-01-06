package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

/**
 * Created by joker on 2016/12/29.
 */

public class ApplyModelImpl implements BaseModel.ApplyModel {
    @Override
    public void netWorkApply(int userId, final BaseDataBridge.ApplyData applyData) {
        NetWorkRequest.applyDetail(userId,new MySubscriber<ApplyBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                applyData.error();
            }

            @Override
            public void onNext(ApplyBean applyBean) {
                super.onNext(applyBean);
                applyData.addData(applyBean);
            }
        });
    }
}
