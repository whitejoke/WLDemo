package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.network.MySubscriber;
import com.hdit.wldemo.network.NetWorkRequest;

/**
 * Created by joker on 2016/11/22.
 */

public class MemberModelImpl implements BaseModel.MemberModel {
    @Override
    public void netWorkMember(int userId, final BaseDataBridge.MemberData memberData) {
        NetWorkRequest.memberDetail(userId,new MySubscriber<Member>(){
            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onNext(Member member) {
                super.onNext(member);
                memberData.addData(member);
            }
        });
    }
}
