package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;
import com.hdit.wldemo.utils.LogUtils;

/**
 * Created by joker on 2017/1/4.
 */

public class MemberForEmpModelEmpl implements BaseModel.MemberForEmpModel {
    @Override
    public void netWorkMemberForEmp(int empId, final BaseDataBridge.MemberForEmpData memberForEmpData) {
        NetWorkRequest.memberForEmpDetail(empId,new MySubscriber<MemberForEmp>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                LogUtils.i("susu","model");
                memberForEmpData.error();
            }

            @Override
            public void onNext(MemberForEmp memberForEmp) {
                super.onNext(memberForEmp);
                LogUtils.i("susu","model");
                memberForEmpData.addData(memberForEmp);
            }
        });
    }
}
