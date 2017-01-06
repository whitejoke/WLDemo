package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.ForgetPasswdModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2016/11/25.
 */

public class ForgetPasswdPresenterImpl extends BasePresenterImpl<BaseView.foegetPassword> implements BasePresenter.forgetPasswdPresenter,BaseDataBridge.ForgetPasswdData {

    private final BaseModel.ForgetPasswdModel forgetPasswdModel;
    public ForgetPasswdPresenterImpl(BaseView.foegetPassword view) {
        super(view);
        this.forgetPasswdModel=new ForgetPasswdModelImpl();
    }

    @Override
    public void addData(ForgetPasswordBean datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(Map<String, String> map) {
        forgetPasswdModel.netWorkForgetPasswd(map,this);
    }
}
