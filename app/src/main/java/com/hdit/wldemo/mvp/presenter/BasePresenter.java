package com.hdit.wldemo.mvp.presenter;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.HomeBean;

import java.util.Map;

/**
 * Created by joker on 2016/11/11.
 */

public interface BasePresenter {

    interface MainViewPresenter {
        void switchId(int id);
    }

    interface HomePresenter {
        void requestNetWork(int pageNum,int pageSize);

        void onClick(HomeBean info);
    }
    interface LoginPresenter{
        void requestNetWork(Context context,Map<String, String> map);
    }
}
