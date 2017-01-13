package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2017/1/13.
 */

public class ReviewPreferenModelImpl implements BaseModel.ReviewPreferenModel {
    @Override
    public void netWorkReviewPreferen(Map<String, String> map, final BaseDataBridge.ReviewPreferenData reviewPreferenData) {
        NetWorkRequest.reviewPreferen(map,new MySubscriber<PostNoBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                reviewPreferenData.error();
            }

            @Override
            public void onNext(PostNoBean postNoBean) {
                super.onNext(postNoBean);
                reviewPreferenData.addData(postNoBean);
            }
        });
    }
}
