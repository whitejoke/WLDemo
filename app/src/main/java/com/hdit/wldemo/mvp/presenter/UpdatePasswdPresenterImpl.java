package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.UpdatePasswdModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2016/11/25.
 */

public class UpdatePasswdPresenterImpl extends BasePresenterImpl<BaseView.updatePasswdView> implements BasePresenter.updatePasswd, BaseDataBridge.UpdataPasswdData {

    private final BaseModel.UpdatePasswdModel updatePasswdModel;
    public UpdatePasswdPresenterImpl(BaseView.updatePasswdView view) {
        super(view);
        updatePasswdModel=new UpdatePasswdModelImpl();
    }

    @Override
    public void requestNetWork(Map<String, String> map) {
        updatePasswdModel.netWorkUpdatePasswd(map,this);
    }

    @Override
    public void addData(PostNoBean datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }
}
