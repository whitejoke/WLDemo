package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

import java.util.Map;

/**
 * Created by joker on 2016/12/21.
 */

public class OrderDetailModelImpl implements BaseModel.OrderDetailModel {
    @Override
    public void netWorkOrderDetail(Map<String, String> map, final BaseDataBridge.OrderDetailData orderDetailData) {
        NetWorkRequest.orderDetail(map, new MySubscriber<OrderDetail>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                orderDetailData.error();
            }

            @Override
            public void onNext(OrderDetail orderDetail) {
                super.onNext(orderDetail);
                orderDetailData.addData(orderDetail);
            }
        });
    }
}
