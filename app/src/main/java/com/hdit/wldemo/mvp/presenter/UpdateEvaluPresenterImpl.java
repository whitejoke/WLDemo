package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.UpdateEvaluModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2017/1/11.
 */

public class UpdateEvaluPresenterImpl extends BasePresenterImpl<BaseView.updateEvalu> implements BasePresenter.updateEvalu,BaseDataBridge.UpdateEvaluData {
    private final BaseModel.UpdateEvaluModel updateEvaluModel;
    public UpdateEvaluPresenterImpl(BaseView.updateEvalu view) {
        super(view);
        this.updateEvaluModel=new UpdateEvaluModelImpl();
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
        updateEvaluModel.netWorkUpdateEvalu(map,this);
    }
}
