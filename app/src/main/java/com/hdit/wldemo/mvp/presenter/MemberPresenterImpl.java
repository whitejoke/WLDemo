package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.MemberModelImpl;
import com.hdit.wldemo.mvp.view.BaseView;

/**
 * Created by joker on 2016/11/22.
 */

public class MemberPresenterImpl extends BasePresenterImpl<BaseView.MemberView> implements BasePresenter.MemberPresenter,BaseDataBridge.MemberData {

    private final BaseModel.MemberModel memberModel;
    public MemberPresenterImpl(BaseView.MemberView view) {
        super(view);
        this.memberModel=new MemberModelImpl();
    }

    @Override
    public void addData(Member datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNeyWork(int userId) {
        memberModel.netWorkMember(userId,this);
    }
}
