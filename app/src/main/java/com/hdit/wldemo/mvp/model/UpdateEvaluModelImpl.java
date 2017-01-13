package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2017/1/11.
 */

public class UpdateEvaluModelImpl implements BaseModel.UpdateEvaluModel {
    @Override
    public void netWorkUpdateEvalu(Map<String, String> map, final BaseDataBridge.UpdateEvaluData updateEvaluData) {
        NetWorkRequest.updateEvalu(map,new MySubscriber<PostNoBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                updateEvaluData.error();
            }

            @Override
            public void onNext(PostNoBean postNoBean) {
                super.onNext(postNoBean);
                updateEvaluData.addData(postNoBean);
            }
        });
    }
}
