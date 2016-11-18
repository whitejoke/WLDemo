package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

/**
 * Created by joker on 2016/11/11.
 */

public class HomeModelImpl implements BaseModel.HomeModel{

    @Override
    public void netWorkNewList(int pageNum, int pageSize, final BaseDataBridge.HomeData homeData) {
        NetWorkRequest.homeDetail(pageNum,pageSize,new MySubscriber<HomeBean>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onNext(HomeBean homeBean) {
                super.onNext(homeBean);
                homeData.addData(homeBean);
            }
        });
    }
}
