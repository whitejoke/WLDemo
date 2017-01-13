package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.ReviewPreferenModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.Map;

/**
 * Created by joker on 2017/1/13.
 */

public class ReviewPreferenPresenterImpl extends BasePresenterImpl<BaseView.reviewPreferen> implements BasePresenter.reviewPreferen,BaseDataBridge.ReviewPreferenData {
    private final BaseModel.ReviewPreferenModel reviewPreferenModel;
    public ReviewPreferenPresenterImpl(BaseView.reviewPreferen view) {
        super(view);
        this.reviewPreferenModel=new ReviewPreferenModelImpl();
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
        reviewPreferenModel.netWorkReviewPreferen(map,this);
    }
}
