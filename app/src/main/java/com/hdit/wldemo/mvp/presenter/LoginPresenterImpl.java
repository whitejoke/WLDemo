package com.hdit.wldemo.mvp.presenter;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.LoginModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.List;
import java.util.Map;

/**
 * Created by joker on 2016/11/15.
 */

public class LoginPresenterImpl extends BasePresenterImpl<BaseView.LoginView> implements BasePresenter.LoginPresenter,BaseDataBridge.LoginData {

    private final BaseModel.LoginModel loginModel;
    public LoginPresenterImpl(BaseView.LoginView view) {
        super(view);
        this.loginModel=new LoginModelImpl();
    }

    @Override
    public void addData(List<UserBean.ResultBean.DataBean> datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
//        view.hideFoot();
//        view.hideProgress();
//        view.netWorkError();
    }

    @Override
    public void requestNetWork(Context context,Map<String, String> map) {
        loginModel.netWorkLogin(context,map,this);
    }
}
