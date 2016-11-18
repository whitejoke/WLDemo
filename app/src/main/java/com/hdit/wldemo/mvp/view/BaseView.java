package com.hdit.wldemo.mvp.view;

import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.UserBean;

import java.util.List;

/**
 * Created by joker on 2016/11/11.
 */

public interface BaseView<T> {
    void setData(List<T> datas);

    void netWorkError();

    void hideProgress();

    void showProgress();

    void showFoot();

    void hideFoot();

    interface MainView {

        void switchHome();

        void switchFlow();

        void switchMine();

    }
    interface HomeView {
        void setData(HomeBean datas);

        void netWorkError();

        void hideProgress();

        void showProgress();
    }

    interface LoginView extends BaseView<UserBean.ResultBean.DataBean>{}

}
