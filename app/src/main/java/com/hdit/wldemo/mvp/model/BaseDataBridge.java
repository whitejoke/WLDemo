package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.Bean.UserBean;

import java.util.List;

/**
 * Created by joker on 2016/11/11.
 */

public interface BaseDataBridge<T> {
    void addData(List<T> datas);
    void error();
    interface HomeData {
        void addData(HomeBean datas);
        void error();
    }
    interface LoginData {
        void addData(UserBean datas);
    }

    interface RegisterData{
        void addData(PostNoBean datas);
    }
    interface MemberData{
        void addData(Member datas);
    }
    interface UpdataPasswdData{
        void addData(PostNoBean datas);
    }
    interface ForgetPasswdData{
        void addData(ForgetPasswordBean datas);
    }
}
