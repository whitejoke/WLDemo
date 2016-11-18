package com.hdit.wldemo.mvp.model;

import com.hdit.wldemo.mvp.Bean.HomeBean;
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
    interface LoginData extends BaseDataBridge<UserBean.ResultBean.DataBean>{}

}
