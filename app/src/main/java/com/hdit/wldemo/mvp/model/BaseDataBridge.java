package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
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
        void error();
    }
    interface LoginForEmp{
        void addData(UserForEmp datas);
        void error();
    }

    interface RegisterData{
        void addData(PostNoBean datas);
        void error();
    }
    interface MemberData{
        void addData(Member datas);
        void error();
    }
    interface MemberForEmpData{
        void addData(MemberForEmp datas);
        void error();
    }
    interface UpdataPasswdData{
        void addData(PostNoBean datas);
        void error();
    }
    interface ForgetPasswdData{
        void addData(ForgetPasswordBean datas);
        void error();
    }
    interface OrderDetailData{
        void addData(OrderDetail datas);
        void error();
    }
    interface ApplyData{
        void addData(ApplyBean datas);
        void error();
    }
    interface UpdataEmpData{
        void addData(PostNoBean datas);
        void error();
    }
}
