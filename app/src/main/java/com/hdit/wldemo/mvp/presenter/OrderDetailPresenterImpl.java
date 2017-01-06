package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.OrderDetailModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2016/12/21.
 */

public class OrderDetailPresenterImpl extends BasePresenterImpl<BaseView.orderDetail> implements BasePresenter.orderDetailPresenter,BaseDataBridge.OrderDetailData {

    private final BaseModel.OrderDetailModel orderDetailModel;
    public OrderDetailPresenterImpl(BaseView.orderDetail view) {
        super(view);
        this.orderDetailModel=new OrderDetailModelImpl();
    }

    @Override
    public void addData(OrderDetail datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(Map<String, String> map) {
        orderDetailModel.netWorkOrderDetail(map,this);
    }
}
