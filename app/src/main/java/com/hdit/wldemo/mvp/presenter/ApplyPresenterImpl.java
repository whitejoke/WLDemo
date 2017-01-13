package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.model.ApplyModelImpl;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.view.BaseView;

/**
 * Created by joker on 2016/12/29.
 */

public class ApplyPresenterImpl extends BasePresenterImpl<BaseView.applyDetail> implements BaseDataBridge.ApplyData,BasePresenter.applyPresenter {

    private final BaseModel.ApplyModel applyModel;
    public ApplyPresenterImpl(BaseView.applyDetail view) {
        super(view);
        this.applyModel=new ApplyModelImpl();
    }

    @Override
    public void addData(ApplyBean datas) {
        view.setData(datas);

    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(int userId) {
        applyModel.netWorkApply(userId,this);
    }
}
