package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.activity.DetailActivity;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.HomeModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

/**
 * Created by joker on 2016/11/11.
 */

public class HomePresenterImpl extends BasePresenterImpl<BaseView.HomeView> implements BasePresenter.HomePresenter,BaseDataBridge.HomeData {

    private final BaseModel.HomeModel homeModel;

    public HomePresenterImpl(BaseView.HomeView view) {
        super(view);
        this.homeModel=new HomeModelImpl();
    }


    @Override
    public void addData(HomeBean datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }


    @Override
    public void requestNetWork(int pageNum, int pageSize) {
        homeModel.netWorkNewList(pageNum,pageSize,this);
    }

    @Override
    public void onClick(HomeBean.ResultBean.DataBean.NewsBean info) {
        DetailActivity.startIntent(info.getId(),info.getContent());
    }
}
