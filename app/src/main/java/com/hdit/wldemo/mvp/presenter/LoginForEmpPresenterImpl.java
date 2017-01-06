package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.LoginForEmpModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2017/1/3.
 */

public class LoginForEmpPresenterImpl extends BasePresenterImpl<BaseView.LoginForEmpView> implements BaseDataBridge.LoginForEmp,BasePresenter.LoginForEmpPresenter {

    private final BaseModel.LoginForEmpModel loginForEmpModel;
    public LoginForEmpPresenterImpl(BaseView.LoginForEmpView view) {
        super(view);
        this.loginForEmpModel=new LoginForEmpModelImpl();
    }

    @Override
    public void addData(UserForEmp datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(Map<String, String> map) {
        loginForEmpModel.netWorkLogin(map,this);
    }
}
