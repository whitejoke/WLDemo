package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/11/11.
 */

public class HomeModelImpl implements BaseModel.HomeModel{

    @Override
    public void netWorkNewList(Map<String,Integer> map, final BaseDataBridge.HomeData homeData) {
        NetWorkRequest.homeDetail(map,new MySubscriber<HomeBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                homeData.error();
            }

            @Override
            public void onNext(HomeBean homeBean) {
                super.onNext(homeBean);
                homeData.addData(homeBean);
            }
        });
    }
}
