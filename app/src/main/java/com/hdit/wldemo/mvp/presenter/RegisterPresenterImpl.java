package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.RegisterModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2016/11/22.
 */

public class RegisterPresenterImpl extends BasePresenterImpl<BaseView.RegisterView> implements BasePresenter.RegisterPresenter,BaseDataBridge.RegisterData{

    private final BaseModel.RegisterModel registerModel;
    public RegisterPresenterImpl(BaseView.RegisterView view) {
        super(view);
        this.registerModel=new RegisterModelImpl();
    }

    @Override
    public void addData(PostNoBean datas) {
        view.setData(datas);
    }

    @Override
    public void requestNeyWork(Map<String, String> map) {
        registerModel.netWorkRegister(map,this);
    }
}
