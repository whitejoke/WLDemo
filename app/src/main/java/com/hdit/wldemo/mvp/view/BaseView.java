package com.hdit.wldemo.mvp.view;

import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
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

        void switchMine();

    }
    interface HomeView {
        void setData(HomeBean datas);

        void netWorkError();

    }


    interface LoginView{
        void setData(UserBean datas);
    }

    interface RegisterView {
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface MemberView {
        void setData(Member datas);
        void netWorkError();
    }
    interface updatePasswdView{
        void setData(PostNoBean datas);
        void netWorkError();
    }
    interface foegetPassword{
        void setData(ForgetPasswordBean datas);
    }
}
