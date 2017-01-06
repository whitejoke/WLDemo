package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.model.BaseDataBridge;
import com.hdit.wldemo.mvp.model.BaseModel;
import com.hdit.wldemo.mvp.model.MemberForEmpModelEmpl;
import com.hdit.wldemo.mvp.view.BaseView;

/**
 * Created by joker on 2017/1/4.
 */

public class MemberForEmpPresenterImpl extends BasePresenterImpl<BaseView.MemberForEmpView> implements BaseDataBridge.MemberForEmpData,BasePresenter.MemberForEmpPresenter {

    private final BaseModel.MemberForEmpModel memberForEmpModel;
    public MemberForEmpPresenterImpl(BaseView.MemberForEmpView view) {
        super(view);
        this.memberForEmpModel=new MemberForEmpModelEmpl();
    }

    @Override
    public void addData(MemberForEmp datas) {
        view.setData(datas);
    }

    @Override
    public void error() {
        view.netWorkError();
    }

    @Override
    public void requestNetWork(int empId) {
        memberForEmpModel.netWorkMemberForEmp(empId,this);
    }
}
