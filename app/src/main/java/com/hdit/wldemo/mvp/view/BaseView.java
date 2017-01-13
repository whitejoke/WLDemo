package com.hdit.wldemo.mvp.view;

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

public interface BaseView<T> {
    void setData(List<T> datas);

    void netWorkError();


    interface MainView {

        void switchHome();

        void switchFlow();

        void switchBusiness();

        void switchMine();

    }
    interface HomeView {
        void setData(HomeBean datas);

        void netWorkError();

    }


    interface LoginView{
        void setData(UserBean datas);
        void netWorkError();
    }
    interface LoginForEmpView{
        void setData(UserForEmp datas);
        void netWorkError();
    }

    interface RegisterView {
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface MemberView {
        void setData(Member datas);
        void netWorkError();
    }
    interface MemberForEmpView {
        void setData(MemberForEmp datas);
        void netWorkError();
    }
    interface updatePasswdView{
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface foegetPassword{
        void setData(ForgetPasswordBean datas);
        void netWorkError();
    }
    interface orderDetail{
        void setData(OrderDetail datas);
        void netWorkError();
    }
    interface applyDetail{
        void setData(ApplyBean datas);
        void netWorkError();
    }
    interface updateEmp{
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface updateEvalu{
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface reviewPreferen{
        void setData(PostNoBean datas);
        void netWorkError();
    }
}
