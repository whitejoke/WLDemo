package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.UpdateEmpModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2017/1/4.
 */

public class UpdateEmpPresenterImpl extends BasePresenterImpl<BaseView.updateEmp> implements BaseDataBridge.UpdataEmpData,BasePresenter.updateEmp {

    private final BaseModel.UpdateEmpModel updateEmpModel;
    public UpdateEmpPresenterImpl(BaseView.updateEmp view) {
        super(view);
        this.updateEmpModel=new UpdateEmpModelImpl();
    }

    @Override
    public void addData(PostNoBean datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(Map<String, String> map) {
        updateEmpModel.netWorkUpdateEmp(map,this);
    }
}
